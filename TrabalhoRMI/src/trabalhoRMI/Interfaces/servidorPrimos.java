package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.servPrimoResp;
import trabalhoRMI.Requisicoes.servPrimoReq;

public interface servidorPrimos extends Remote{
    
    	public servPrimoResp primos(servPrimoReq servprimoreq) throws RemoteException;

    
}
