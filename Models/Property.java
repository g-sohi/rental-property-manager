package Models;

public class Property {
    private int id;
    private String address;
    private String type;
    private int numOfBedrooms;
    private int numOfBathrooms;
    private boolean furnished;
    private Fees propertyFees;
    private String propertyStatus;

    
    /**
     * Constructor for the Property class
     */
    public Property(int id, String address,String type, int numOfBedrooms, int numOfBathrooms, boolean furnished, Fees propertyFees, String propertyStatus)
    {
        this.id =id;
        this.address = address;
        this.type = type;
        this.numOfBathrooms = numOfBathrooms;
        this.numOfBedrooms = numOfBedrooms;
        this.furnished = furnished;
        this.propertyFees = propertyFees;
        this.propertyStatus = propertyStatus;
    }

    public int getID()                          //getter method for the id    
    {
        return this.id;
    }

    public void setID(int id)                   //setter method for the id
    {
        this.id = id;
    }

    public String getAddress()                 //getter method for the address  
    {
        return this.address;
    }

    public void setAddress(String address)     //setter method for the address
    {
        this.address = address;
    }

    public String getType()                     //getter method for the type  
    {
        return this.type;
    }

    public void setType(String type)            //setter method for the type
    {   
        this.type = type;
    }

    public int getNumOfBedrooms()               //getter method for the numOfBedrooms  
    {
        return this.numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) //setter method for the numOfBedrooms
    {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfBathrooms()              //getter method for the numOfBathrooms  
    {
        return this.numOfBathrooms;
    }

    public void setNumOfBathrooms(int numOfBathrooms)   //setter method for the numOfBathrooms
    {
        this.numOfBathrooms = numOfBathrooms;
    }

    public boolean getFurnished()               //getter method for the furnished  
    {
        return this.furnished;
    }

    public void setFurnished(boolean furnished) //setter method for the furnished
    {
        this.furnished = furnished;
    }

    
    public Fees getPropertyFees()               //getter method for the propertyFees  
    {
        return this.propertyFees;
    }

    public void setPropertyFees(Fees propertyFees)  //setter method for the propertyFees
    {
        this.propertyFees = propertyFees;
    }

    public String getPropertyStatus()           //getter method for the propertyStatus  
    {
        return this.propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus)    //setter method for the propertyStatus
    {
        this.propertyStatus = propertyStatus;
    }


}