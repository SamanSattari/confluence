package team.supernova.confluence.soap.rpc.soap.actions;

import javax.xml.rpc.ServiceException;

import lombok.Getter;
import lombok.Setter;
import team.supernova.confluence.soap.rpc.soap.beans.RemotePageUpdateOptions;
import team.supernova.confluence.soap.rpc.soap.beans.RemotePage;

import java.rmi.RemoteException;

@Getter
@Setter
public class Page {
    private static Token token;

    public Page() throws ServiceException, RemoteException {
        token = Token.getInstance();
    }

    public RemotePage read(String spaceName, String pageName) throws RemoteException {
        RemotePage page = token.getService().getPage(token.getToken(), spaceName, pageName);
        return page;
    }

    public RemotePage read(Long id) throws RemoteException {
        RemotePage page = token.getService().getPage(token.getToken(), id);
        return page;
    }

    public RemotePage update(RemotePage page) throws java.rmi.RemoteException, ServiceException {
        RemotePageUpdateOptions rpuo = new RemotePageUpdateOptions();
        rpuo.isMinorEdit();

        return token.getService().updatePage(token.getToken(), page, rpuo);
    }

    public RemotePage store(RemotePage page) throws java.rmi.RemoteException, ServiceException {
        return token.getService().storePage(token.getToken(), page);
    }

    public Boolean move(RemotePage page, String position) throws RemoteException {
        return token.getService().movePage(token.getToken(), page.getId(), page.getId(), position);
    }

    public Boolean remove(Long id) throws RemoteException {
        return token.getService().removePage(token.getToken(), id);
    }
}
