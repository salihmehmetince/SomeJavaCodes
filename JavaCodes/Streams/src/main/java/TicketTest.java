import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class TicketTest {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        ArrayList<Ticket> ticketList=new ArrayList<>();
        Random rand=new Random();
        for(int i=0;i<100;i++)
        {
            Ticket ticket=new Ticket(rand.nextInt(1000), new Date(rand.nextInt(100000)), rand.nextFloat()*15f+10f);
            ticketList.add(ticket);
        }
        
        ArrayList<Seat> seatList=new ArrayList<>();
        int choose=0;
        int seatNumber=0;
        System.out.println("Enter (1) to buy a seat or (0) to exit:");
        while((choose=scan.nextInt())!=0)
        {
            Ticket ticket=ticketList.get(rand.nextInt(ticketList.size()));
            Seat seat=new Seat(seatNumber++,ticket);
            seatList.add(seat);
            ticketList.remove(ticket);
            System.out.println(seat);
            System.out.println("Enter (1) to buy a seat or (0) to exit:");
        }
        System.out.println(ticketList.size());
        
        Iterator<Seat> iterator=seatList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
    
}
