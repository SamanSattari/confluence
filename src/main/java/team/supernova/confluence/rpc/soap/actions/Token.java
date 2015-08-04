package team.supernova.confluence.rpc.soap.actions;

import lombok.Getter;
import lombok.Setter;
import team.supernova.confluence.plugins.servlet.soap_axis.confluenceservice.ConfluenceSoapService;
import team.supernova.confluence.plugins.servlet.soap_axis.confluenceservice.ConfluenceSoapServiceServiceLocator;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created by m05f757 on 4-8-2014.
 */
@Getter
@Setter
public class Token {

    private static final String PORT_NAME = "ConfluenceserviceV2";
    private static final String SERVICE_NAME = "confluenceservice-v2";
    private ConfluenceSoapService service;
    private String token;

    /*
	 * Singleton instance for CQLRegistry
	 */
    private static volatile Token instance = null;

    /**
     * @return Returns the singleton for CQLRegistry
     */
    public static Token getInstance() throws ServiceException, RemoteException {

        if (instance == null) {
            synchronized (Token.class) {
                if (instance == null) {
                    instance = new Token();
                }
            }
        }
        return instance;
    }

    public void initialise(String user, String password, String endPointAddress) throws ServiceException, RemoteException {
        ConfluenceSoapServiceServiceLocator serviceLocator = new ConfluenceSoapServiceServiceLocator();
        serviceLocator.setConfluenceserviceV2WSDDServiceName(SERVICE_NAME);
        serviceLocator.setConfluenceserviceV2EndpointAddress(endPointAddress);
        serviceLocator.setEndpointAddress(PORT_NAME, endPointAddress);
        service = serviceLocator.getConfluenceserviceV2();

        // insert your account data here
        token = service.login(user, password);
    }

}
