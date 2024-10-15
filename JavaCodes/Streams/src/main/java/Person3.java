
import java.io.Serializable;
import java.time.LocalDate;


public class Person3 implements Serializable{
    
    public enum Gender{MALE,FEMALE};
    private String name;
    private LocalDate birthday;
    private String email;
    private Gender gender;
    
    public Person3()
    {
    
    }
    
    
    public Person3(String name,LocalDate birthday,String email,Gender gender)
    {
        this.name=name;
        this.birthday=birthday;
        this.email=email;
        this.gender=gender;
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
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
    public int getAge()
    {
        return LocalDate.now().getYear()-this.birthday.getYear();
    }
    @Override
    public String toString()
    {
        return "Person:[Name:"+name+"\t,Birthday:"+birthday+"\t,E-mail:"+email+"\t,Gender:"+gender+"\t,Age:"+getAge()+"]";
    }
    
    @Override
    public int hashCode()
    {
        return email.hashCode();
    }
    
    @Override
    public boolean equals(Object o)
    {
        Person3 person=(Person3)o;
        return this.email.equals(person.email);
    }
}
