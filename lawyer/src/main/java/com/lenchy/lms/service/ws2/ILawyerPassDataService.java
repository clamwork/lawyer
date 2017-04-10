/**
 * ILawyerPassDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lenchy.lms.service.ws2;

public interface ILawyerPassDataService extends java.rmi.Remote {
    public com.lenchy.lms.service.ws2.LawFirm getLawFirm(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws2.LawFirm[] searchLawFirms(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws2.Lawyer getLawyer(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws2.LawFirm getLawFirmByPersonId(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws2.Lawyer[] searchLawyers(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws2.Lawyer getLawyerByPersonId(java.lang.String arg0) throws java.rmi.RemoteException;
}
