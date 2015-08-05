package team.supernova.confluence.soap;

import lombok.Getter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import team.supernova.confluence.soap.rpc.soap.actions.Page;
import team.supernova.confluence.soap.rpc.soap.actions.Token;
import team.supernova.confluence.soap.rpc.soap.beans.RemotePage;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * Created by m05f757 on 4-8-2015.
 */
public class ConfluenceTest {
    private static final Logger LOG = Logger.getLogger(ConfluenceTest.class.toString());
    private static final String TEST_PROPS_FILE = "test.properties";
    private final static String PROJECT = "kaas";
    private final static String TARGET_PAGE = "LLDS_1";
    @Getter
    private Properties testProperties;

    @BeforeSuite
    public void initializeConfluence() throws ServiceException, RemoteException {
        try {
            testProperties = new Properties();
            testProperties.load(this.getClass().getClassLoader().getResourceAsStream(TEST_PROPS_FILE));
        }
        catch (Exception e) {
            LOG.severe(String.format(
                    "fatal error retrieving test properties [%s]: %s",
                    TEST_PROPS_FILE,
                    e.getMessage()));

            throw new RuntimeException(e);
        }

        String confluenceUser = getTestProperties().getProperty("confluence.user");
        String confluencePassword = getTestProperties().getProperty("confluence.password");
        String endpointAddress = getTestProperties().getProperty("confluence.endpointaddress");

        Token token = Token.getInstance();
        token.initialise(confluenceUser, confluencePassword, endpointAddress);
    }

    @Test
    public void testReadPage(){
        try {
            Page page = new Page();

            RemotePage utPage = page.read(PROJECT, TARGET_PAGE);
            LOG.info(utPage.getContent().toString());
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
        }
    }

}
