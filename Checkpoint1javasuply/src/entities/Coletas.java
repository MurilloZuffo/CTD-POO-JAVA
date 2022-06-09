package entities;

public class Coletas {

    private int id;
    private String data;
    private int volume;

    private Endereco endereco;

    public Coletas() {
    }

    public Coletas(int id, String data, int volume, Endereco endereco) {
        this.id = id;
        this.data = data;
        this.volume = volume;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void coletar(){
        System.out.println("A coleta  "+ getId()+ " esta programada");
        
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Coletas{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", volume=" + volume +
                ", endereco=" + endereco +
                '}';
    }
}
    

