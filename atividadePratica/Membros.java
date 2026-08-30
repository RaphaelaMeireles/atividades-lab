import java.util.ArrayList;

public class Membros{
    private ArrayList<Membro> membros;
    private int proximaMatricula = 1;

    public Membros() {
        this.membros = new ArrayList<>();
    }

    public void CadastrarMembro(String nome, String cpf, String email) {
        String matricula = String.valueOf(proximaMatricula++);
        membros.add(new Membro(nome, cpf, email, matricula));
        System.out.println("Membro cadastrado com sucesso!");
    }

    public void ListarMembros() {
        System.out.println("Lista de Membros:");
        for (Pessoa membro : membros) {
            System.out.println("Nome: " + membro.getNome() + ", CPF: " + membro.getCpf() + ", Email: " + membro.getEmail());
        }
    }

    public void EditarMembro(Pessoa membro, String novoNome, String novoCpf, String novoEmail){
        membro.setNome(novoNome);
        membro.setCpf(novoCpf);
        membro.setEmail(novoEmail);
        System.out.println("Dados do Membro atualizados com Sucesso!");
    }

     public boolean isMembroCadastrado(String cpf) {
        for (Membro membro : membros) {
            if (membro.getCpf() != null && membro.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Membro> getMembros() {
        return membros;
    }
}

