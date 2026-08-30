public class Main {
    public static void main(String[] args){
    Heroi heroi = new Heroi();
    Goku goku = new Goku();
    
    heroi.setNome("Sonic");
    heroi.vida = 100;
    heroi.energia = 90;

    heroi.apresentar();
    goku.atacar();
    heroi.atacar();
    }

}
