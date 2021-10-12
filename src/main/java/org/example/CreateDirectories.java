package org.example;
import java.io.*;

public class CreateDirectories {
    public static void main(String[] args) {
        //object of File class with file path and name
        File dir1 = new File("HOME");
        File dir2 = new File("DEV");
        File dir3 = new File("TEST");

        //method 'mkdir' to create directroy and result
        //is getting stored in 'isDirectoryCreated'
        //which will be either 'true' or 'false'
        boolean isDirectoryCreated = dir1.mkdir();

        //displaying results
        if (isDirectoryCreated)
            System.out.println("Directories successfully created: " + dir1 + ", " + dir2 + ", " + dir3 + "." );
        else
            System.out.println("Directory was not created successfully: " + dir1);
    }
    public void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }
}