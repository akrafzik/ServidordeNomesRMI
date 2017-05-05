package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.servMenorResp;
import trabalhoRMI.Requisicoes.servMenorReq;

public interface servidorMenor extends Remote{
	
	public servMenorResp menor(servMenorReq servmenorreq) throws RemoteException;
            
}    

