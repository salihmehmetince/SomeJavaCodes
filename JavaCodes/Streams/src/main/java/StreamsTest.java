import com.sun.imageio.plugins.jpeg.JPEG;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class StreamsTest {

    public static void main(String[] args) {
        
        //open an output stream to send from the application to the txt file
        /*File file=new File("hello.txt");
        FileOutputStream fileOutputStream=null;
        try{
            fileOutputStream=new FileOutputStream(file);
            fileOutputStream.write("Hello,world".getBytes());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fileOutputStream!=null)
                {
                    fileOutputStream.close();
                }
            }catch(IOException e){
                System.out.println(e.getMessage());
            }
        }*/
        
        //open an input stream to get from the txt file to the application
        /*File file=new File("hello.txt");
        
        FileInputStream fileInputStream=null;
        
        try{
            fileInputStream=new FileInputStream(file);
            int character=0;
            while((character=fileInputStream.read())!=-1)
            {
                System.out.print((char)character);
            }
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if(fileInputStream!=null)
                {
                    fileInputStream.close();
                }
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }*/
    }
    
}
