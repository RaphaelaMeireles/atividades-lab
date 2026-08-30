
public class Heroi {
        private String nome;
        int vida;
        int energia;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
        
        public void apresentar(){
            System.out.println("Ola! Sou " + nome);
        }
        
        public void atacar(){
            System.out.println(nome + " realizou um ataque!");
        }
    }
    
