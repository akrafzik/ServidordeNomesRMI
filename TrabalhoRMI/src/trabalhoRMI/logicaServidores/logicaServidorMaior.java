package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorMaior;
import trabalhoRMI.Requisicoes.servMaiorReq;
import trabalhoRMI.Respostas.servMaiorResp;

public class logicaServidorMaior extends UnicastRemoteObject implements servidorMaior{
    
    public logicaServidorMaior() throws RemoteException {
        super();
    }
    
    public servMaiorResp maior(servMaiorReq servmaiorreq) 
            throws RemoteException {
        
        servMaiorResp resposta = new servMaiorResp();
        
        return resposta;
    }
            
}
