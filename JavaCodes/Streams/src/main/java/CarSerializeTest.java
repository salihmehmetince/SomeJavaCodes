
import com.sun.corba.se.impl.io.IIOPOutputStream;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class CarSerializeTest {


    public static void main(String[] args) {
        Engine engine=new Engine(2000);
        Car car=new Car("DA123","AUDI","A3",2020,engine);
        System.out.println(car.toString());
        //write(car);
        read();
    }
    public static void read()
    {
        File file=new File("CarTest.bin");
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        
        try {
            fileInputStream=new FileInputStream(file);
            objectInputStream=new ObjectInputStream(fileInputStream);
            Car car=(Car) objectInputStream.readObject();
            System.out.println(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                if(objectInputStream!=null)
                    {
                        objectInputStream.close();
                    }
                
                if(fileInputStream!=null)
                    {
                        fileInputStream.close();
                    }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
    
    public static void write(Object object)
    {
        File file=new File("CarTest.bin");
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        
        try {
            fileOutputStream=new FileOutputStream(file);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(objectOutputStream!=null)
                {
                    objectOutputStream.close();
                }
                if(fileOutputStream!=null)
                {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
