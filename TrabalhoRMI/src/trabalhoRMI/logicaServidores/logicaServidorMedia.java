package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorMedia;
import trabalhoRMI.Requisicoes.servMediaReq;
import trabalhoRMI.Respostas.servMediaResp;


public class logicaServidorMedia extends UnicastRemoteObject implements  servidorMedia{
    
    public logicaServidorMedia() throws RemoteException {
        super();
    }
     
    public servMediaResp media(servMediaReq servmediareq) 
            throws RemoteException{
        
        servMediaResp resposta = new servMediaResp();
        
        return resposta;
    }
}
