package Animais;

public class Gato extends Animal {

    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        //TODO Auto-generated constructor stub
    }

    static int numeroDeGatos;

    @Override
    public String toString() {
        return "gato [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoDeEspirito="
                + estadoDeEspirito + "]";
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }

    

    
}
