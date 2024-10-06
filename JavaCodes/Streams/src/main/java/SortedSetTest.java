
import java.util.Iterator;
import java.util.TreeSet;


public class SortedSetTest {


    public static void main(String[] args) {
        /*TreeSet<Integer> treeSet=new TreeSet<Integer>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(1);
        //System.out.println(treeSet.size());
        
        Iterator<Integer> iter=treeSet.iterator();
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }*/
        
        TreeSet<City> treeSet=new TreeSet<City>();
        treeSet.add(new City("ab323","abcde"));
        treeSet.add(new City("ax123","abcd"));
        treeSet.add(new City("ar324","abc"));
        treeSet.add(new City("ag123","ab"));
        treeSet.add(new City("ah323","ac"));
        treeSet.add(new City("tb321","abe"));
        treeSet.add(new City("tb321","abe"));

        Iterator<City> iterator=treeSet.iterator();
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
    
}
