
public class Author {
    private String name;
    private String surname;
    
    public Author()
    {
        
    }
    
    public Author(String name,String surname)
    {
        this.name=name;
        this.surname=surname;
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
    
    @Override
    public String toString()
    {
        return "Name:"+name+"\t,Surname:"+surname;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Author author=(Author) o;
        return this.name.equals(author.name)&&this.surname.equals(author.surname);
    }
    
    @Override
    public int hashCode()
    {
        return name.hashCode()+surname.hashCode();
    }
        
}
