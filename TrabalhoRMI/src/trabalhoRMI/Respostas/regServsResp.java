package trabalhoRMI.Respostas;

import java.io.Serializable;

public class regServsResp implements Serializable{
    int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int Status) {
        this.status = Status;
    }
    
}
