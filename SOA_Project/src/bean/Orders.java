package bean;

public class Orders {
    
    private String OrderID;
	private String OrderDate;
	private String CustomerID;
    private String EmployeeID;
    private String TruckID;
    private String IsSpecial;
    private int PurchaseOrderNumber;
    private int OrderTotalAmount;

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
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

    public String getIsSpecial() {
		return IsSpecial;
	}

	public void setIsSpecial(String isSpecial) {
		IsSpecial = isSpecial;
	}

	public int getPurchaseOrderNumber() {
        return PurchaseOrderNumber;
    }

    public void setPurchaseOrderNumber(int PurchaseOrderNumber) {
        this.PurchaseOrderNumber = PurchaseOrderNumber;
    }

    public int getOrderTotalAmount() {
        return OrderTotalAmount;
    }

    public void setOrderTotalAmount(int OrderTotalAmount) {
        this.OrderTotalAmount = OrderTotalAmount;
    }
    
}