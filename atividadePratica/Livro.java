public class Livro {
    String titulo;
    String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public int setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
        return numeroPaginas;
    }

    public void descricao() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + numeroPaginas);
    }
}