package Services;

public class ServiceCallsProxy implements Services.ServiceCalls {
  private String _endpoint = null;
  private Services.ServiceCalls serviceCalls = null;
  
  public ServiceCallsProxy() {
    _initServiceCallsProxy();
  }
  
  public ServiceCallsProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceCallsProxy();
  }
  
  private void _initServiceCallsProxy() {
    try {
      serviceCalls = (new Services.WebService_ServiceCallsLocator()).getServiceCallsPort();
      if (serviceCalls != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceCalls)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceCalls)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceCalls != null)
      ((javax.xml.rpc.Stub)serviceCalls)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Services.ServiceCalls getServiceCalls() {
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls;
  }
  
  public java.lang.String[][] findInvoiceByTransactionId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findInvoiceByTransactionId(name);
  }
  
  public java.lang.String[][] findExpenseByEmployeeId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findExpenseByEmployeeId(name);
  }
  
  public java.lang.String[][] findTransactionByEmployeeId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findTransactionByEmployeeId(name);
  }
  
  public java.lang.String[][] findTruckByDriverId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findTruckByDriverId(name);
  }
  
  public java.lang.String[][] findOrderByCustomerId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findOrderByCustomerId(name);
  }
  
  public java.lang.String[][] findCommentByCustomerId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findCommentByCustomerId(name);
  }
  
  public java.lang.String[][] findTransactionByTransactionId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findTransactionByTransactionId(name);
  }
  
  public java.lang.String[][] findPurposeOfExpenseByExpenseId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findPurposeOfExpenseByExpenseId(name);
  }
  
  public java.lang.String[][] findLocationFromToByCustomerId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findLocationFromToByCustomerId(name);
  }
  
  public java.lang.String[][] findPaymentByOrderId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findPaymentByOrderId(name);
  }
  
  public java.lang.String[][] findEmployeeByEmployeeId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findEmployeeByEmployeeId(name);
  }
  
  public java.lang.String[][] findExpenseByTruckId(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findExpenseByTruckId(name);
  }
  
  public java.lang.String[][] findTruckByVin(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findTruckByVin(name);
  }
  
  public boolean login(java.lang.String uname, java.lang.String pass) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.login(uname, pass);
  }
  
  public java.lang.String[][] invoiceList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.invoiceList();
  }
  
  public java.lang.String[][] findTruckByMake(java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.findTruckByMake(name);
  }
  
  public java.lang.String[][] truckList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.truckList();
  }
  
  public java.lang.String[][] driverList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.driverList();
  }
  
  public java.lang.String[][] orderList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.orderList();
  }
  
  public java.lang.String[][] customerList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.customerList();
  }
  
  public java.lang.String[][] employeeList() throws java.rmi.RemoteException{
    if (serviceCalls == null)
      _initServiceCallsProxy();
    return serviceCalls.employeeList();
  }
  
  
}