package Animais;

public class Passaro extends Animal {

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        //TODO Auto-generated constructor stub
    }

    

    @Override
    public void soar() {
        System.out.println("piu piu ");
    }

  
}
