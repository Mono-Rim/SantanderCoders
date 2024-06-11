import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Bidu", "Marrom", 10, 18.5, 7);

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getAltura());

        System.out.println("o cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("o cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("o cachorro está " + cachorro1.interagir("vai dormir"));
        System.out.println("o cachorro está " + cachorro1.interagir(""));
    }
}