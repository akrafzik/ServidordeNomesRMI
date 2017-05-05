package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorMenor;
import trabalhoRMI.Requisicoes.servMenorReq;
import trabalhoRMI.Respostas.servMenorResp;

/**
 *
 * @author Alec
 */
public class logicaServidorMenor extends UnicastRemoteObject implements servidorMenor{
    
    public logicaServidorMenor() throws RemoteException {
        super();
    }
    
    public servMenorResp menor(servMenorReq servmenorreq) 
            throws RemoteException{
        
        servMenorResp resposta = new servMenorResp();
        
        return resposta;
    }
}
