package entities;

public class Visualizacao {


	private Video filme;
	private Usuario espectador;
	
	public Visualizacao(Video filme, Usuario espectador) {
		this.filme = filme;
		this.espectador = espectador;
		this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
		this.filme.setViews(this.filme.getViews() + 1);
	}

	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {
		int tot = 0;
		if (porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if (porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		
		this.filme.setAvaliacao(tot);
	}
	
	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	public Usuario getEspectador() {
		return espectador;
	}

	public void setEspectador(Usuario espectador) {
		this.espectador = espectador;
	}

	@Override
	public String toString() {
		return "Visualizacao [filme=" + filme + ", espectador=" + espectador + "]";
	}	
}
