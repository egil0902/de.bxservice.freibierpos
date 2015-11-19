package de.bxservice.bxpos.logic.webservices;

import android.content.Context;

import org.idempiere.webservice.client.base.LoginRequest;
import org.idempiere.webservice.client.net.WebServiceClient;

import java.util.Properties;

/**
 * Created by Diego Ruiz on 4/11/15.
 */
public abstract class AbstractWSObject {

    private LoginRequest login;
    private WebServiceClient client;
    private WebServiceRequestData wsData;

    public AbstractWSObject() {

        wsData = WebServiceRequestData.getInstance();

        if ( wsData.isDataComplete()  ){
            initLogin();
            initClient();
            runWebService();
        }
    }

    public AbstractWSObject(String parameter) {

        wsData = WebServiceRequestData.getInstance();

        if ( wsData.isDataComplete()  ){
            initLogin();
            initClient();
            setParameter(parameter);
            runWebService();
        }

    }

    public void initLogin(){
        login = new LoginRequest();

        login.setUser(wsData.getUsername());
        login.setPass(wsData.getPassword());
        login.setClientID(Integer.parseInt(wsData.getClientId()));
        login.setRoleID(Integer.parseInt(wsData.getRoleId()));
        login.setOrgID(Integer.parseInt(wsData.getOrgId()));
    }

    public void initClient(){
        client = new WebServiceClient();

        client.setAttempts(Integer.parseInt(wsData.getAttemptsNo()));
        client.setTimeout(Integer.parseInt(wsData.getTimeout()));
        client.setAttemptsTimeout(Integer.parseInt(wsData.getAttemptsTimeout()));
        client.setWebServiceUrl(wsData.getUrlBase());
        client.setUserAgentProduct("Android Test WS Client");
    }

    public LoginRequest getLogin() {
        return login;
    }

    public WebServiceClient getClient() {
        return client;
    }

    public void runWebService() {
        queryPerformed();
        /*saveRequestResponse();
        printTotal();
        System.out.println();*/
    }

    public abstract String getServiceType();

    public abstract void queryPerformed();

    public void setParameter(String parameter) {};

}