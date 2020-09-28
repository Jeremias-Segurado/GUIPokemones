package logica;

import javax.swing.ImageIcon;

public class EntidadGrafica {
	private ImageIcon grafico;
	private String[] imagenes;
	
	public EntidadGrafica() {
		this.grafico = new ImageIcon();
		this.imagenes = new String[]{"/img/pikachu.png", "/img/charmander.png", "/img/bulbasaur.png", "/img/squirtle.png"};
	}
	
	public void actualizar(int indice) {
		if (indice < this.imagenes.length) {
			ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(this.imagenes[indice]));
			this.grafico.setImage(imageIcon.getImage());
		}
	}
	
	public ImageIcon getGrafico() {
		return this.grafico;
	}
	
	public void setGrafico(ImageIcon grafico) {
		this.grafico = grafico;
	}
	
	public String[] getImagenes() {
		return this.imagenes;
	}
	
	public void setImagenes(String[] imagenes) {
		this.imagenes = imagenes;
	}
	
}
