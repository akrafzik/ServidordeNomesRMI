package trabalhoRMI.AppServidores;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import trabalhoRMI.Interfaces.servidorMenor;
import trabalhoRMI.logicaServidores.logicaServidorMenor;

public class AppServidorMenor {
    public static void main(String[] args) {
        try {
            servidorMenor m = new logicaServidorMenor();
            LocateRegistry.createRegistry(2003);
            Naming.rebind("rmi://localhost:2003/menor", m);
            System.out.println("Servidor de menor está Online");
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
