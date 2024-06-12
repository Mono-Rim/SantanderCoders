import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Mingau", "Branco", 5.7);
        Animal gato1 = new Gato("Mingau", "Branco", 5.7);
        Animal passaro1 = new Passaro("Jeferson", "Preto", 3);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}