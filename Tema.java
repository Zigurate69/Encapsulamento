package Encapsulamento;

public class Tema {
	
	public int id;
	public String nome;
	public double valorAluguel;
	public String corToalha;
	
	public Tema () {}
	
	public Tema (int id, String nome, double valorAluguel, String corToalha) {
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corToalha = corToalha;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public double getValorAluguel() {
		return valorAluguel;
	}
	
	public void setValorAluguel (double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	
	public String getCorToalha() {
		return corToalha;
	}
	
	public void setCorToalha (String corToalha) {
		this.corToalha = corToalha;
	}
}