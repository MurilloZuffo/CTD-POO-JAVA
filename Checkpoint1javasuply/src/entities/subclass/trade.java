package entities.subclass;

import entities.Coletas;
import entities.Endereco;

public class trade extends Coletas {

    private String OrdemdeCompra;
    private String Motivo;
    private int nfd;

    public trade(int id, String data, int volume, Endereco endereco, String ordemdeCompra, String motivo, int nfd) {
        super(id, data, volume, endereco);
        OrdemdeCompra = ordemdeCompra;
        Motivo = motivo;
        this.nfd = nfd;
    }

    public void coletar(){
        System.out.println("A coleta  "+ getId()+ " esta programada");

    }

    @Override
    public String toString() {
        return "trade{" +
                "OrdemdeCompra='" + OrdemdeCompra + '\'' +
                ", Motivo='" + Motivo + '\'' +
                ", nfd=" + nfd +
                '}';
    }
}
