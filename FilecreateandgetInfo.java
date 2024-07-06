//This program shows how to create a File and get information of the file in Java

import java.io.File;
import java.io.IOException;
public class FilecreateandgetInfo {
    public static void main(String args[])
    {
        try
        {
            File obj = new File("File.txt");
            if(obj.createNewFile())
            {
                System.out.println(obj.getName());
            }
            else
            {
                System.out.println("File already exists!");
            }
            if(obj.exists())
            {
                System.out.println("File name = "+obj.getName());
                System.out.println("File path = "+obj.getAbsolutePath());
                System.out.println("File can be read = "+obj.canRead());
                System.out.println("File can be written = "+obj.canWrite());
                System.out.println("File length in bytes = "+obj.length());
            }
        }
        catch(IOException ex)
        {
            System.out.println("An error occurred");
        }
    }
}