public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== Livro Fisico ===");
        LivroFisico livroFisico = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, 1.5);
        livroFisico.descricao();
        
        System.out.println("=== Ebook ===");
        Ebook ebook = new Ebook("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 223, 2.5); 
        ebook.descricao();
        
        System.out.println("=== Biblioteca ===");
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);
        biblioteca.listarLivros();
        biblioteca.buscarLivroPorTitulo("O Senhor dos Anéis"); } } 