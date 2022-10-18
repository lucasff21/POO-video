package entities;

public class Usuario extends Pessoa {

	private String login;
	private int totAssistindo;
	

	public Usuario(String name, Integer idade, String sexo, String login) {
		super(name, idade, sexo);
		this.login = login;
		this.totAssistindo = 0;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistindo() {
		return totAssistindo;
	}
	public void setTotAssistindo(int totAssistindo) {
		this.totAssistindo = totAssistindo;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", totAssistindo=" + totAssistindo + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
