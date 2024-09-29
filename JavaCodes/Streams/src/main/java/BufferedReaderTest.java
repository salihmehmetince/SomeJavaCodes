
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BufferedReaderTest {

    
    public static void main(String[] args) {
        write();
    }
    
    public static void write()
    {
        File file=new File("test4.txt");
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        
        try {
            fileWriter=new FileWriter(file);
            bufferedWriter=new BufferedWriter(fileWriter);
            Scanner scan=new Scanner(System.in);
            String line=null;
            while(!(line=scan.nextLine()).equals("q"))
            {
                bufferedWriter.write(line);
                bufferedWriter.flush();//opsiyonel
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(bufferedWriter!=null)
            {
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if(fileWriter!=null)
            {
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    public static void read(){
        File file=new File("lorem_lower.txt");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null)
            {
                System.out.println(line);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            if(bufferedReader!=null)
            {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
            if(fileReader!=null)
            {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
