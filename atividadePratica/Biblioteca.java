import java.util.ArrayList;

public class Biblioteca implements Emprestimo{
    ArrayList<Livro> livros;
    ArrayList<Livro> livrosEmprestados;
    Membros membros;

    public Biblioteca() {
        livros = new ArrayList<>();
        livrosEmprestados = new ArrayList<>();
        membros = new Membros();
    }

    public Membros getMembros() {
        return membros;
    }

    public void listarLivros(){
        System.out.println("Exemplares:\n");
        for(Livro livro : livros){
            livro.descricao();
            System.out.println("\n--------------------\n");
        }
    }

        public void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public void editarLivro(Livro livro, String novoTitulo, String novoAutor, int novoNumeroPaginas){
        livro.titulo = novoTitulo;
        livro.autor = novoAutor;
        livro.setNumeroPaginas(novoNumeroPaginas);
    }

    public void removerLivro(Livro livro){
            livros.remove(livro);
        }

    public Livro buscarLivroPorTitulo(String titulo){
        System.out.println("Buscando livro com o titulo: " + titulo);
        for(Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println("Livro encontrado: ");
                return livro;
            }
        }
        System.out.println("Livro nao encontrado.\n");
        return null;
    }
    @Override
    public void ListarEmprestimos(){
        System.out.println("Livros Emprestados:\n");
        for(Livro livroEmprestado : livrosEmprestados){
            livroEmprestado.descricao();
            System.out.println("\n--------------------\n");
        }
    }

    @Override
    public void EmprestarLivro(String cpf, String titulo) {
        if (!membros.isMembroCadastrado(cpf)) {
            throw new IllegalArgumentException("Pessoa nao cadastrada! CPF: " + cpf);
        }

        Livro livroDesejado = buscarLivroPorTitulo(titulo);
        if (livroDesejado == null) {
            throw new IllegalStateException("Livro \"" + titulo + "\" não encontrado ou indisponivel para emprestimo.");
        }

        removerLivro(livroDesejado);
        livrosEmprestados.add(livroDesejado);
        System.out.println("Livro Emprestado!");
    }

    @Override
    public void DevolucaoLivro(String titulo){
        Livro livroDevolvido = null;
        for (Livro livroEmprestado : livrosEmprestados) {
            if (livroEmprestado.getTitulo().equalsIgnoreCase(titulo)) {
                livroDevolvido = livroEmprestado;
                break;
            }
        }

        if (livroDevolvido != null) {
            livros.add(livroDevolvido);
            livrosEmprestados.remove(livroDevolvido);
            System.out.println("Livro Devolvido com Sucesso!");
        } else {
            System.out.println("Livro nao pertence a Biblioteca ou nao esta emprestado!");
        }
    }
}

