package entities.subclass;

import entities.Coletas;
import entities.Endereco;

public class b2c extends Coletas {

    private String cpf;
    private String produto;
    private String dataCompra;

    public b2c(int id, String data, int volume, Endereco endereco, String cpf, String produto, String dataCompra) {
        super(id, data, volume, endereco);
        this.cpf = cpf;
        this.produto = produto;
        this.dataCompra = dataCompra;
    }

    public void coletar(){
        System.out.println("A coleta  "+ getId()+ " esta programada");

    }

    @Override
    public String toString() {
        return "b2c{" +
                "cpf='" + cpf + '\'' +
                ", produto='" + produto + '\'' +
                ", dataCompra='" + dataCompra + '\'' +
                '}';
    }
}
