package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Expenses;
import connection.ConnectToOracle;
 
public class ReadExpenses {
 
  public static void main(String argv[]) {
		ArrayList<Expenses> expenseObject = new ArrayList<Expenses>();
		Expenses t1;
 
		try {
	 
			File file = new File("src/XML/Expenses.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Expense");
		 
			System.out.println("------------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					t1=new Expenses();
					Element eElement = (Element) nNode;
					String a1= eElement.getElementsByTagName("ExpenseID").item(0).getTextContent();
					String a2= eElement.getElementsByTagName("EmployeeID").item(0).getTextContent();
					String a3= eElement.getElementsByTagName("TruckID").item(0).getTextContent();
					String a4= eElement.getElementsByTagName("ExpenseType").item(0).getTextContent();
					String a5= eElement.getElementsByTagName("PurposeofExpense").item(0).getTextContent();
					int a6=Integer.parseInt(eElement.getElementsByTagName("AmountSpent").item(0).getTextContent());
					int a7=Integer.parseInt(eElement.getElementsByTagName("AdvanceAmount").item(0).getTextContent());
					String a8= eElement.getElementsByTagName("Description").item(0).getTextContent();
					String a9= eElement.getElementsByTagName("DatePurchased").item(0).getTextContent();
					String a10= eElement.getElementsByTagName("DateSubmitted").item(0).getTextContent();
					String a11= eElement.getElementsByTagName("PaymentMethod").item(0).getTextContent();

					t1.setExpenseID(a1);
					t1.setEmployeeID(a2);
					t1.setTruckID(a3);
					t1.setExpenseType(a4);
					t1.setPurposeofExpense(a5);
					t1.setAmountSpent(a6);
					t1.setAdvanceAmount(a7);
					t1.setDescription(a8);
					t1.setDatePurchased(a9);
					t1.setDateSubmitted(a10);
					t1.setPaymentMethod(a11);

					System.out.println("Truck ID : " + a1);
					System.out.println("Truck Make : " + a2);
					System.out.println("Year : " + a3);
					expenseObject.add(t1);     
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertExpenses(expenseObject);
			expenseObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}