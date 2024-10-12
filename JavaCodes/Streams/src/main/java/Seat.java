
public class Seat {
    private int seatNumber;
    private Ticket seatTicket;
    
    public Seat()
    {
        
    }
    
    
    public Seat(int seatNumber,Ticket seatTicket)
    {
        this.seatNumber=seatNumber;
        this.seatTicket=seatTicket;
    }

    /**
     * @return the seatNumber
     */
    public int getSeatNumber() {
        return seatNumber;
    }

    /**
     * @param seatNumber the seatNumber to set
     */
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    /**
     * @return the seatTicket
     */
    public Ticket getSeatTicket() {
        return seatTicket;
    }

    /**
     * @param seatTicket the seatTicket to set
     */
    public void setSeatTicket(Ticket seatTicket) {
        this.seatTicket = seatTicket;
    }
    
    
    @Override
    public String toString()
    {
        return "Seat:(Number:"+seatNumber+"\tTicket:"+seatTicket+")";
    }
    
    @Override
    public int hashCode()
    {
        return seatNumber+seatTicket.hashCode();
    }
    
    @Override
    public boolean equals(Object o)
    {
        Seat seat=(Seat)o;
        return this.seatNumber==seat.seatNumber&&this.seatTicket.equals(seat.seatTicket);
    }
}
