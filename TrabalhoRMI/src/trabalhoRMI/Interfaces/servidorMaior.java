package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.servMaiorResp;
import trabalhoRMI.Requisicoes.servMaiorReq;

public interface servidorMaior extends Remote{
	
	public servMaiorResp maior(servMaiorReq servmaiorreq) throws RemoteException;
            
}  
