import entities.Veterinario;

import java.sql.SQLOutput;

public class Program {
    public static void main(String[] args) {

        Veterinario v1 =new Veterinario();
        Veterinario v2 =new Veterinario("marta", "cunha");

        v1.setNome("Pablo");
        v1.setSobreNome("Cunha");
        v1.setRegistro("asd");
        v1.setSalario(4500);


        v2.setRegistro("mmas");
        v2.setSalario(5000);

        System.out.println(v1);
        System.out.println(v2);
    }





}
