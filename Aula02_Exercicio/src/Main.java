import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! Exercicio Aula 02");

        String name,lastname;
        int dia, mes, ano;
        char initialname,initiallast;

        Scanner ler =new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        name = ler.next();
        initialname = name.charAt(0);

        System.out.println("Informe o seu Sobrenome: ");
        lastname = ler.next();
        initiallast = lastname.charAt(0);

        System.out.println("seu nome é "+ name + " " + lastname );

        System.out.println(name + " Diga o dia do seu aniversario ");
        dia =ler.nextInt();

        System.out.println(name + " Diga o mes do seu aniversario ");
        mes =ler.nextInt();

        System.out.println(name + " Diga o ano de nascimento");
        ano =ler.nextInt();

//        Concatenação normal
        System.out.println(initialname +""+ initiallast + " "+name+ " " + lastname + " voce nasceu em "+ dia +"/"+mes+"/"+ano);

//        Concatenação com Format
        System.out.printf("%c%c %s %s Você nasceu em %d/%d/%d",initialname,initiallast,name,lastname,dia,mes,ano);

    }
}