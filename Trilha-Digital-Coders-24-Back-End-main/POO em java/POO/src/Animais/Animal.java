package Animais;

public class Animal {

    static int numeroDePassaros;
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    protected void comer() {}
    protected void dormir() {}
    public void soar() {
        System.out.println(" cri cri");
    }
    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }
    public static int getNumeroDePassaros() {
        return numeroDePassaros;
    }
    public static void setNumeroDePassaros(int numeroDePassaros) {
        Animal.numeroDePassaros = numeroDePassaros;
    }
    public String getNome() {
        return nome;
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
    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    

    
}
