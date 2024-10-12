
import java.io.Serializable;
import java.util.Date;


public class Ticket implements Serializable{
    private int ticketNumber;
    private Date ticketDate;
    private float ticketPrice;
    
    public Ticket()
    {
        
    }
    
    public Ticket(int ticketNumber,Date ticketDate,float ticketPrice)
    {
        this.ticketNumber=ticketNumber;
        this.ticketDate=ticketDate;
        this.ticketPrice=ticketPrice;
    }

    /**
     * @return the ticketNumber
     */
    public int getTicketNumber() {
        return ticketNumber;
    }

    /**
     * @param ticketNumber the ticketNumber to set
     */
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /**
     * @return the ticketDate
     */
    public Date getTicketDate() {
        return ticketDate;
    }

    /**
     * @param ticketDate the ticketDate to set
     */
    public void setTicketDate(Date ticketDate) {
        this.ticketDate = ticketDate;
    }

    /**
     * @return the ticketPrice
     */
    public float getTicketPrice() {
        return ticketPrice;
    }

    /**
     * @param ticketPrice the ticketPrice to set
     */
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    @Override
    public String toString()
    {
        return "Ticket:(Number:"+ticketNumber+",\tDate:"+ticketDate+",\tPrice:"+ticketPrice+")";
    }
    
    @Override
    public int hashCode()
    {
        return ticketNumber;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Ticket ticket=(Ticket)o;
        return this.ticketNumber==ticket.ticketNumber;
    }
}
