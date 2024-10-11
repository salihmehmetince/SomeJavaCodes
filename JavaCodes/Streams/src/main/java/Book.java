
public class Book {
    
    private String name;
    private Author author;
    private int publicationYear;
    
    public Book()
    {
        
    }
    
    
    public Book(String name,Author author,int publicationYear)
    {
        this.name=name;
        this.author=author;
        this.publicationYear=publicationYear;
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
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return the publicationYear
     */
    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * @param publicationYear the publicationYear to set
     */
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    
    @Override
    public String toString()
    {
        return "Name:"+name+"\t,Author:"+author+"\t,The year of publication:"+publicationYear;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Book book=(Book)o;
        return this.name.equals(book.name)&& this.author.equals(book.author);
    }
    
    @Override
    public int hashCode()
    {
        return this.name.hashCode()+this.author.hashCode();
    }
}
