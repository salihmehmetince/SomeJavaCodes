
public class Employee {
    private int eNumber;
    private String eName;
    
    public Employee()
    {
        
    }
    
    public Employee(int eNumber,String eName)
    {
        this.eNumber=eNumber;
        this.eName=eName;
    }

    /**
     * @return the eNumber
     */
    public int geteNumber() {
        return eNumber;
    }

    /**
     * @param eNumber the eNumber to set
     */
    public void seteNumber(int eNumber) {
        this.eNumber = eNumber;
    }

    /**
     * @return the eName
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName the eName to set
     */
    public void seteName(String eName) {
        this.eName = eName;
    }
    
    @Override
    public String toString()
    {
        return "Number:"+eNumber+" ,Name:"+eName; 
    }
    @Override
    public int hashCode()
    {
        return this.eNumber;
    }
    @Override
    public boolean equals(Object o)
    {
        Employee emp=(Employee)o;
        return this.eNumber==emp.eNumber;
    }
    
}
