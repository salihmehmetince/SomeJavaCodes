
import java.io.Serializable;


public class Film implements Serializable{
    private String filmName;
    private FilmType filmType;
    private String director;
    private int publicationYear;
    
    
    public Film(){
        
    }
    
    
    public Film(String filmName,FilmType filmType,String director,int publicationYear){
        this.filmName=filmName;
        this.filmType=filmType;
        this.director=director;
        this.publicationYear=publicationYear;
    }

    /**
     * @return the filmName
     */
    public String getFilmName() {
        return filmName;
    }

    /**
     * @param filmName the filmName to set
     */
    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    /**
     * @return the filmType
     */
    public FilmType getFilmType() {
        return filmType;
    }

    /**
     * @param filmType the filmType to set
     */
    public void setFilmType(FilmType filmType) {
        this.filmType = filmType;
    }

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
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
        return "Film Name:"+ filmName+" ,Film Type:"+filmType+" ,Director:"+director+" ,the year of publication:"+publicationYear;
    }
    
    @Override
    public int hashCode()
    {
        return filmName.length()+publicationYear;
    }
    
    @Override
    public boolean equals(Object o)
    {
        Film film=(Film) o;
        return this.filmName.equals(film.filmName) && this.filmType.equals(film.filmType);
    }
}
