package main.java.model;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * The utility class that converts the files
 * @author Alexander Hennie-Roed
 * @version 1.0.0
 */
public class FileProcessor {

    //Header string variables
    private String name;
    private String startDate;
    private String endDate;

    private FileDataHolder fdh;

    public FileProcessor() {
        fdh = new FileDataHolder();
    }

    /**
     * Converts the text file to the proper XML file
     * @param oldFile the text file to convert
     * @param newFile the converted XML file destination
     * @return a boolean representing the success of the operation
     */
    public boolean convertFile(File oldFile, File newFile) {
        try {
            PrintStream printStream = new PrintStream(newFile);
            Scanner scanner = new Scanner(oldFile);
            String[] data = readFromFile(scanner);
            String[] convData = convertData(data);
            writeToFile(printStream, convData);
            scanner.close();
            printStream.close();
            File manifest = new File(newFile.getParentFile(), "imsmanifest.xml");
            PrintStream stream = new PrintStream(manifest);
            stream.println(fdh.getMfst1() + newFile.getName() + fdh.getMfst2());
            stream.close();
            return true;
        } catch (NumberFormatException n) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "Error: " + n.getMessage());
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
            return false;
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "Error: could not find specified file.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
            return false;
        }
    }

    /**
     * Reads data from the text file
     * @param scanner the scanner for the file
     * @return a string array of the data from the file
     */
    private String[] readFromFile(Scanner scanner) {
        String data = "";
        while (scanner.hasNextLine()) {
            data += scanner.nextLine() + System.getProperty("line.separator");
        }
        return data.split("~" + System.getProperty("line.separator"));
    }

    /**
     * Converts the text data to the XML format
     * @param data the data to convert
     * @return a 2D array of the data
     */
    private String[] convertData(String[] data)
            throws NumberFormatException {
        String[] correctMultChoice = {"Incorrect", "Incorrect", "Incorrect", "Incorrect"};
        String[] correctTrueFalse = {"Incorrect", "Incorrect"};
        String[][] returnData = new String[data.length - 1][5];
        String[] returnArray = new String[returnData.length];
        //Get the name and date data
        String[] splitHeader = data[0].split(System.getProperty("line.separator"));
        name = splitHeader[0];
        startDate = splitHeader[1] + "T160000-0400";
        endDate = splitHeader[2] + "T201500-0400";
        //Put the rest of the strings into a 2D array for easy access
        for (int i = 1; i < data.length; i++) {
            returnData[i - 1] = data[i].split(System.getProperty("line.separator"));
        }
        //Convert the strings to XML
        for (int i = 0; i < returnData.length; i++) {
            boolean multChoice = false;
            boolean mcDone = false;
            boolean trueFalse = false;
            boolean tfDone = false;
            //Do checks of the codes
            for (String s : returnData[i]) {
                int index = s.indexOf(". ");
                String code = s.substring(0, index + 2);
                String rest = s.substring(index + 2);
                if (code.toUpperCase().contains("MC")) {
                    //Multiple Choice
                    multChoice = true;
                    returnArray[i] = fdh.getMc1() + rest + fdh.getMc2();
                } else if (code.toUpperCase().contains("TF")) {
                    //True False
                    trueFalse = true;
                    returnArray[i] = fdh.getTf1() + rest + fdh.getTf2();
                } else if (code.toUpperCase().contains("ES")) {
                    //Essay
                    returnArray[i] = fdh.getEs1() + rest + fdh.getEs2();
                } else if (multChoice) {
                    //It's a response, so check which one it is
                    if (code.toUpperCase().contains("A") && !mcDone) {
                        returnArray[i] += fdh.getMcra1() + rest + fdh.getMcra2();
                        if (code.contains("*")) {
                            correctMultChoice[0] = "Correct";
                        }
                    } else if (code.toUpperCase().contains("B") && !mcDone) {
                        returnArray[i] += fdh.getMcrb1() + rest + fdh.getMcrb2();
                        if (code.contains("*")) {
                            correctMultChoice[1] = "Correct";
                        }
                    } else if (code.toUpperCase().contains("C") && !mcDone) {
                        returnArray[i] += fdh.getMcrc1() + rest + fdh.getMcrc2();
                        if (code.contains("*")) {
                            correctMultChoice[2] = "Correct";
                        }
                    } else if (code.toUpperCase().contains("D") && !mcDone) {
                        returnArray[i] += fdh.getMcrd1() + rest + fdh.getMcrd2();
                        if (code.contains("*")) {
                            correctMultChoice[3] = "Correct";
                        }
                        mcDone = true;
                    } else {
                        throw new NumberFormatException("No matching multiple choice answer code found in question #" + (i+1));
                    }
                } else if (trueFalse) {
                    if (rest.toUpperCase().equals("TRUE") && !tfDone) {
                        if (code.contains("*")) {
                            correctTrueFalse[0] = "Correct";
                        }
                    } else if (rest.toUpperCase().equals("FALSE") && !tfDone) {
                        if (code.contains("*")) {
                            correctTrueFalse[1] = "Correct";
                        }
                        tfDone = true;
                    } else {
                        throw new NumberFormatException("No matching true false answer code found in question #" + (i+1));
                    }
                } else {
                    throw new NumberFormatException("No matching question code found for question #" + (i+1));
                }
                if (mcDone) {
                    if (checkResponseArray(correctMultChoice)) {
                        returnArray[i] += (fdh.getMc3() + fdh.getMcra3() + correctMultChoice[0] + fdh.getMcra4()
                                + fdh.getMcrb3() + correctMultChoice[1] + fdh.getMcrb4() + fdh.getMcrc3()
                                + correctMultChoice[2] + fdh.getMcrc4() + fdh.getMcrd3() + correctMultChoice[3]
                                + fdh.getMcrd4() + fdh.getMc4());
                    } else {
                        throw new NumberFormatException("No correct answer provided for question #" + (i+1));
                    }
                }
                if (tfDone) {
                    if (checkResponseArray(correctTrueFalse)) {
                        returnArray[i] += (fdh.getTfrt1() + correctTrueFalse[0] + fdh.getTfrt2()
                                + fdh.getTfrf1() + correctTrueFalse[1] + fdh.getTfrf2());
                    } else {
                        throw new NumberFormatException("No correct answer provided for question #" + (i+1));
                    }
                }
            }
        }
        return returnArray;
    }

    /**
     * Checks to see if the response array has been changed
     * @param arr the array to check
     * @return a boolean telling if the array has been changed
     */
    private boolean checkResponseArray(String[] arr) {
        for (String str : arr) {
            if (str.toUpperCase().equals("CORRECT")) {
                return true;
            }
        }
        return false;
    }

    /**
     * Writes the converted data to an XML file
     * @param stream the print stream to write with
     * @param data the data to write
     */
    private void writeToFile(PrintStream stream, String[] data) {
        //Write the header
        stream.println(fdh.getHeader1() + name + fdh.getHeader2() + startDate +
            fdh.getHeader3() + endDate + fdh.getHeader4());
        //Write the body
        for (String s : data) {
            stream.println(s);
        }
        //Write the ending
        stream.println(fdh.getEnd());
    }

}
