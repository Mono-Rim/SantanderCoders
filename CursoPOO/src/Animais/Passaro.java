package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;


    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);

        numeroDePassaros++;
    }

    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }

    public static void setNumeroDePassaros(int numeroDePassaros) {
        Passaro.numeroDePassaros = numeroDePassaros;
    }

    @Override
    public void soar(){
        System.out.println("Piu Piu");
    }
}
