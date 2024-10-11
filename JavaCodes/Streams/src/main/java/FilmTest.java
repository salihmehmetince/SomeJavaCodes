
import java.util.ArrayList;
import java.util.Iterator;


public class FilmTest {


    public static void main(String[] args) {
        ArrayList<Film> al=new ArrayList<>();
        
        al.add(new Film("asd",FilmType.ACTION,"dsdsdsd",2022));
        al.add(new Film("fgfdfgd",FilmType.COMEDY,"fdfgdg",2025));
        al.add(new Film("mghgnhn",FilmType.HORROR,"dd",2022));
        al.add(new Film("assdfsdfsd",FilmType.ACTION,"dshthfgfdsdsd",2021));
        al.add(new Film("asngd",FilmType.ACTION,"sdfs",2023));
        
        Iterator<Film> iter=al.iterator();
        while(iter.hasNext())
        {
            System.out.println("Film:"+iter.next());
        }

    }
    
}
