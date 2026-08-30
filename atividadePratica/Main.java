public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Livros ===");
        Livro livro = new Livro("O Senhor dos Aneis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("Bola", "lola", 78);
        livro.descricao();
        livro2.descricao();

        System.out.println("\n=== Biblioteca ===");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.listarLivros();
        biblioteca.buscarLivroPorTitulo("O Senhor dos Aneis").descricao();


        System.out.println("\n=== Membros ===");
        Pessoa membro = new Pessoa("Raphaela", "1234","rapha@gmail.com");
        //System.out.println(membro.getCpf());
        biblioteca.getMembros().CadastrarMembro(membro.getNome(), membro.getCpf(), membro.getEmail());
        biblioteca.getMembros().ListarMembros();


        System.out.println("\n=== Emprestimos ===");
         try {
            biblioteca.EmprestarLivro(membro.getCpf(), "O Senhor dos Aneis");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Tentativa de emprestimo finalizada.");
        }
        biblioteca.listarLivros();
        biblioteca.ListarEmprestimos();
        biblioteca.DevolucaoLivro("O Senhor dos Aneis");
        biblioteca.listarLivros();
        biblioteca.ListarEmprestimos();
        
        System.out.println("\n=== Testando excecoes ===");

        try {
            biblioteca.EmprestarLivro(membro.getCpf(), "Livro Inexistente");
        } catch (IllegalStateException e) {
            System.out.println("Nao foi possivel emprestar: " + e.getMessage());
        }

        try {
            biblioteca.EmprestarLivro("0000", "Bola");
        } catch (IllegalArgumentException e) {
            System.out.println("Nao foi possivel emprestar: " + e.getMessage());
        }
    }
}

