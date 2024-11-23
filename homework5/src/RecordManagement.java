import java.io.*;
import java.util.Scanner;

public class RecordManagement {
    public void writeData(String filename, String data){
        FileWriter writer = null;
        try{
            File file = new File(filename + ".txt");
            writer = new FileWriter(file);
            writer.write(data);
            writer.write(data);
            writer.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void appendData(String filename, String data){
        FileWriter writer = null;
        try{
            File file = new File(filename + ".txt");
            writer = new FileWriter(file, true);
            writer.write(data);
            writer.close();
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFile(String filename){
        try{
            File file = new File(filename + ".txt");
            file.delete();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFile(String filename){
        Scanner reader = null;
        try{
            File file = new File(filename + ".txt");
            reader = new Scanner(file);
            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }
            reader.close();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
