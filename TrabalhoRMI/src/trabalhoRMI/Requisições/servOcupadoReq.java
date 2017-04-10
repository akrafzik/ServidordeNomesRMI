package trabalhoRMI.Requisições;

import java.io.Serializable;

public class servOcupadoReq implements Serializable{
    boolean status;
    String endereco;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
