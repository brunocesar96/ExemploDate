import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by brunocesar on 27/06/17.
 */
public class MsgImpl extends UnicastRemoteObject implements MsgIntf {

    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    protected MsgImpl() throws RemoteException {
    }

    @Override
    public String mostraMSG() throws RemoteException {
//
        return "OK";
    }

    public static void main(String args[]){

        try{
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
            Registry reg = LocateRegistry.getRegistry("localhost");

            MsgIntf msg = new MsgImpl();
            Naming.rebind("MsgSrv",msg);

            System.out.println("Msg Ativo...");

        }catch (Exception e){e.getMessage();}

    }
}
