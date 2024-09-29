
import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SerializationTest {


    public static void main(String[] args) {
        read();
    }
    
    public static void read()
    {
        File file=new File("person.bin");
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        
        try {
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            Person person=(Person)objectInputStream.readObject();
            System.out.println(person.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(objectInputStream!=null)
            {
                try {
                    objectInputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
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
    
    public static void write()
    {
        Person person=new Person();
        person.setSchoolNumber(10000);
        person.setName("Mia");
        person.setSurname("Maya");
        person.setClassNumber("1.A");
        System.out.println(person.toString());
        
        File file=new File("person.bin");
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        
        try {
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        } catch (Exception e) {
        }
        finally{
            if(objectOutputStream!=null)
            {
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
            if(fileOutputStream!=null)
            {
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
    
}
