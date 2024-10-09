
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class SetLab1 {

    public static void fill(SortedSet<Integer> ss,int columnCount)
    {
        ss.clear();
        Random random=new Random();
        while(ss.size()<columnCount)
        {
            int number=random.nextInt(49)+1;
            ss.add(number);
        }
    }
    
    public static void main(String[] args) {
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Please, enter a row count:");
        int rowCount=scan.nextInt();
        System.out.println("Please, enter a column count:");
        int columnCount=scan.nextInt();
        
        SortedSet ss=new TreeSet();
        
        for(int i=0;i<rowCount;i++)
        {
            fill(ss, columnCount);
            Iterator<Integer> iter=ss.iterator();
            while(iter.hasNext())
            {
                System.out.print(iter.next()+"\t");
            }
            System.out.println();
        }*/
        
        /*Scanner scan=new Scanner(System.in);
        System.out.print("Enter -1 to exit");
        LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
        int i=0;
        
        System.out.print("Number:");
        while((i=scan.nextInt())!=-1)
        {
            System.out.print("Number:");
            lhs.add(i);
        }
        
        System.out.println(lhs.size());
        Iterator<Integer> iter=lhs.iterator();
        
        
        
        while(iter.hasNext())
        {
            System.out.println(iter.next()+"\t");
        }*/
        
        Scanner scan = new Scanner(System.in);
        System.out.print("To save a new student press (N) and to exit press (E): ");
        String answer = "";
        SortedSet<Student2> ss = new TreeSet<>();

        while (!(answer = scan.nextLine()).equals("E")) {
            System.out.print("Number: ");
            int number = scan.nextInt();
            scan.nextLine(); // Enter karakterini temizlemek için eklenir.
            
            System.out.print("Name: ");
            String name = scan.nextLine();
            
            System.out.print("Surname: ");
            String surname = scan.nextLine();
            
            System.out.print("Class: ");
            int classNumber = scan.nextInt();
            scan.nextLine(); // Enter karakterini temizlemek için eklenir.

            ss.add(new Student2(number, name, surname, classNumber));
            System.out.print("To save a new student press (N) and to exit press (E): ");
        }
        
        System.out.println("Total student count: " + ss.size());
        Iterator<Student2> iter = ss.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
    }
    
}
