package Animais;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
        //TODO Auto-generated constructor stub
    }

    //atributos 
    private int tamanhoDoRabo;
    static int numeroDeCachorros;
    
    // construtores 

    //construtor padrão
    


    //METODOS
    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho": this.estadoDeEspirito = "Feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "Bravo"; break;
            case "pisar na batinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "Neutro";
        }

        return this.estadoDeEspirito;
    }
    
    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", tamanhoDoRabo="
                + tamanhoDoRabo + ", estadoDeEspirito=" + estadoDeEspirito + "]";
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }

    

}
