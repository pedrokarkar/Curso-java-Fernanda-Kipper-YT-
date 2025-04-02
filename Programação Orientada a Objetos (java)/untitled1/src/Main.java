import java.util.ArrayList;

public class Main {
    public  static void test(){
        System.out.println("teste");
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Kadett");
        Carro meuCarro1 = new Carro("Onix");
        Carro meuCarro2 = new Carro("Gol");

        String result = meuCarro.acelerar();
        meuCarro2.acelerar();
        meuCarro1.acelerar();

        System.out.println(result);
    }
}
