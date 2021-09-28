package model;

public class VidaNoturna {
	private int id;
	private String nome;
	private String endereco;
	private int classificacao;
	private double valorAproximado;
	
	public VidaNoturna(int id, String endereco, int classificacao, double valorAproximado) {
		this.id = id;
		this.endereco = endereco;
		this.classificacao = classificacao;
		this.valorAproximado = valorAproximado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public double getValorAproximado() {
		return valorAproximado;
	}

	public void setValorAproximado(double valorAproximado) {
		this.valorAproximado = valorAproximado;
	}
	
	
}
