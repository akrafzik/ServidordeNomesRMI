package trabalhoRMI.Respostas;

import java.io.Serializable;

public class servMenorResp implements Serializable{
    int status;
    int resultado;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
