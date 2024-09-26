import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FileTest {


    public static void main(String[] args) {
        /*File file=new File("C:\\Users\\HP\\Desktop\\SomeJavaCodes\\JavaCodes\\Streams\\hello.txt");
        
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(new Date(file.lastModified()));
        
        File file2=new File("C:\\Users\\HP\\Desktop\\SomeJavaCodes\\JavaCodes\\Streams\\test.txt");
        
        if(!file2.exists())
        {
            try {
                file2.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        if(file2.exists())
        {
            boolean isDeleted=file2.delete();
            System.out.println(isDeleted);
        }*/
        System.out.print("Please enter a path:");
        System.out.flush();
        Scanner scan=new Scanner(System.in);
        String path=scan.nextLine().trim();
        
        File file=new File(path);
        String[] files=file.list();
        
        for (int i=0;i<files.length;i++)
        {
            System.out.println(files[i]);
        }
        scan.close();
    }
    
}
