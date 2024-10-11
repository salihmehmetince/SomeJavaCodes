
import java.util.Iterator;
import java.util.Vector;


public class BookTest {


    public static void main(String[] args) {
        Vector<Book> vector=new Vector<>();
        Book b1=new Book("sadasda",new Author("dsdfdsfs","fdfdsfds"),1992);
        Book b2=new Book("sadasda",new Author("dsdfdsfs","fdfdsfds"),1992);
        
        if(b1.equals(b2))
        {
            System.out.println("Same books");
        }

        
        vector.add(b1);
        vector.add(b2);
        vector.add(new Book("dgdfg",new Author("sdg","err"),2021));
        vector.add(new Book("fgdd",new Author("hj","ddd"),1999));




        Iterator<Book> iter=vector.iterator();
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
    
}
