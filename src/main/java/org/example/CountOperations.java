package org.example;
import java.io.*;

public class CountOperations {

    public static void main(String[] args) throws Exception
    {
        File yourFile = new File("count.txt");
        yourFile.createNewFile(); // if file already exists will do nothing
        FileOutputStream oFile = new FileOutputStream(yourFile, false);

        // Check if the specified file
        // Exists or not
        if (yourFile.exists())
            CountOperations.addCount();
    }
    private static void addCount(int id) {
        int ktoryTypOperacji = id;
        if (ktoryTypOperacji = 1)
        {
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);
            {
                p.println("parzysta");
            }
        }
        else if (ktoryTypOperacji = 1)
            {
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);
                {
                    p.println("parzysta");
                }
            }
        else if (ktoryTypOperacji = 2)
            {
                BufferedWriter b = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(b);
                {
                    p.println("nieparzysta");
                }
            }
        else if (ktoryTypOperacji = 3)
        {
            BufferedWriter b = new BufferedWriter(f);
            PrintWriter p = new PrintWriter(b);
            {
                p.println("xml");
            }
        }
    }


}
