package bean;

public class Expenses {
    private String ExpenseID;
	private String EmployeeID;
	private String TruckID;
    private String ExpenseType;
    private String PurposeofExpense;
    private int AmountSpent;
    private String Description;
    private String DatePurchased;
    private String DateSubmitted;
    private int AdvanceAmount;
    private String PaymentMethod;

    public String getExpenseID() {
        return ExpenseID;
    }

    public void setExpenseID(String ExpenseID) {
        this.ExpenseID = ExpenseID;
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

    public String getExpenseType() {
        return ExpenseType;
    }

    public void setExpenseType(String ExpenseType) {
        this.ExpenseType = ExpenseType;
    }

    public String getPurposeofExpense() {
        return PurposeofExpense;
    }

    public void setPurposeofExpense(String PurposeofExpense) {
        this.PurposeofExpense = PurposeofExpense;
    }

    public int getAmountSpent() {
        return AmountSpent;
    }

    public void setAmountSpent(int AmountSpent) {
        this.AmountSpent = AmountSpent;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getDatePurchased() {
        return DatePurchased;
    }

    public void setDatePurchased(String DatePurchased) {
        this.DatePurchased = DatePurchased;
    }

    public String getDateSubmitted() {
        return DateSubmitted;
    }

    public void setDateSubmitted(String DateSubmitted) {
        this.DateSubmitted = DateSubmitted;
    }

    public int getAdvanceAmount() {
        return AdvanceAmount;
    }

    public void setAdvanceAmount(int AdvanceAmount) {
        this.AdvanceAmount = AdvanceAmount;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

}