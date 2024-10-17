
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FonctionalInterfaceTest {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
                
        Thread printTime= new Thread(()->{
            while(true)
            {
                LocalDateTime time=LocalDateTime.now();
                System.out.println("Time:"+time);
                try {
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
            }
            }
        });
        
        Thread printUppeCase=new Thread(
                ()->{
                        while(true)
                        {
                            System.out.println("Please, enter a word:");
                            String word=scan.nextLine();
                            System.out.println("Uppercase:"+word.toUpperCase());
                        }
                }
        );
        
        printTime.start();
        printUppeCase.start();
        
    }
    
}
