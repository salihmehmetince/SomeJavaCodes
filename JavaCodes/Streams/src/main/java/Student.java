
public class Student implements Comparable<Student>{
    private int number;
    private String name;
    public Student()
    {
        
    }
    
    public Student(int number,String name)
    {
        this.number=number;
        this.name=name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
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
    
    @Override
    public String toString()
    {
        return "Number:"+number+" ,Name:"+name;
    }

    @Override
    public int compareTo(Student student) {
        return this.number-student.number;
    }
    
    
}
