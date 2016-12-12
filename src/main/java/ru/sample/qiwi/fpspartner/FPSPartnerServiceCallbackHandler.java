/**
 * FPSPartnerServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package ru.sample.qiwi.fpspartner;


/**
 *  FPSPartnerServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class FPSPartnerServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public FPSPartnerServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public FPSPartnerServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for processingApplication method
     * override this method for handling normal response from processingApplication operation
     */
    public void receiveResultprocessingApplication(
        ru.sample.qiwi.fpspartner.ProcessingApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from processingApplication operation
     */
    public void receiveErrorprocessingApplication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateFraudStatus method
     * override this method for handling normal response from updateFraudStatus operation
     */
    public void receiveResultupdateFraudStatus(
        ru.sample.qiwi.fpspartner.UpdateFraudStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateFraudStatus operation
     */
    public void receiveErrorupdateFraudStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateCreditStatus method
     * override this method for handling normal response from updateCreditStatus operation
     */
    public void receiveResultupdateCreditStatus(
        ru.sample.qiwi.fpspartner.UpdateCreditStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateCreditStatus operation
     */
    public void receiveErrorupdateCreditStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for deleteApplication method
     * override this method for handling normal response from deleteApplication operation
     */
    public void receiveResultdeleteApplication(
        ru.sample.qiwi.fpspartner.DeleteApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from deleteApplication operation
     */
    public void receiveErrordeleteApplication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for newApplication method
     * override this method for handling normal response from newApplication operation
     */
    public void receiveResultnewApplication(
        ru.sample.qiwi.fpspartner.NewApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from newApplication operation
     */
    public void receiveErrornewApplication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for updateDefaultStatus method
     * override this method for handling normal response from updateDefaultStatus operation
     */
    public void receiveResultupdateDefaultStatus(
        ru.sample.qiwi.fpspartner.UpdateDefaultStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from updateDefaultStatus operation
     */
    public void receiveErrorupdateDefaultStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for outputVector method
     * override this method for handling normal response from outputVector operation
     */
    public void receiveResultoutputVector(
        ru.sample.qiwi.fpspartner.OutputVectorResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from outputVector operation
     */
    public void receiveErroroutputVector(java.lang.Exception e) {
    }
}
