package trabalhoRMI.Requisicoes;

import java.io.Serializable;

public class servDisponivelReq implements Serializable{
    boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
