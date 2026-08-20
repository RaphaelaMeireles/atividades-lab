public class Ebook extends Livro{
    
    double tamanhoArquivo; 
    
    public Ebook(String titulo, String autor, int numeroPaginas, double tamanhoArquivo) {
        super(titulo, autor, numeroPaginas); 
        this.tamanhoArquivo = tamanhoArquivo; 
    } 
    
    public double getTamanhoArquivo() {
        return tamanhoArquivo; 
    } 
    
    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo; 
    }
    
    @Override public void descricao() {
        super.descricao();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB"); 
    } 
} 
