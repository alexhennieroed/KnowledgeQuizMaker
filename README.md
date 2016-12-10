# Knowledge Quiz Maker

## Description
This program is designed to take in a .txt file, convert it to a .xml file, and pack it into a .zip file to be imported as a quiz on T-Square.
This is much easier than creating them with the tool on the site as there are not any long waiting times for questions to be generated by the site.

The program currently supports multiple choice, true false, and essay style questions.
Future updates will add compatibility for matching questions and adding image attachments.

## Text File Creation
A sample text file is included in the repository under the name "test.txt" that has all of this data.
Generally, the format of the file is as follows:

A header with the quiz name, start date, and end date. It ends with a tilde.
A body of questions with the typecode and responses, if necessary; if there are responses, the correct one is denoted by an asterisk.
Questions are separated by a tilde.

Typecodes are as follows:
MC - Multiple Choice,
TF - True False,
ES - Essay
