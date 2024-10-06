
public class City implements Comparable<City>{
    private String plateNumber;
    private String cityName;
    
    public City()
    {
        
    }
    
    public City(String plateNumber,String cityName)
    {
        this.plateNumber=plateNumber;
        this.cityName=cityName;
    }

    /**
     * @return the plateNumber
     */
    public String getPlateNumber() {
        return plateNumber;
    }

    /**
     * @param plateNumber the plateNumber to set
     */
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
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
    
    @Override
    public String toString()
    {
        return "Plate Number:"+plateNumber+" ,City Name:"+cityName;
    }

    @Override
    public int compareTo(City o) {
        return this.plateNumber.compareTo(o.plateNumber);
    }

}
