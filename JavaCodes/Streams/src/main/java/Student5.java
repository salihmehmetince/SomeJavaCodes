
public class Student5 {
    private int no;
    private String name;
    private int age;
    
    public Student5()
    {
        
    }
    
    
    public Student5(int no,String name,int age)
    {
        this.no=no;
        this.name=name;
        this.age=age;
    }

    /**
     * @return the no
     */
    public int getNo() {
        return no;
    }

    /**
     * @param no the no to set
     */
    public void setNo(int no) {
        this.no = no;
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "No:"+no+",\tname:"+name+",\tage:"+age;
    }
    
    @Override
    public int hashCode()
    {
        return no;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Student5 student=(Student5)o;
        return this.no==student.no;
    }
}
