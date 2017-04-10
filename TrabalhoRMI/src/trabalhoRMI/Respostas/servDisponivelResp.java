package trabalhoRMI.Respostas;

import java.io.Serializable;

public class servDisponivelResp implements Serializable{
    int confirmacao;

    public int getConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(int confirmacao) {
        this.confirmacao = confirmacao;
    }
}
