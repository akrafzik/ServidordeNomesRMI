package trabalhoRMI.AppServidores;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import trabalhoRMI.Interfaces.servidorMaior;
import trabalhoRMI.logicaServidores.logicaServidorMaior;

public class AppServidorMaior {
    public static void main(String[] args) {
        try {
            servidorMaior m = new logicaServidorMaior();
            LocateRegistry.createRegistry(2002);
            Naming.rebind("rmi://localhost:2002/maior", m);
            System.out.println("Servidor de maior está Online");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
