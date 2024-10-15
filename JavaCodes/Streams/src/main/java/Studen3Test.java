
import java.util.Iterator;


public class Studen3Test {


    public static void main(String[] args) {
        Student3 student=new Student3("Julia", new int[]{90,80,20,100,35});
        
        Iterator<Integer> iter=student.iterator();
        
        while(iter.hasNext())
        {
            System.out.println(iter.next()+"\t");
        }
    }
    
}
