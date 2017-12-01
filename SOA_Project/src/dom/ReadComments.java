package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Comments;

import connection.ConnectToOracle;;
 
public class ReadComments {
 
	public static void main(String argv[]) {
		ArrayList<Comments> commentObject = new ArrayList<Comments>();
		Comments t1;
 
		try {
	 
			File file = new File("src/XML/Comments.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Comment");
		 
			System.out.println("--------------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					t1=new Comments();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("CommentID").item(0).getTextContent();
					String a2= eElement.getElementsByTagName("TimeStamp").item(0).getTextContent();
					String a3= eElement.getElementsByTagName("CommentText").item(0).getTextContent();
					String a4= eElement.getElementsByTagName("CommentType").item(0).getTextContent();
					String a5= eElement.getElementsByTagName("CustomerID").item(0).getTextContent();
				   
					t1.setCommentID(a1);
					t1.setTimeStamp(a2);
					t1.setCommentText(a3);
					t1.setCommentType(a4);
					t1.setCustomerID(a5);
				   
					System.out.println("Comment ID : " + a1);
					System.out.println("Time stamp : " + a2);
					System.out.println("Comment : " + a3);
					System.out.println("Comment Type : " + a4);
					System.out.println("Customer ID: " + a5);
					commentObject.add(t1);     
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertComments(commentObject);
			commentObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}