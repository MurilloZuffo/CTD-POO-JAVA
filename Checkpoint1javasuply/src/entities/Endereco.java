package entities;

public class Endereco {

    private String rua;
    private int numero;
    private String cidade;
    private String estado;


    public Endereco() {
    }

    public Endereco( String rua, int numero, String cidade, String estado) {
        
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }



    @Override
    public String toString() {
        return "Endereco{" +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
