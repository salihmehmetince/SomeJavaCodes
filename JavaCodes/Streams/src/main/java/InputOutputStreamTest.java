
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InputOutputStreamTest {


    public static void main(String[] args) {
        //write();
        read();
    }
    
    public static void write()
    {
        File file=new File("test.txt");
        FileOutputStream fileOutputStream=null;
        
        try{
            fileOutputStream=new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);
            outputStreamWriter.write("Hello,world");
            outputStreamWriter.close();
            
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            if(fileOutputStream!=null)
            {
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    
    public static void read()
    {
        File file=new File("test.txt");
        FileInputStream fileInputStream=null;
        InputStreamReader inputStreamReader=null;
        BufferedReader bufferedReader=null;
        try{
            fileInputStream=new FileInputStream(file);
            inputStreamReader=new InputStreamReader(fileInputStream);
            bufferedReader=new BufferedReader(inputStreamReader);
            
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            if(bufferedReader!=null)
            {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
            if(inputStreamReader!=null)
            {
                try {
                    inputStreamReader.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if(fileInputStream!=null)
            {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}
