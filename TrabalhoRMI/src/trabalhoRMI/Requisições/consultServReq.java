package trabalhoRMI.Requisições;

import java.io.Serializable;


public class consultServReq implements Serializable{
   String servicoBusca;

    public String getServicoBusca() {
        return servicoBusca;
    }

    public void setServicoBusca(String servicoBusca) {
        this.servicoBusca = servicoBusca;
    }
}
