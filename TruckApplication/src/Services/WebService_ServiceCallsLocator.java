/**
 * WebService_ServiceCallsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class WebService_ServiceCallsLocator extends org.apache.axis.client.Service implements Services.WebService_ServiceCalls {

    public WebService_ServiceCallsLocator() {
    }


    public WebService_ServiceCallsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebService_ServiceCallsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceCallsPort
    private java.lang.String ServiceCallsPort_address = "http://localhost:8088/TruckApplication/ser";

    public java.lang.String getServiceCallsPortAddress() {
        return ServiceCallsPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceCallsPortWSDDServiceName = "ServiceCallsPort";

    public java.lang.String getServiceCallsPortWSDDServiceName() {
        return ServiceCallsPortWSDDServiceName;
    }

    public void setServiceCallsPortWSDDServiceName(java.lang.String name) {
        ServiceCallsPortWSDDServiceName = name;
    }

    public Services.ServiceCalls getServiceCallsPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceCallsPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceCallsPort(endpoint);
    }

    public Services.ServiceCalls getServiceCallsPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Services.ServiceCallsPortBindingStub _stub = new Services.ServiceCallsPortBindingStub(portAddress, this);
            _stub.setPortName(getServiceCallsPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceCallsPortEndpointAddress(java.lang.String address) {
        ServiceCallsPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Services.ServiceCalls.class.isAssignableFrom(serviceEndpointInterface)) {
                Services.ServiceCallsPortBindingStub _stub = new Services.ServiceCallsPortBindingStub(new java.net.URL(ServiceCallsPort_address), this);
                _stub.setPortName(getServiceCallsPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceCallsPort".equals(inputPortName)) {
            return getServiceCallsPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Services/", "WebService_ServiceCalls");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Services/", "ServiceCallsPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceCallsPort".equals(portName)) {
            setServiceCallsPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
