
import java.io.Serializable;


public class Car implements Serializable{
    private String numberPlate;
    private String brand;
    private String model;
    private int year;
    private Engine engine;
    
    public Car()
    {
        
    }

    
    public Car(String numberPlate,String brand,String model,int year,Engine engine)
    {
        this.setNumberPlate(numberPlate);
        this.setBrand(brand);
        this.setModel(model);
        this.setYear(year);
        this.setEngine(engine);
    }

    /**
     * @return the numberPlate
     */
    public String getNumberPlate() {
        return numberPlate;
    }

    /**
     * @param numberPlate the numberPlate to set
     */
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    @Override
    public boolean equals(Object other)
    {
        Car car=(Car)other;
        return this.numberPlate==car.numberPlate; 
    }
    
    @Override
    public String toString()
    {
        return "Number plate:"+numberPlate+" ,Brand: "+brand+" ,model:"+model+" ,year:"+year+" ,Engine:"+engine;
    }

}

