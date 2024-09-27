
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileWriterTest {


    public static void main(String[] args) {
        System.out.println("Dosya yolunu giriniz:");
        Scanner scan=new Scanner(System.in);
        String filePath=scan.nextLine();
        File file=new File(filePath);
        
        if(!file.exists())
        {
            try {
                boolean didCreate=file.createNewFile();
                if(didCreate){
                    System.out.println("The File created");
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
        }
        
        FileWriter fileWriter=null;
        
        try{
            fileWriter=new FileWriter(file);
            String row=null;
            
            do{
                row=scan.nextLine();
                fileWriter.write(row);
                fileWriter.write(System.lineSeparator());
            }while(!row.equals("q"));
            
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            try {
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("Wrote to the file:");
        System.out.println("File length:"+file.length()+"Bytes");
    }
    
}
