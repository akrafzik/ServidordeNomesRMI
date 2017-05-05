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
        
        float[] numeros = new float [10];
        numeros = servmediareq.getNumeros();
        float media = 0;
        
        for (int i = 0; i < 10; i++) {
            media = media+numeros[i];
        }
        
        resposta.setResultado(media/10);
        
        if (resposta.getResultado()!=0){
            resposta.setStatus(0);
        } else {
            resposta.setStatus(1);
        }
        
        return resposta;
    }
}
