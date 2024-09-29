
import java.io.Serializable;


public class Person implements Serializable{
    private int schoolNumber;
    private String name;
    private String surname;
    private String classNumber;

    public void Person()
    {
        
    }
    
    public void Person(int schoolNumber,String name,String surname,String classNumber)
    {
        this.schoolNumber=schoolNumber;
        this.name=name;
        this.surname=surname;
        this.classNumber=classNumber;
    }
    /**
     * @return the schoolNumber
     */
    public int getSchoolNumber() {
        return schoolNumber;
    }

    /**
     * @param schoolNumber the schoolNumber to set
     */
    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
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
     * @return the classNumber
     */
    public String getClassNumber() {
        return classNumber;
    }

    /**
     * @param classNumber the classNumber to set
     */
    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }
    
    @Override
    public String toString()
    {
        return "Number:"+schoolNumber+", Name:"+name+", Surname:"+surname+", class:"+classNumber;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        Person person=(Person)obj;
        return this.schoolNumber==person.schoolNumber;
    }
}
