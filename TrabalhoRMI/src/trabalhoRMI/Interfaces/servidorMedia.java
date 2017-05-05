package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.servMediaResp;
import trabalhoRMI.Requisicoes.servMediaReq;

public interface servidorMedia extends Remote{
	
	public servMediaResp media(servMediaReq servmediareq) throws RemoteException;
            
}    

