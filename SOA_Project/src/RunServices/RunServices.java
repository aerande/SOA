package RunServices;

import javax.xml.ws.Endpoint;
import Services.*;

public class RunServices {

	public static void main(String[] args) {
		System.out.println("Service started");
		Endpoint.publish("http://localhost:8088/TruckApplication/ser", new ServiceCalls());
	}
}