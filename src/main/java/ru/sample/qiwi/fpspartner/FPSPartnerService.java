/**
 * FPSPartnerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package ru.sample.qiwi.fpspartner;


/*
 *  FPSPartnerService java interface
 */
public interface FPSPartnerService {
    /**
     * Auto generated method signature
     *
     * @param processingApplication0
     */
    public ru.sample.qiwi.fpspartner.ProcessingApplicationResponse processingApplication(
        ru.sample.qiwi.fpspartner.ProcessingApplication processingApplication0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param processingApplication0
     */
    public void startprocessingApplication(
        ru.sample.qiwi.fpspartner.ProcessingApplication processingApplication0,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateFraudStatus2
     */
    public ru.sample.qiwi.fpspartner.UpdateFraudStatusResponse updateFraudStatus(
        ru.sample.qiwi.fpspartner.UpdateFraudStatus updateFraudStatus2)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateFraudStatus2
     */
    public void startupdateFraudStatus(
        ru.sample.qiwi.fpspartner.UpdateFraudStatus updateFraudStatus2,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateCreditStatus4
     */
    public ru.sample.qiwi.fpspartner.UpdateCreditStatusResponse updateCreditStatus(
        ru.sample.qiwi.fpspartner.UpdateCreditStatus updateCreditStatus4)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateCreditStatus4
     */
    public void startupdateCreditStatus(
        ru.sample.qiwi.fpspartner.UpdateCreditStatus updateCreditStatus4,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param deleteApplication6
     */
    public ru.sample.qiwi.fpspartner.DeleteApplicationResponse deleteApplication(
        ru.sample.qiwi.fpspartner.DeleteApplication deleteApplication6)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param deleteApplication6
     */
    public void startdeleteApplication(
        ru.sample.qiwi.fpspartner.DeleteApplication deleteApplication6,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param newApplication8
     */
    public ru.sample.qiwi.fpspartner.NewApplicationResponse newApplication(
        ru.sample.qiwi.fpspartner.NewApplication newApplication8)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param newApplication8
     */
    public void startnewApplication(
        ru.sample.qiwi.fpspartner.NewApplication newApplication8,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param updateDefaultStatus10
     */
    public ru.sample.qiwi.fpspartner.UpdateDefaultStatusResponse updateDefaultStatus(
        ru.sample.qiwi.fpspartner.UpdateDefaultStatus updateDefaultStatus10)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param updateDefaultStatus10
     */
    public void startupdateDefaultStatus(
        ru.sample.qiwi.fpspartner.UpdateDefaultStatus updateDefaultStatus10,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param outputVector12
     */
    public ru.sample.qiwi.fpspartner.OutputVectorResponse outputVector(
        ru.sample.qiwi.fpspartner.OutputVector outputVector12)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature for Asynchronous Invocations
     *
     * @param outputVector12
     */
    public void startoutputVector(
        ru.sample.qiwi.fpspartner.OutputVector outputVector12,
        final ru.sample.qiwi.fpspartner.FPSPartnerServiceCallbackHandler callback)
        throws java.rmi.RemoteException;

    //
}
