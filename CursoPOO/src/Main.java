import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Bidu", "Marrom", 10.5);

        Gato gato1 = new Gato("Mingau", "Branco", 5.7);

        Passaro passaro1 = new Passaro("Jorge", "Verde", 8);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
    }
}