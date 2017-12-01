package bean;

public class Comments {
    private String CommentID;
    private String TimeStamp;
	private String CommentText;
	private String CommentType;
    private String CustomerID;
	
    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }
       
    public String getCommentID() {
        return CommentID;
    }

    public void setCommentID(String CommentID) {
        this.CommentID = CommentID;
    }

    public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}

	public String getCommentText() {
        return CommentText;
    }

    public void setCommentText(String CommentText) {
        this.CommentText = CommentText;
    }

    public String getCommentType() {
        return CommentType;
    }

    public void setCommentType(String CommentType) {
        this.CommentType = CommentType;
    }
}