package entities;

public class Video implements AcoesVideo {
	
	private String titulo;
	private Integer views, curtidas, avaliacao;
	private boolean reproduzindo;
	
	public Video() {
	}
	
	
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.views = 0;
		this.curtidas = 0;
		this.avaliacao = 0;
		this.reproduzindo = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		int nova;
		nova =  (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
	}


	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}

	@Override
	public void play() {
		reproduzindo = true;
	}

	@Override
	public void pause() {
		reproduzindo = false;
	}

	@Override
	public void like() {
		curtidas ++;
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", avaliacao=" + avaliacao
				+ ", reproduzindo=" + reproduzindo + "]";
	}

	
}
