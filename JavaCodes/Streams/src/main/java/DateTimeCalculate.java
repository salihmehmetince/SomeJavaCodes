
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DateTimeCalculate {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Date:");
        String sDate=scan.nextLine();
        LocalDate date=LocalDate.parse(sDate);
        System.out.print("Time:");
        String sTime=scan.nextLine();
        LocalTime time=LocalTime.parse(sTime);
        LocalDateTime dateTime=LocalDateTime.of(date, time);
        System.out.println("Date and time:"+dateTime);
        System.out.print("Choose transaction (1) for add and (2) for substruct:");
        int transaction=scan.nextInt();
        System.out.println("Choose a time unit");
        ChronoUnit [] units=ChronoUnit.values();
        
        for(int i=0;i<units.length;i++)
        {
            System.out.println("Choose ("+i+") for unit"+units[i]);
        }
        System.out.print(":");
        int unit=scan.nextInt();
        
        System.out.print("Amount to add:");
        int amount=scan.nextInt();
        if(transaction==1)
        {
            LocalDateTime newDateTime=dateTime.plus(amount,units[unit]);
            System.out.println("New time:"+newDateTime);
        }
        else if(transaction==2)
        {
            LocalDateTime newDateTime=dateTime.minus(amount,units[unit]);
            System.out.println("New time:"+newDateTime);
        }
        
    }
    
}
