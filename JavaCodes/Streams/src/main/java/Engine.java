
import java.io.Serializable;


public class Engine implements Serializable {
    private int volume;


    public Engine()
    {
        
    }
    
    public Engine(int volume)
    {
        this.volume=volume;
    }
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString()
    {
        return "volume:"+volume;
    }
}
