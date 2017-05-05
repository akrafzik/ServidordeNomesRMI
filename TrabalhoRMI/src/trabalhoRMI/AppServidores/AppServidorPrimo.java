package trabalhoRMI.AppServidores;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import trabalhoRMI.Interfaces.servidorPrimo;
import trabalhoRMI.logicaServidores.logicaServidorPrimo;

public class AppServidorPrimo {
    public static void main(String[] args) {
        try {
            servidorPrimo m = new logicaServidorPrimo();
            LocateRegistry.createRegistry(2001);
            Naming.rebind("rmi://localhost:2001/primo", m);
            System.out.println("Servidor de primo está Online");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
