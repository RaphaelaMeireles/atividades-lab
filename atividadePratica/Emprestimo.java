public interface Emprestimo {
    void ListarEmprestimos();
    void EmprestarLivro(String cpf, String titulo);
    void DevolucaoLivro(String titulo);
}
