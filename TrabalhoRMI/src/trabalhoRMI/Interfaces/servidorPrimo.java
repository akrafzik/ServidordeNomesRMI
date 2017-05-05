package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.servPrimoResp;
import trabalhoRMI.Requisicoes.servPrimoReq;

public interface servidorPrimo extends Remote{
    
    	public servPrimoResp primo(servPrimoReq servprimoreq) 
            throws RemoteException;

    
}
