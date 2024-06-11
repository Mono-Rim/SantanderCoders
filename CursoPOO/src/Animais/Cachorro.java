package Animais;

public class Cachorro extends Animal {

    static int numeroDeCachorros;
    private int tamanhoDoRabo;


    public Cachorro(String nome, String cor, double peso) {
        super(nome, cor, peso);
        this.tamanhoDoRabo = tamanhoDoRabo;
        numeroDeCachorros++;
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }



}
