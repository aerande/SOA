package bean;

public class Invoices {
	private String InvoiceID;
	private String OrderID;
	private String CustomerID;
	private String PaymentID;
	private String PriceID;
	private String TransactionID;
	private String TruckID;
	private String ExpenseID;
	
	public String getInvoiceID() {
        return InvoiceID;
    }

    public void setInvoiceID(String InvoiceID) {
        this.InvoiceID = InvoiceID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public String getPriceID() {
        return PriceID;
    }

    public void setPriceID(String PriceID) {
        this.PriceID = PriceID;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    public String getTruckID() {
        return TruckID;
    }

    public void setTruckID(String TruckID) {
        this.TruckID = TruckID;
    }

    public String getExpenseID() {
        return ExpenseID;
    }

    public void setExpenseID(String ExpenseID) {
        this.ExpenseID = ExpenseID;
    }
}