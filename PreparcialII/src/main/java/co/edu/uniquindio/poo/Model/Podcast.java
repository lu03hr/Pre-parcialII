package co.edu.uniquindio.poo.Model;

public class Podcast extends Contenido{
    private String presentador;
    private int numeroEpisodio;
    public Podcast(String id, String titulo, int duracionSeg, String presentador, int ep)
    {

        super(id, titulo, duracionSeg);
        if(id.isEmpty() || titulo.isEmpty() || duracionSeg==0 || presentador.isEmpty()){
            throw new IllegalArgumentException("No puede estar vacio");
        }

        this.presentador = presentador;
        this.numeroEpisodio = ep;
    }
    @Override
    public void reproducir() {
        System.out.println("Podcast " + titulo + " Episodio " + numeroEpisodio);
    }
}
