package trabalhoRMI.Respostas;

import java.io.Serializable;

public class servMaiorResp implements Serializable{
    int status;
    float resultado;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
}
