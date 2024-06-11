import Animais.Cachorro;

public class Modelagem {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Diana", "Branca", 8, 7.4, 3);

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Bidu", "Marrom", 10, 18.5, 7);

        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

    }
}