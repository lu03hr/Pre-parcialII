package co.edu.uniquindio.poo.Model;

public class ElementoContenido implements ComponentPlaylist {
    private Contenido contenido;
    public ElementoContenido(Contenido contenido) {
        this.contenido = contenido;
    }
    @Override
    public int duracionTotal() {
        return contenido.getDuracionSeg();
    }
    @Override
    public void mostrar(String indent) {
        System.out.println(indent + " " + contenido.getTitulo() +
                "(" + contenido.getDuracionSeg() + "s)");
    }
    public Contenido getContenido() { return contenido; }
}
