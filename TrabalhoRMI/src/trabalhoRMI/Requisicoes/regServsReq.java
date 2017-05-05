package trabalhoRMI.Requisicoes;

import java.io.Serializable;

public class regServsReq implements Serializable {

    String endereco;
    String[] servicosDisp = new String[4];

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String[] getServicosDisp() {
        return servicosDisp;
    }

    public void setServicosDisp(String[] servicosDisp) {
        this.servicosDisp = servicosDisp;
    }

}
