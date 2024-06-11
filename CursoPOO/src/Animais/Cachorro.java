package Animais;

public class Cachorro {

    //encapsulamento
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //construtor vazio
    public Cachorro() {}

    //construtor principal
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    //getters and setters
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    //metódos
    public void comer() {

    }

    public void latir() {
        System.out.println("Au Au Au Au Au Au Au");
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }
        return this.estadoDeEspirito;
    }
}
