
package Services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "findEmployeeByEmployeeId", namespace = "http://Services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEmployeeByEmployeeId", namespace = "http://Services/")
public class FindEmployeeByEmployeeId {

    @XmlElement(name = "name", namespace = "")
    private String name;

    /**
     * 
     * @return
     *     returns String
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @param name
     *     the value for the name property
     */
    public void setName(String name) {
        this.name = name;
    }

}
