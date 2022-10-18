package entities;

public abstract class Pessoa {

	private String name;
	private Integer idade;
	private String Sexo;
	private float experiencia;
	
	public Pessoa(String name, Integer idade, String sexo) {
		super();
		this.name = name;
		this.idade = idade;
		Sexo = sexo;
		this.experiencia = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public float getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(float experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", idade=" + idade + ", Sexo=" + Sexo + ", experiencia=" + experiencia + "]";
	}	
}
