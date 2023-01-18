package entities;

public class Comentario {
	
	private String text;
	
	public Comentario() {
		
	}
	
	public Comentario(String text) {
		this.text = text;
	}
	
	public String getComentario() {
		return text;
	}
	
	public void setComentario(String text) {
		this.text = text;
	}
	
	public String toString() {
		return "Comentário: " + getComentario();
	}

}
