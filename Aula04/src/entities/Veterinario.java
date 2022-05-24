package entities;

public class Veterinario {
    private String nome;
    private String sobreNome;
    private String registro;
    private double salario;

//    construtor padrão Alt + inset
    public Veterinario() {
    }

//    Construto com parâmetros
    public Veterinario(String nome, String sobreNome) {
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //significa que o método esta sobre escrito
    @Override
    public String toString() {
        return "Veterinario{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", registro='" + registro + '\'' +
                ", salario=" + salario +
                '}';
    }
}
