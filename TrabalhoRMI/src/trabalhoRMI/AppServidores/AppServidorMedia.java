package trabalhoRMI.AppServidores;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import trabalhoRMI.Interfaces.servidorMedia;
import trabalhoRMI.logicaServidores.logicaServidorMedia;

public class AppServidorMedia {
    public static void main(String[] args) {
        try{
            servidorMedia m = new logicaServidorMedia();
            LocateRegistry.createRegistry(2004);
            Naming.rebind("rmi://localhost:2004/media", m);
            System.out.println("Servidor de media está Online");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
