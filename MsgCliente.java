import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by brunocesar on 27/06/17.
 */
public class MsgCliente{

    public static void main( String args[]) throws RemoteException, NotBoundException, MalformedURLException {

        String mensagem;

        MsgIntf msg = (MsgIntf) Naming.lookup("rmi://localhost:1099/MsgSrv");


        mensagem = msg.mostraMSG();
        System.out.println(mensagem);

    }

}
