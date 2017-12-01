
package Services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "login", namespace = "http://Services/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "login", namespace = "http://Services/", propOrder = {
    "uname",
    "pass"
})
public class Login {

    @XmlElement(name = "uname", namespace = "")
    private String uname;
    @XmlElement(name = "pass", namespace = "")
    private String pass;

    /**
     * 
     * @return
     *     returns String
     */
    public String getUname() {
        return this.uname;
    }

    /**
     * 
     * @param uname
     *     the value for the uname property
     */
    public void setUname(String uname) {
        this.uname = uname;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getPass() {
        return this.pass;
    }

    /**
     * 
     * @param pass
     *     the value for the pass property
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

}
