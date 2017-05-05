package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorPrimo;
import trabalhoRMI.Requisicoes.servPrimoReq;
import trabalhoRMI.Respostas.servPrimoResp;

public class logicaServidorPrimo extends UnicastRemoteObject implements servidorPrimo{
    
    public logicaServidorPrimo() throws RemoteException {
        super();
    }
    
    public servPrimoResp primo(servPrimoReq servprimoreq) throws RemoteException{
        
        servPrimoResp resposta = new servPrimoResp();
        
        return resposta;
    }
}
