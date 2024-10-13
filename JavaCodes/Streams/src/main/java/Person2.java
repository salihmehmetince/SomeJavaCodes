
import java.io.Serializable;


public class Person2 implements Serializable{
    private int TC;
    private String name;
    private String surname;
    private Gender gender;
    
    public Person2()
    {
        
    }
    
    
    public Person2(int TC,String name,String surname,Gender gender)
    {
        this.TC=TC;
        this.name=name;
        this.surname=surname;
        this.gender=gender;
    }

    /**
     * @return the TC
     */
    public int getTC() {
        return TC;
    }

    /**
     * @param TC the TC to set
     */
    public void setTC(int TC) {
        this.TC = TC;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString()
    {
        return "Person:(TC:"+TC+",\tName:"+name+",\tSurname:"+surname+",\tGender:"+gender; 
    }
    
    @Override 
    public int hashCode()
    {
        return TC;
    }
    
    @Override
    public boolean equals(Object o )
    {
        Person2 person=(Person2)o;
        return this.TC==person.TC;
    }
}
