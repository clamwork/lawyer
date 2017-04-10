package com.lenchy.lms.service.ws2;

public class ILawyerPassDataServiceProxy implements com.lenchy.lms.service.ws2.ILawyerPassDataService {
  private String _endpoint = null;
  private com.lenchy.lms.service.ws2.ILawyerPassDataService iLawyerPassDataService = null;
  
  public ILawyerPassDataServiceProxy() {
    _initILawyerPassDataServiceProxy();
  }
  
  public ILawyerPassDataServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initILawyerPassDataServiceProxy();
  }
  
  private void _initILawyerPassDataServiceProxy() {
    try {
      iLawyerPassDataService = (new com.lenchy.lms.service.ws2.LawyerPassDataServiceServiceLocator()).getLawyerPassDataServicePort();
      if (iLawyerPassDataService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iLawyerPassDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iLawyerPassDataService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iLawyerPassDataService != null)
      ((javax.xml.rpc.Stub)iLawyerPassDataService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.lenchy.lms.service.ws2.ILawyerPassDataService getILawyerPassDataService() {
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService;
  }
  
  public com.lenchy.lms.service.ws2.LawFirm getLawFirm(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.getLawFirm(arg0);
  }
  
  public com.lenchy.lms.service.ws2.LawFirm[] searchLawFirms(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.searchLawFirms(arg0, arg1, arg2);
  }
  
  public com.lenchy.lms.service.ws2.Lawyer getLawyer(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.getLawyer(arg0);
  }
  
  public com.lenchy.lms.service.ws2.LawFirm getLawFirmByPersonId(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.getLawFirmByPersonId(arg0);
  }
  
  public com.lenchy.lms.service.ws2.Lawyer[] searchLawyers(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.searchLawyers(arg0, arg1, arg2);
  }
  
  public com.lenchy.lms.service.ws2.Lawyer getLawyerByPersonId(java.lang.String arg0) throws java.rmi.RemoteException{
    if (iLawyerPassDataService == null)
      _initILawyerPassDataServiceProxy();
    return iLawyerPassDataService.getLawyerByPersonId(arg0);
  }
  
  
}