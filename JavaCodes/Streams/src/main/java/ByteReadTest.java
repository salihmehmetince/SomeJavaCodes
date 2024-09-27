
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ByteReadTest {


    public static void main(String[] args) {
        File file=new File("C:\\Users\\HP\\Desktop\\SomeJavaCodes\\JavaCodes\\tree.jpg");
        if(file.exists())
        {
            FileInputStream fileInputStream=null;
            
            try{
                fileInputStream=new FileInputStream(file);
                byte[] buffer=new byte[1024];
                int lenght=0;
                while((lenght=fileInputStream.read(buffer))!=-1)
                {
                    System.out.println(Arrays.toString(buffer));
                }
                
            }
            catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
            finally{
                try {
                    fileInputStream.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
    
}
