
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TxtDownloaderTest {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Please, enter an URL:");
        String urlPath=scan.nextLine();
        scan.close();
        
        try {
            URL url=new URL(urlPath);
            HttpURLConnection connection=(HttpURLConnection)url.openConnection();
            InputStream inputStream=connection.getInputStream();
            FileOutputStream fileOutputStream=new FileOutputStream(String.valueOf(System.currentTimeMillis()));
            byte[] buffer=new byte[1024];
            int length=0;
            while((length=inputStream.read(buffer))!=-1)
            {
                fileOutputStream.write(Arrays.copyOfRange(buffer, 0, length));
                
            }
            fileOutputStream.close();
            inputStream.close();
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
