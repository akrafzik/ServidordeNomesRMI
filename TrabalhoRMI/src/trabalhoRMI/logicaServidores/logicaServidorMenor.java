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
        
        float[] numeros = new float[10];
          numeros = servmenorreq.getNumeros();
          resposta.setResultado(0);
        for (int i = 0; i < 10; i++) {
          if(numeros[i]<resposta.getResultado()){
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
