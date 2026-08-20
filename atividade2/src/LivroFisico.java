public class LivroFisico extends Livro {
    private double peso; 
    
    public LivroFisico(String titulo, String autor, int numeroPaginas, double peso) {
        super(titulo, autor, numeroPaginas);
        this.peso = peso; 
    } 
    
    public double getPeso() {
        return peso; 
    } 
    
    public void setPeso(double peso) {
        this.peso = peso; 
    } 
    
    @Override public void descricao() {
        super.descricao();
        System.out.println("Peso: " + peso + " kg"); 
    } 
} 
