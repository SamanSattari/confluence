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

import static org.testng.Assert.*;

/**
 * Created by christopher-reedijk on 4-8-2015.
 */
public class ConfluenceTest {
    private static final Logger LOG = Logger.getLogger(ConfluenceTest.class.toString());
    private static final String TEST_PROPS_FILE = "test.properties";
    private String project;
    private String target_page;
    @Getter
    private Properties testProperties;
    private Token token;
    private String personalSpace;

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

        project =  getTestProperties().getProperty("confluence.space");
        target_page = getTestProperties().getProperty("confluence.group");
        String confluenceUser = getTestProperties().getProperty("confluence.user");
        String confluencePassword = getTestProperties().getProperty("confluence.password");
        String endpointAddress = getTestProperties().getProperty("confluence.endpointaddress");
        personalSpace = getTestProperties().getProperty("confluence.personalSpace");

        token = Token.getInstance();
        token.initialise(confluenceUser, confluencePassword, endpointAddress);
    }

    @Test
    public void testReadPage(){
        try {
            Page page = new Page();

            RemotePage utPage = page.read(project, target_page);
            LOG.info(utPage.getContent().toString());
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        }
    }

    @Test
     public void testGetUserByKey(){
        try {
            LOG.info(token.getServiceLocator().getConfluenceserviceV2().getUserByKey(token.getToken(),"8ac92cf346de76b60146de7a664802e4").getFullname());
            LOG.info(token.getServiceLocator().getConfluenceserviceV2().getUserByName(token.getToken(),"BH89VZ").getKey());
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        }
    }

    /**
     * exportTypes: "TYPE_XML" or "TYPE_HTML"
     */
    @Test
    public void testExportSpace(){
        try {
            LOG.info(token.getServiceLocator().getConfluenceserviceV2().exportSpace(token.getToken(),personalSpace,"TYPE_XML"));
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        }
    }

    @Test
    public void testUpdateWithoutNotification(){
        try {
            Page page = new Page();

            RemotePage utPage = page.read(personalSpace, "Test");
            LOG.info(utPage.getContent().toString());
            utPage.setContent(utPage.getContent().replace("test", "update"));
            page.update(utPage, false);

            utPage = page.read(personalSpace, "Test");
            LOG.info(utPage.getContent().toString());
            utPage.setContent(utPage.getContent().replace("update", "test"));
            page.update(utPage, false);
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        }
    }

    @Test
    public void testUpdateWithNotification(){
        try {
            Page page = new Page();

            RemotePage utPage = page.read(personalSpace, "Test");
            LOG.info(utPage.getContent().toString());
            utPage.setContent(utPage.getContent().replace("test", "update"));
            page.update(utPage, true);

            utPage = page.read(personalSpace, "Test");
            LOG.info(utPage.getContent().toString());
            utPage.setContent(utPage.getContent().replace("update", "test"));
            page.update(utPage, true);
        } catch (RemoteException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        } catch (ServiceException e) {
            LOG.severe(e.getMessage());
            assertFalse(false);
        }
    }

}
