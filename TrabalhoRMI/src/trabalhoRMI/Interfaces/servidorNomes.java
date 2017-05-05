package trabalhoRMI.Interfaces;

import java.rmi.*;
import trabalhoRMI.Respostas.regServsResp;
import trabalhoRMI.Respostas.consultServResp;
import trabalhoRMI.Respostas.servOcupadoResp;
import trabalhoRMI.Respostas.servDisponivelResp;
import trabalhoRMI.Requisicoes.regServsReq;
import trabalhoRMI.Requisicoes.consultServReq;
import trabalhoRMI.Requisicoes.servOcupadoReq;
import trabalhoRMI.Requisicoes.servDisponivelReq;

public interface servidorNomes extends Remote{
    
    public regServsResp registro(regServsReq regservsreq) 
            throws RemoteException;
        
    public consultServResp consulta(consultServReq consultservreq)
            throws RemoteException;
        
    public servOcupadoResp ocupado(servOcupadoReq servocupadoreq)
            throws RemoteException;
        
    public servDisponivelResp disponivel(servDisponivelReq servdisponivelreq)
            throws RemoteException;
   
}
