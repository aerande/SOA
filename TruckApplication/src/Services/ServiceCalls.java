/**
 * ServiceCalls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public interface ServiceCalls extends java.rmi.Remote {
    public java.lang.String[][] findInvoiceByTransactionId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findExpenseByEmployeeId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findTransactionByEmployeeId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findTruckByDriverId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findOrderByCustomerId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findCommentByCustomerId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findTransactionByTransactionId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findPurposeOfExpenseByExpenseId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findLocationFromToByCustomerId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findPaymentByOrderId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findEmployeeByEmployeeId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findExpenseByTruckId(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] findTruckByVin(java.lang.String name) throws java.rmi.RemoteException;
    public boolean login(java.lang.String uname, java.lang.String pass) throws java.rmi.RemoteException;
    public java.lang.String[][] invoiceList() throws java.rmi.RemoteException;
    public java.lang.String[][] findTruckByMake(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String[][] truckList() throws java.rmi.RemoteException;
    public java.lang.String[][] driverList() throws java.rmi.RemoteException;
    public java.lang.String[][] orderList() throws java.rmi.RemoteException;
    public java.lang.String[][] customerList() throws java.rmi.RemoteException;
    public java.lang.String[][] employeeList() throws java.rmi.RemoteException;
}
