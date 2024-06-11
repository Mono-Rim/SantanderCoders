package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);

        numeroDeGatos++;
    }

    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }

    public static void setNumeroDeGatos(int numeroDeGatos) {
        Gato.numeroDeGatos = numeroDeGatos;
    }

    public void soar() {
        System.out.println("Miau Miau");
    }


}
