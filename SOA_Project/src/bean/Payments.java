package bean;

public class Payments {
    private String PaymentID;
	private String OrderID;
	private String PaymentMethod;
	private int PaymentAmount;
	private String PaymentDate;
	private String CheckNumber;
	private String CreditCardType;
	private long CreditCardNumber;
    private String CardholdersName;
	private String CreditCardExpDate;
	private int CreditCardAuthorizationNumber;

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public int getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(int PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public String getCheckNumber() {
        return CheckNumber;
    }

    public void setCheckNumber(String CheckNumber) {
        this.CheckNumber = CheckNumber;
    }

    public String getCreditCardType() {
        return CreditCardType;
    }

    public void setCreditCardType(String CreditCardType) {
        this.CreditCardType = CreditCardType;
    }

    public long getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(long CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    public String getCardholdersName() {
        return CardholdersName;
    }

    public void setCardholdersName(String CardholdersName) {
        this.CardholdersName = CardholdersName;
    }

    public String getCreditCardExpDate() {
        return CreditCardExpDate;
    }

    public void setCreditCardExpDate(String CreditCardExpDate) {
        this.CreditCardExpDate = CreditCardExpDate;
    }

    public int getCreditCardAuthorizationNumber() {
        return CreditCardAuthorizationNumber;
    }

    public void setCreditCardAuthorizationNumber(int CreditCardAuthorizationNumber) {
        this.CreditCardAuthorizationNumber = CreditCardAuthorizationNumber;
    }
        
}