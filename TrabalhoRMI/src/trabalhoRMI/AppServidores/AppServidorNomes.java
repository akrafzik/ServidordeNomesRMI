package trabalhoRMI.AppServidores;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import trabalhoRMI.Interfaces.servidorNomes;
import trabalhoRMI.logicaServidores.logicaServidorNomes;

public class AppServidorNomes {
    public static void main(String[] args) {
        try {
            servidorNomes m = new logicaServidorNomes();
            LocateRegistry.createRegistry(2000);
            Naming.rebind("rmi://localhost:2000/nomes", m);
            System.out.println("Servidor de nomes está Online");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
