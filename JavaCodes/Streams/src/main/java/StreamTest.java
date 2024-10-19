
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamTest {


    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        cities.add("asdf");
        cities.add("fdfdf");
        cities.add("hghgh");
        cities.add("sdsf");
        cities.add("hgsds");
        cities.add("hyjere");
        cities.add("asgfdf");
        cities.add("ggfgswe");
        
        /*Stream<String> stream1=cities.stream();
        Stream<String> stream2=  stream1.filter(new Predicate<String>(){
            @Override
            public boolean test(String t)
            {
                return t.startsWith("a");
            }
        
        });
        
        Stream<String> stream3=stream2.map(new Function<String,String>(){
            @Override
            public String apply(String t)
            {
                return t.toUpperCase();
            }
        });
        
        Stream<String> stream4=stream3.sorted(new Comparator<String>(){
            @Override
            public int compare(String o1,String o2)
            {
                return o1.compareTo(o2);
            }
        });
        
        stream4.forEach(new Consumer<String>(){
        
            @Override
            public void accept(String t)
            {
                System.out.println(t);
            }
        });*/
        /*cities.stream()
              .filter((s)->s.startsWith("a"))
              .map((s)->s.toUpperCase())
              .sorted((s1,s2)->s1.compareTo(s2))
              .forEach(System.out::println);*/
        
        int[] numbers={1,5,2,7,4,8,3,2};

        Arrays.stream(numbers).filter((s)->s>3).map((x)->x*x).sorted().forEach(System.out::println);
        
        Stream.of(0,1,5,2,7,5,8,3).findFirst().ifPresent(System.out::println);
    }
    
}
