import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {

    public static void main (String [] args) {

//        Alocação de Memoria
        byte b1, b2, somab;
        short s1, s2;
        int i1, i2, soma, sub, mult,div, modulo;
        long l1, l2;
        float f1, f2;
        double d1, d2;
        char c1, c2;
        boolean bo1, bo2;

//        Esta variável é uma classe
        Scanner ler =new Scanner(System.in);

        System.out.println("Informe o primeiro número byte: ");
        b1= ler.nextByte();

        System.out.println("Informe o segundo número byte: ");
        b2= ler.nextByte();

        System.out.println ("primeiro byte digitado: " + b1);
        System.out.println ("Segundo byte digitado: " + b2);

//        cast transforma em byte antes de incluir na variavel
        somab = (byte) (b1 + b2);

        soma = b1 + b2;
        sub =  b1 - b2;
        mult = b1 * b2;
        div =  b1 / b2;
        modulo = b1 % b2;

        System.out.println ("result soma é  " + soma);
        System.out.println ("result subtração é  " + sub);
        System.out.println ("result multiplicação é  " + mult);
        System.out.println ("result divisão é  " + div);
        System.out.println ("result resto da divisão é  " + modulo);

        soma++;
        mult--;

        System.out.println ("result soma é  " + soma);
        System.out.println ("result multiplicação é  " + mult);

//        Limpar o buffer ao final da utilização. Boa pratica!
        ler.close();

 }
}
