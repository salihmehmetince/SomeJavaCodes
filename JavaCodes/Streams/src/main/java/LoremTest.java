
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoremTest {


    public static void main(String[] args) {
        File file_lower=new File("lorem_lower.txt");
        File file_upper=new File("lorem_upper.txt");

        if(file_lower.exists())
        {
            FileInputStream fileInputStream=null;
            FileOutputStream fileOutputStream=null;
            try {
                fileInputStream=new FileInputStream(file_lower);
                fileOutputStream=new FileOutputStream(file_upper);
                int counter=0;
                while((counter=fileInputStream.read())!=-1)
                {
                    char character=(char)counter;
                    fileOutputStream.write(Character.toUpperCase(character));
                    System.out.println(counter);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }finally{
                if(fileInputStream!=null)
                {
                    try {
                        fileInputStream.close();
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                
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
        else
        {
            System.out.println("The File couldn't find");
        }
    }
    
}
