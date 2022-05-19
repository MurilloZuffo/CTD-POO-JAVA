import java.util.Scanner;

public class Program {

    public static int quantosPacotes(double qtde){
        double kilo = 0.0, peso = 0.0 ;
        int pac = 0;

        Scanner entrada = new Scanner(System.in);

        while(kilo < qtde) {
            System.out.println("Digite o peso do pacote: ");
            peso = entrada.nextDouble();
            kilo += peso;
            pac += 1;
        }
        entrada.close();

        return pac;
    }

    public static void main(String[] args){

        String nome;
        double quantRacao;
        int pacotes;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do Cachorro: ");
        nome = ler.nextLine();
        System.out.println("Digite a quantidade de ração diária: ");
        quantRacao = ler.nextDouble();

//        Aqui criaremos a função que ira receber a quantidade de consumo

        pacotes = quantosPacotes(quantRacao);

        System.out.printf("O cachorro %s precisará de %d pacotes.", nome,pacotes);


        ler.close();


    }

}
