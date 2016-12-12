/**
 * AxiLinkServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:08:57 BST)
 */
package ru.sample.qiwi.axilink.ws;


/**
 *  AxiLinkServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class AxiLinkServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public AxiLinkServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public AxiLinkServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for getApplicationDecision method
     * override this method for handling normal response from getApplicationDecision operation
     */
    public void receiveResultgetApplicationDecision(
            ru.sample.qiwi.axilink.ws.AxiLinkServiceStub.GetApplicationDecisionResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getApplicationDecision operation
     */
    public void receiveErrorgetApplicationDecision(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getApplication method
     * override this method for handling normal response from getApplication operation
     */
    public void receiveResultgetApplication(
        ru.sample.qiwi.axilink.ws.AxiLinkServiceStub.GetApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getApplication operation
     */
    public void receiveErrorgetApplication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for setApplication method
     * override this method for handling normal response from setApplication operation
     */
    public void receiveResultsetApplication(
        ru.sample.qiwi.axilink.ws.AxiLinkServiceStub.SetApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from setApplication operation
     */
    public void receiveErrorsetApplication(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getApplicationStatus method
     * override this method for handling normal response from getApplicationStatus operation
     */
    public void receiveResultgetApplicationStatus(
        ru.sample.qiwi.axilink.ws.AxiLinkServiceStub.GetApplicationStatusResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getApplicationStatus operation
     */
    public void receiveErrorgetApplicationStatus(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for createApplication method
     * override this method for handling normal response from createApplication operation
     */
    public void receiveResultcreateApplication(
        ru.sample.qiwi.axilink.ws.AxiLinkServiceStub.CreateApplicationResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from createApplication operation
     */
    public void receiveErrorcreateApplication(java.lang.Exception e) {
    }
}
