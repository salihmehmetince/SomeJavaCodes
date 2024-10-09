
public class Student2 implements Comparable<Student2>{
    private int studentNumber;
    private String name;
    private String surName;
    private int classNumber;
    
    public Student2()
    {
        
    }
    
    public Student2(int studentNumber,String name,String surName,int classNumber)
    {
        this.studentNumber=studentNumber;
        this.name=name;
        this.surName=surName;
        this.classNumber=classNumber;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
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
     * @return the surName
     */
    public String getSurName() {
        return surName;
    }

    /**
     * @param surName the surName to set
     */
    public void setSurName(String surName) {
        this.surName = surName;
    }

    /**
     * @return the classNumber
     */
    public int getClassNumber() {
        return classNumber;
    }

    /**
     * @param classNumber the classNumber to set
     */
    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString()
    {
        return "Number:"+studentNumber+"\tName:"+name+"\tsurname:"+surName+"\tclass number:"+classNumber;
    }
    
    @Override
    public int hashCode()
    {
        return this.studentNumber;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Student2 student=(Student2)o;
        return this.studentNumber==student.studentNumber;
    }

    @Override
    public int compareTo(Student2 o) {
        return this.studentNumber-o.studentNumber;
    }
}
