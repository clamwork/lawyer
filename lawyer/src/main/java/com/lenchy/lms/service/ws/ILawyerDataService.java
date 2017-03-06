/**
 * ILawyerDataService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.lenchy.lms.service.ws;

public interface ILawyerDataService extends java.rmi.Remote {
    public com.lenchy.lms.service.ws.Lawyer getLawyerByPersonId(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws.Lawyer[] searchLawyers(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws.LawFirm getLawFirmByPersonId(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws.LawFirm getLawFirm(java.lang.String arg0) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws.LawFirm[] searchLawFirms(java.lang.String arg0, int arg1, int arg2) throws java.rmi.RemoteException;
    public com.lenchy.lms.service.ws.Lawyer getLawyer(java.lang.String arg0) throws java.rmi.RemoteException;
}
