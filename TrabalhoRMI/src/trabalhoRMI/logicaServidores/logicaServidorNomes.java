package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorNomes;
import trabalhoRMI.Requisicoes.consultServReq;
import trabalhoRMI.Requisicoes.regServsReq;
import trabalhoRMI.Requisicoes.servDisponivelReq;
import trabalhoRMI.Requisicoes.servOcupadoReq;
import trabalhoRMI.Respostas.consultServResp;
import trabalhoRMI.Respostas.regServsResp;
import trabalhoRMI.Respostas.servDisponivelResp;
import trabalhoRMI.Respostas.servOcupadoResp;

public class logicaServidorNomes extends UnicastRemoteObject implements servidorNomes {
       
    public logicaServidorNomes() throws RemoteException {
        super();
    }
    
    public regServsResp registro(regServsReq regservsreq) 
            throws RemoteException {
        
        regServsResp resposta = new regServsResp();
        
        return resposta;
    }
    
    public consultServResp consulta(consultServReq consultservreq)
            throws RemoteException {
        
        consultServResp resposta = new consultServResp();
        
        return resposta;
    }
    
    public servOcupadoResp ocupado(servOcupadoReq servocupadoreq)
            throws RemoteException {
        
        servOcupadoResp resposta = new servOcupadoResp();
        
        return resposta;
    }
    
    public servDisponivelResp disponivel(servDisponivelReq servdisponivelreq)
            throws RemoteException{
        
        servDisponivelResp resposta = new servDisponivelResp();
        
        return resposta;
    }
}
