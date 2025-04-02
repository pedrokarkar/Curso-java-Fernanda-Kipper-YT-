
public class Carro{
    String modelo;

    public static void main(String[] args){
        System.out.println("teste");
    }

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public String acelerar(){
        System.out.println("Acelerando o Carro" + this.modelo);
        return "oi";
    }

    public String test(){
        System.out.println("È o Carro da rua passando no seu ovo" + this.modelo);
        return "oi";
    }
}
