package bean;

public class Transactions {
    private String TransactionID;
	private String OrderID;
	private String PriceID;
	private String TransactionDate;
	private String TransactionDescription;
	private int TransactionAmount;
	private String EmployeeID;
	private String TruckID;
    private int Discount;
	private int Quantity;
	private int UnitPrice;
	private int DriverPrice;
	private String RunNumber;
	private String IsSpecial;
	private int Rate;
	private int Surcharge;

   

	public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getPriceID() {
        return PriceID;
    }

    public void setPriceID(String PriceID) {
        this.PriceID = PriceID;
    }

    public String getTransactionDate() {
        return TransactionDate;
    }

    public void setTransactionDate(String TransactionDate) {
        this.TransactionDate = TransactionDate;
    }

    public String getTransactionDescription() {
        return TransactionDescription;
    }

    public void setTransactionDescription(String TransactionDescription) {
        this.TransactionDescription = TransactionDescription;
    }

    public int getTransactionAmount() {
        return TransactionAmount;
    }

    public void setTransactionAmount(int TransactionAmount) {
        this.TransactionAmount = TransactionAmount;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public String getTruckID() {
        return TruckID;
    }

    public void setTruckID(String TruckID) {
        this.TruckID = TruckID;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getDriverPrice() {
        return DriverPrice;
    }

    public void setDriverPrice(int DriverPrice) {
        this.DriverPrice = DriverPrice;
    }

    public String getRunNumber() {
        return RunNumber;
    }

    public void setRunNumber(String RunNumber) {
        this.RunNumber = RunNumber;
    }

    public String getIsSpecial() {
        return IsSpecial;
    }

    public void setIsSpecial(String IsSpecial) {
        this.IsSpecial = IsSpecial;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int Rate) {
        this.Rate = Rate;
    }

    public int getSurcharge() {
        return Surcharge;
    }

    public void setSurcharge(int Surcharge) {
        this.Surcharge = Surcharge;
    }
       
}