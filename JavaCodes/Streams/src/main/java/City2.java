
public class City2 {
    private String cityName;
    private int cityPopulation;
    
    public City2()
    {
        
    }
    
    
    public City2(String cityName,int cityPopulation)
    {
        this.cityName=cityName;
        this.cityPopulation=cityPopulation;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the cityPopulation
     */
    public int getCityPopulation() {
        return cityPopulation;
    }

    /**
     * @param cityPopulation the cityPopulation to set
     */
    public void setCityPopulation(int cityPopulation) {
        this.cityPopulation = cityPopulation;
    }
    
    @Override
    public String toString()
    {
        return "City:(City Name:"+cityName+",\tCity Population:"+cityPopulation+")";
    }
    
    @Override 
    public int hashCode()
    {
        return cityName.hashCode();
    }
    
    @Override 
    public boolean equals(Object o)
    {
        City2 city=(City2)o;
        return this.cityName.equals(city.cityName);
    }
}
