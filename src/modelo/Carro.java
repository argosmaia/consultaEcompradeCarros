package modelo;

public class Carro {
	private String placa; // placa do carro
	private String marca; // marca do carro
	private String fabricante; // fabricante do carro	
	private String ano; // ano de fabricacao
	private String condicao; // novo ou usado
	private String kilom; // kilometragem
	private String cavalos; // potencia do motor
	
	public Carro() { // construtor vazio
		//super();
	}

	public Carro(String placa, String marca, String ano, String condicao, String kilom, String cavalos) { // construtor com parametros
		//super();
		this.placa = placa; 
		this.marca = marca; 
		this.ano = ano;
		this.condicao = condicao;
		this.kilom = kilom;
		this.cavalos = cavalos;
	}

	// getters e setters
	
	public String getPlaca() { // retorna a placa do carro
		return placa;
	}

	public void setPlaca(String placa) { // seta a placa do carro
		this.placa = placa;
	}

	public String getMarca() { 
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}

	public String getKilom() {
		return kilom;
	}

	public void setKilom(String kilom) {
		this.kilom = kilom;
	}

	public String getCavalos() {
		return cavalos;
	}

	public void setCavalos(String cavalos) {
		this.cavalos = cavalos;
	}
}
