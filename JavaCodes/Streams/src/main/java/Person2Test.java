
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;


public class Person2Test {


    public static void main(String[] args) {
        SortedMap<Integer,Person2> personSortedMap =new TreeMap<>();
        
        personSortedMap.put(1,new Person2(324342,"name1","surname1",Gender.FEMALE));
        personSortedMap.put(2,new Person2(34243,"name2","surname2",Gender.MALE));
        personSortedMap.put(3,new Person2(43434,"name3","surname3",Gender.MALE));
        personSortedMap.put(14,new Person2(7676,"name4","surname4",Gender.FEMALE));
        personSortedMap.put(33,new Person2(243534,"name5","surname5",Gender.MALE));
        personSortedMap.put(11,new Person2(6553,"name6","surname6",Gender.FEMALE));
        personSortedMap.put(5,new Person2(7675,"name7","surname7",Gender.FEMALE));
        
        Set<Entry<Integer,Person2>> entrySet=personSortedMap.entrySet();
        
        Iterator<Entry<Integer,Person2>> iter=entrySet.iterator();
        
        while(iter.hasNext())
        {
            Entry<Integer,Person2> next=iter.next();
            System.out.println("Key:"+next.getKey()+"\tValue:"+next.getValue());
        }

    }
    
}
