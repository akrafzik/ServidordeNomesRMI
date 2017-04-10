package trabalhoRMI.Requisições;

import java.io.Serializable;

public class servMenorReq implements Serializable{
    float[] numeros = new float[10];

    public float[] getNumeros() {
        return numeros;
    }

    public void setNumeros(float[] numeros) {
        this.numeros = numeros;
    }
}
