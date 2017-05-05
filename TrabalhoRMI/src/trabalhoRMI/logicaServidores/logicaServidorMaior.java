package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorMaior;
import trabalhoRMI.Requisicoes.servMaiorReq;
import trabalhoRMI.Respostas.servMaiorResp;

public class logicaServidorMaior extends UnicastRemoteObject implements servidorMaior{
    
    public logicaServidorMaior() throws RemoteException {
        super();
    }
    
    public servMaiorResp maior(servMaiorReq servmaiorreq) 
            throws RemoteException {
        
        servMaiorResp resposta = new servMaiorResp();
        float[] numeros = new float[10];
          numeros = servmaiorreq.getNumeros();
          resposta.setResultado(0);
        for (int i = 0; i < 10; i++) {
          if(numeros[i]>resposta.getResultado()){
            resposta.setResultado(numeros[i]);
            }
        }
        if (resposta.getResultado()!=0){
        resposta.setStatus(0);
        } else {
            resposta.setStatus(1);
        }
        return resposta;
    }
            
}
