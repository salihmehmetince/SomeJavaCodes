
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class WriteToAFileTest {


    public static void main(String[] args) {
        read();
    }
    
    public static void write()
    {
        File file=new File("test2.dat");
        FileOutputStream fileOutputStream=null;
        Scanner scan=new Scanner(System.in);
        try{
            fileOutputStream=new FileOutputStream(file);
            String line=null;
            
            while(!(line=scan.nextLine()).equals("q"))
            {
                fileOutputStream.write(line.getBytes());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally{
            try {
                fileOutputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static void read()
    {
        File file=new File("test2.dat");
        
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(file);
            int line=0;
            while((line=fileInputStream.read())!=-1)
            {
                System.out.println(line+":Line"+",normal:"+(char)line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        finally{
            if(fileInputStream!=null)
            {
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
