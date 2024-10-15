
import java.util.Iterator;


public class Student3 implements Iterable<Integer>{
    private String name;
    private int[] notes;
    
    private int index=0;
    
    public Student3()
    {
        
    }
    
    
    public Student3(String name,int[] notes)
    {
        this.name=name;
        this.notes=notes;
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
     * @return the notes
     */
    public int[] getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(int[] notes) {
        this.notes = notes;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            @Override
            public boolean hasNext()
            {
                return index<notes.length;
            }
            @Override
            public Integer next()
            {
                return notes[index++];
            }
            
        };
    }
    
    
}
