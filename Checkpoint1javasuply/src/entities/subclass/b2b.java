package entities.subclass;

import entities.Coletas;
import entities.Endereco;

public class b2b extends Coletas {

    private String cnpj;
    private String cliente;
    private String serialNumber;

    public b2b(int id, String data, int volume, Endereco endereco, String cnpj, String cliente, String serialNumber) {
        super(id, data, volume, endereco);
        this.cnpj = cnpj;
        this.cliente = cliente;
        this.serialNumber = serialNumber;
    }

    public void coletar(){
        System.out.println("A coleta  "+ getId()+ " esta programada");

    }

    @Override
    public String toString() {
        return "b2b{" +
                "cnpj='" + cnpj + '\'' +
                ", cliente='" + cliente + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
