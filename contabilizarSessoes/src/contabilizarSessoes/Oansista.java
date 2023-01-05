package contabilizarSessoes;

public class Oansista {

	protected String nome;
	public String manual;
	
	public Oansista(String nome, String manual) {
		this.nome = nome;
		this.manual = manual;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}
}
