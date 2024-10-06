
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class StudentTest {


    public static void main(String[] args) {
        /*SortedSet<String> sortedSet=new TreeSet<String>();
        sortedSet.add("acs");
        sortedSet.add("csa");
        sortedSet.add("sca");
        sortedSet.add("sac");
        
        Iterator<String> iter=sortedSet.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }*/
        
        /*SortedSet<Student> sortedSet=new TreeSet<Student>();
        sortedSet.add(new Student(1,"abcd"));
        sortedSet.add(new Student(11,"acbd"));
        sortedSet.add(new Student(4,"abdc"));
        sortedSet.add(new Student(21,"bacd"));
        sortedSet.add(new Student(12,"dbca"));

        Iterator<Student> iter=sortedSet.iterator();
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }*/
        
        
        NavigableSet<Float> navigableSet=new TreeSet<Float>();
        navigableSet.add(2.1f);
        navigableSet.add(1.4f);
        navigableSet.add(5.4f);
        navigableSet.add(7.8f);
        navigableSet.add(6.9f);
        navigableSet.add(3.56f);

        Iterator<Float> iter=navigableSet.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println("*************************************");
        System.out.println(navigableSet.ceiling(3.25f));
        System.out.println(navigableSet.floor(5.15f));
        System.out.println(navigableSet.first());
        System.out.println(navigableSet.last());
        System.out.println(navigableSet.lower(1.25f));
        System.out.println(navigableSet.higher(7.36f));
        System.out.println("*************************************");
        SortedSet<Float> newSet=navigableSet.headSet(7.8f,true);
        Iterator<Float> iter2=newSet.iterator();
        
        while(iter2.hasNext())
        {
            System.out.println(iter2.next());
        }
        System.out.println("*************************************");


    }
    
}
