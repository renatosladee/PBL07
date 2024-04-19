class Ebook extends ItemBibliotecaDigital implements Baixavel {
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Ebook: " + titulo + " - Autor: " + autor;
    }

    @Override
    public void acao() {
        System.out.println("Baixando o ebook: " + titulo);
        // Implemente a lógica de download aqui
    }
}