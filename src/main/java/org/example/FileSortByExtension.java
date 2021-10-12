package org.example;

import org.apache.commons.io.FilenameUtils;
import static org.apache.commons.io.comparator.ExtensionFileComparator.*;

import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FileSortByExtension {
    public static void main(String[] args) {
        File file = new File(".");

        // Excludes directory in the list
        File[] files = file.listFiles(File::isFile);

        if (files != null) {
            // Sort in ascending order.
            Arrays.sort(files, EXTENSION_COMPARATOR);
            FileSortByExtension.moveFiles(files);
        }
    }

    private static void moveFiles(File[] files) {
        for (File file : files) {
            Path filePath = file.toPath();
            BasicFileAttributes attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
            long hours = attributes.creationTime().to(TimeUnit.HOURS);
            if (FilenameUtils.getExtension(file.getName()) = ".jar" && attributes.creationTime(hours % 2 ==0))
            {
                Files.move(Paths.get("/HOME/"), Paths.get("/DEV/"));
                CountOperations.addCount(1);
            }
            else if (FilenameUtils.getExtension(file.getName()) = ".jar" && attributes.creationTime(hours % 2 !=0))
            {
                Files.move(Paths.get("/HOME/"), Paths.get("/TEST/"));
                CountOperations.addCount(2);
            }
            else if (FilenameUtils.getExtension(file.getName()) = ".xml")
            {
                Files.move(Paths.get("/HOME/"), Paths.get("/DEV/"));
                CountOperations.addCount(3);
            }
        }
    }
}
