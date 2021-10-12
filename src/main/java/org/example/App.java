package org.example;
import java.io.*;

public class App
{
    public static void main( String[] args )
    {
        CreateDirectories directories = new CreateDirectories();
        FileSortByExtension file = new FileSortByExtension();
        if (directories.listFilesForFolder(new File("HOME")) == true)
        {
            FileSortByExtension.moveFiles(new File["HOME"]);
        }
    }

}
