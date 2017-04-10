package trabalhoRMI.Respostas;

import java.io.Serializable;

public class consultServResp implements Serializable{
    int status;
    String endereco; 
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
  
}
