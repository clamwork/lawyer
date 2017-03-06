package com.lenchy.lms.service.ws;

public class ILawyerDataServiceProxy implements com.lenchy.lms.service.ws.ILawyerDataService {
  private String _endpoint = null;
  private com.lenchy.lms.service.ws.ILawyerDataService iLawyerDataService = null;
  
  public ILawyerDataServiceProxy() {
    _initILawyerDataServiceProxy();
  }
  
  public ILawyerDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initILawyerDataServiceProxy();
  }
  
  private void _initILawyerDataServiceProxy() {
    try {
      iLawyerDataService = (new com.lenchy.lms.service.ws.LawyerDataServiceServiceLocator()).getLawyerDataServicePort();
      if (iLawyerDataService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iLawyerDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iLawyerDataService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iLawyerDataService != null)
      ((javax.xml.rpc.Stub)iLawyerDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lenchy.lms.service.ws.ILawyerDataService getILawyerDataService() {
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService;
  }
  
  public com.lenchy.lms.service.ws.Lawyer getLawyerByPersonId(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.getLawyerByPersonId(arg0);
  }
  
  public com.lenchy.lms.service.ws.Lawyer[] searchLawyers(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.searchLawyers(arg0, arg1, arg2);
  }
  
  public com.lenchy.lms.service.ws.LawFirm getLawFirmByPersonId(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.getLawFirmByPersonId(arg0);
  }
  
  public com.lenchy.lms.service.ws.LawFirm getLawFirm(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.getLawFirm(arg0);
  }
  
  public com.lenchy.lms.service.ws.LawFirm[] searchLawFirms(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.searchLawFirms(arg0, arg1, arg2);
  }
  
  public com.lenchy.lms.service.ws.Lawyer getLawyer(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerDataService == null)
      _initILawyerDataServiceProxy();
    return iLawyerDataService.getLawyer(arg0);
  }
  
  
}