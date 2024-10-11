
import java.util.Iterator;
import java.util.LinkedList;


public class ListTest {


    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1000);
        ll.add(121);
        ll.add(1,1321);
        ll.add(1121);
        ll.add(2,21);
        ll.add(0);
        ll.addFirst(1);
        ll.add(1);
        
        Iterator<Integer> iter=ll.iterator();
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }

        
    }
    
}
