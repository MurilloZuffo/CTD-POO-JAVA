import entities.Coletas;
import entities.Endereco;
import entities.subclass.b2b;
import entities.subclass.b2c;
import entities.subclass.trade;

public class programa {

    public static void main(String[] args) {
        Endereco end1 = new Endereco("sao jose das penas", 258,  "rio branco", "Sao Paulo");
        Coletas c1 = new Coletas( 1, "10/06/2022",40, end1);

        c1.coletar();
        System.out.println(c1);

        Endereco end2 = new Endereco("jabari", 275, "sao roque", "sao paulo");
        b2b b2b1 = new b2b(2,"20/02/22",30,end2,"45112022/1101-25","Atolfo inc","ah1502sd015");

        System.out.println(b2b1);

        Endereco end3 = new Endereco("araras", 25, "Itu", "sao paulo");
        b2c b2c1 = new b2c(3,"28/09/22",30,end3,"451120224-65","Cafe descafeinado","25/06/2022");

        System.out.println(b2c1);

        Endereco end4 = new Endereco("rosa", 2752, "Osasco", "sao paulo");
        trade trade1 = new trade(4,"20/07/22",50,end4,"45112022x5","renovação de estoque",210582);

        System.out.println(trade1);

    }
}
