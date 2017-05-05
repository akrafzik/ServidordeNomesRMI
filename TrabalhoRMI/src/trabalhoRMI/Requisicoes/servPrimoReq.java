package trabalhoRMI.Requisicoes;

import java.io.Serializable;

public class servPrimoReq implements Serializable{
    int[] numeros = new int[10];

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }
}
