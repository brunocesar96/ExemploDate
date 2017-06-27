import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MsgIntf extends Remote {

    String mostraMSG() throws RemoteException;

}
