public class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    public VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public String descricao() {
        return "Vídeo Digital: " + titulo + " - Autor: " + autor;
    }

    @Override
    public void acao() {
        System.out.println("Visualizando o vídeo: " + titulo);
        // Implemente a lógica de visualização aqui
    }
}
