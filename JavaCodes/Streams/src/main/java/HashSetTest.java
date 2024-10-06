
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {


    public static void main(String[] args) {
        /*HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("abcde");
        hashSet.add("bacde");
        hashSet.add("adcbe");
        hashSet.add("cbade");
        hashSet.add("abcde");
        
        System.out.println(hashSet.size());
        System.out.println("****************************");

        Iterator<String> iterator=hashSet.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("****************************");*/

        HashSet<Employee> hashSet=new HashSet<Employee>();
        
        hashSet.add(new Employee(1,"abcde"));
        hashSet.add(new Employee(11,"adc"));
        hashSet.add(new Employee(21,"abcde"));
        hashSet.add(new Employee(13,"asdc"));
        hashSet.add(new Employee(2,"dgds"));
        hashSet.add(new Employee(5,"abdvcde"));
        hashSet.add(new Employee(2,"derfs"));
        hashSet.add(new Employee(1,"assda"));
        hashSet.add(new Employee(1,"abcde"));

        System.out.println(hashSet.size());
        Iterator<Employee> iter=hashSet.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        

  
    }
    
}
