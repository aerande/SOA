package bean;

public class Pricing {
    
    private String PriceID;
	private String LocationIDFrom;
	private String LocationIDTo;
    private int Price;
    private String LocationCodeFrom;
    private String LocationCodeTo;
    private String LocationNameFrom;
    private String LocationNameTO;
    private String CustomerID;

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getPriceID() {
        return PriceID;
    }

    public void setPriceID(String PriceID) {
        this.PriceID = PriceID;
    }

    public String getLocationIDFrom() {
        return LocationIDFrom;
    }

    public void setLocationIDFrom(String LocationIDFrom) {
        this.LocationIDFrom = LocationIDFrom;
    }

    public String getLocationIDTo() {
        return LocationIDTo;
    }

    public void setLocationIDTo(String LocationIDTo) {
        this.LocationIDTo = LocationIDTo;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getLocationCodeFrom() {
        return LocationCodeFrom;
    }

    public void setLocationCodeFrom(String LocationCodeFrom) {
        this.LocationCodeFrom = LocationCodeFrom;
    }

    public String getLocationCodeTo() {
        return LocationCodeTo;
    }

    public void setLocationCodeTo(String LocationCodeTo) {
        this.LocationCodeTo = LocationCodeTo;
    }

    public String getLocationNameFrom() {
        return LocationNameFrom;
    }

    public void setLocationNameFrom(String LocationNameFrom) {
        this.LocationNameFrom = LocationNameFrom;
    }

    public String getLocationNameTO() {
        return LocationNameTO;
    }

    public void setLocationNameTO(String LocationNameTO) {
        this.LocationNameTO = LocationNameTO;
    }
    
}