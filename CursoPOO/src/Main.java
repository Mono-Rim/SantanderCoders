import Animais.Cachorro;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.setNome("Diana");
        cachorro1.setCor("azul");
        cachorro1.setAltura(25);
        cachorro1.setPeso(18.5);
        cachorro1.setTamanhoDoRabo(5);

//        cachorro1.latir();
//
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("o cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("o cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("o cachorro está " + cachorro1.interagir("vai dormir"));
        System.out.println("o cachorro está " + cachorro1.interagir(""));
    }
}