import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

public class App {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro("Puppy","Marron",25,5.5,"nada");

        Gato gato1 = new Gato("Frajola", "Preto",5,5.5,"nada");

        Passaro passaro1 = new Passaro("Bobo", "Preto",5,5.5,"nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        PetShop petShop = new PetShop();
        petShop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}
