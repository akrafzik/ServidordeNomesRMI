package trabalhoRMI.Requisicoes;

import java.io.Serializable;

public class servMediaReq implements Serializable{
    float [] numeros = new float [10];

    public float[] getNumeros() {
        return numeros;
    }

    public void setNumeros(float[] numeros) {
        this.numeros = numeros;
    }
}
