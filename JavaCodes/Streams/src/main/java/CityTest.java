
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class CityTest {

    public static void main(String[] args) {
        HashMap<Integer,City2> cityHashMap=new HashMap<>();
        cityHashMap.put(43, new City2("asaasas",2_212_212));
        cityHashMap.put(54, new City2("dfgfdg",3_212_212));
        cityHashMap.put(56, new City2("dgdd",5_555_212));
        cityHashMap.put(64, new City2("hhghghg",6_212_324));
        cityHashMap.put(76, new City2("jvfgf",4_232_232));
        cityHashMap.put(73, new City2("sss",7_112_112));
        System.out.println(cityHashMap.size());
        Set<Integer> citySet=cityHashMap.keySet();
        Iterator<Integer> iter=citySet.iterator();
        while(iter.hasNext())
        {
            Integer n=iter.next();
            System.out.println("Key:"+n+",\t Value:"+cityHashMap.get(n));
        }
        
        Collection<City2> cityCollection=cityHashMap.values();
        
        Iterator<City2> iter2=cityCollection.iterator();
        while(iter2.hasNext())
        {
            System.out.println(iter2.next());
        }
    
        Set<Entry<Integer,City2>> cityEntrySet=cityHashMap.entrySet();
        Iterator<Entry<Integer,City2>> iter3=cityEntrySet.iterator();
        while(iter3.hasNext())
        {
            Entry<Integer,City2> e=iter3.next();
            System.out.println("Key:"+e.getKey());
            System.out.println("Value:"+e.getValue());

        }
    }
    
}
