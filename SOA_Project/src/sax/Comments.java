package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Comments {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Comments.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler userhandler = new UserHandler();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler extends DefaultHandler {

	boolean commentID, timeStamp, commentText, commentType, customerID = false;

	@Override
	public void startElement(String a, 
			String b, String Ord, Attributes attributes)
					throws SAXException {
		if (Ord.equalsIgnoreCase("CommentID")) {
			commentID = true;
		} 
		else if (Ord.equalsIgnoreCase("TimeStamp")) {
			timeStamp = true;
		} 
		else if (Ord.equalsIgnoreCase("CommentText")) {
			commentText = true;
		} 
		else if (Ord.equalsIgnoreCase("CommentType")) {
			commentType = true;
		} 
		else if (Ord.equalsIgnoreCase("CustomerID")) {
			customerID = true;
		}
	}

	@Override
	public void endElement(String a, 
			String b, String c) throws SAXException {
		if (c.equalsIgnoreCase("Comment")) {
			System.out.println("End Element has been reached :" + c);
		}
	}

	@Override
	public void characters(char ch[], 
			int strt, int len) throws SAXException {
		if(commentID) {
			System.out.println("Comment ID: " + new String(ch, strt, len));
			commentID = false;
		}
		else if (timeStamp) {
			System.out.println("Comment Time: " + new String(ch, strt, len));
			timeStamp = false;
		} 
		else if (commentText) {
			System.out.println("Comment : " + new String(ch, strt, len));
			commentText = false;
		} 
		else if (commentType) {
			System.out.println("Comment Type: " + new String(ch, strt, len));
			commentType = false;
		}
		else if (customerID) {
			System.out.println("Customer ID: " + new String(ch, strt, len));
			customerID = false;
		}
	}
}