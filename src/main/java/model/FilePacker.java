package main.java.model;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Packs the manifest and project files into a ZIP folder
 */
public class FilePacker {

    public boolean packToZip(File srcDir) {
        File file = new File(srcDir.getParentFile().getAbsolutePath() + "importMe.zip");
        if (srcDir != null) {
            return pack(srcDir.toPath(), file);
        } else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "Error: the packer received null files.");
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
            return false;
        }
    }

    private boolean pack(final Path folder, File zipFile) {
        try (
                FileOutputStream fos = new FileOutputStream(zipFile);
                ZipOutputStream zos = new ZipOutputStream(fos)
        ) {
            Files.walkFileTree(folder, new SimpleFileVisitor<Path>() {
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    zos.putNextEntry(new ZipEntry(folder.relativize(file).toString()));
                    Files.copy(file, zos);
                    zos.closeEntry();
                    return FileVisitResult.CONTINUE;
                }

                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    zos.putNextEntry(new ZipEntry(folder.relativize(dir).toString() + "/"));
                    zos.closeEntry();
                    return FileVisitResult.CONTINUE;
                }
            });
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "An error occurred while packing the files.\n" +
                    e.getMessage());
            alert.showAndWait()
                    .filter(response -> response == ButtonType.OK);
            return false;
        }
    }

}
