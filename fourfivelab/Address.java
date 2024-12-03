public class Address{
    private String street = null;
    private String city = null;
    private String state = null;
    private int zipcode = 0;

    public Address(String aStreet, String aCity, String aState, int aZipCode){
        street = aStreet;
        city = aCity;
        state = aState;
        zipcode = aZipCode;
    }
    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipCode(){
        return zipcode;
    }
    public void setStreet(String newStreet){
        street = newStreet;
    }
    public void setCity(String newCity){
        city = newCity;
    }
    public void setState(String newState){
        state = newState;
    }
    public void setZipCode(int newZipCode){
        zipcode = newZipCode;
    }
    public String toString(){
        return getStreet() + "\n" + getCity() + ", " + getState() + " " + getZipCode();
    }
}