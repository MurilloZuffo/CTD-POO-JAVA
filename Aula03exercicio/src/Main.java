import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double  valorHora = 875/40, valorExtra= valorHora*1.5, SalarioSemanal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de horas trabalhadas na semana ");
        double horas = scanner.nextDouble();


        if (horas> 40) {

            SalarioSemanal= 40*valorHora + ((horas -40) *valorExtra);

        }
        else {

            SalarioSemanal= 40*valorHora;

        }

        System.out.println("O Salario Semanal e " +SalarioSemanal);


    }
}