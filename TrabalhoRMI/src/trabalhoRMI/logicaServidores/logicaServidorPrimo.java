package trabalhoRMI.logicaServidores;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import trabalhoRMI.Interfaces.servidorPrimo;
import trabalhoRMI.Requisicoes.servPrimoReq;
import trabalhoRMI.Respostas.servPrimoResp;

public class logicaServidorPrimo extends UnicastRemoteObject implements servidorPrimo{
    
    public logicaServidorPrimo() throws RemoteException {
        super();
    }
    
    public servPrimoResp primo(servPrimoReq servprimoreq) throws RemoteException{
        
        servPrimoResp resposta = new servPrimoResp();
        
        int[] numeros = servprimoreq.getNumeros();
        resposta.setResultado(0);
        
        for (int i = 0; i < 10; i++) {
            int numero = numeros[i];
            int cont = 0;
            for (int j = 1; j <= numero; j++) {
                if(numero%j==0){
                    cont = cont+1;
                }
            }
            if (cont == 2){
                resposta.setResultado(resposta.getResultado()+1);
            }
            
        }
        if(resposta.getResultado()==0){
            resposta.setStatus(1);
        } else {
            resposta.setStatus(0);
        }
        
        
        return resposta;
    }
}
