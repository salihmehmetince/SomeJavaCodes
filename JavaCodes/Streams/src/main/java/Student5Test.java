
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Student5Test {


    public static void main(String[] args) {
        ArrayList<Student5> students=new ArrayList<>();
        students.add(new Student5(1,"adsds",45));
        students.add(new Student5(2,"dfdgfg",54));
        students.add(new Student5(3,"adsds",65));
        students.add(new Student5(4,"vbvbn",23));
        students.add(new Student5(5,"cvbbv",1));
        students.add(new Student5(6,"vbv",5));
        students.add(new Student5(7,"jhjyh",12));
        
        /*List<Student5> students2=students.stream().filter((s)->s.getAge()>8).collect(Collectors.toList());
        students2.forEach(System.out::println);*/
        
        Map<Integer,List<Student5>> group=students.stream().collect(Collectors.groupingBy(s->s.getAge()));
        Set<Integer> keySet=group.keySet();
        Iterator<Integer> iter=keySet.iterator();
        while(iter.hasNext())
        {
            Integer next=iter.next();
            System.out.println("Key:"+next+"value:"+group.get(next));
        }
        
        double averageAge=students.stream().collect(Collectors.averagingInt((o)->o.getAge()));
        System.out.println("Average age:"+averageAge);
        
        IntSummaryStatistics summary=students.stream().collect(Collectors.summarizingInt((o)->o.getAge()));
        System.out.println("Summary:"+summary);
    }
    
}
