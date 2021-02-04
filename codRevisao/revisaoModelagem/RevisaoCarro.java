package revisao;

public class RevisaoCarro {

	private int codCarro, numMarchas, qntdPortas;
	private String tipoCarro, marcaCarro, corCarro, tipoCombustivel;
	private double velocidadeMinima, velocidadeMaxima;
	private boolean emplacado, isLigado, isPortasAbertas;
	
	public RevisaoCarro(int codCarro, int numMarchas, int qntdPortas, String tipoCarro, String marcaCarro,
			String corCarro, String tipoCombustivel, double velocidadeMinima, double velocidadeMaxima,
			boolean emplacado) {
		this.codCarro = codCarro;
		this.numMarchas = numMarchas;
		this.qntdPortas = qntdPortas;
		this.tipoCarro = tipoCarro;
		this.marcaCarro = marcaCarro;
		this.corCarro = corCarro;
		this.tipoCombustivel = tipoCombustivel;
		this.velocidadeMinima = velocidadeMinima;
		this.velocidadeMaxima = velocidadeMaxima;
		this.emplacado = emplacado;
		this.isLigado = false;
		this.isPortasAbertas = false;
	}

	public int getCodCarro() {
		return codCarro;
	}

	public void setCodCarro(int codCarro) {
		this.codCarro = codCarro;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public int getQntdPortas() {
		return qntdPortas;
	}

	public void setQntdPortas(int qntdPortas) {
		this.qntdPortas = qntdPortas;
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

	public String getMarcaCarro() {
		return marcaCarro;
	}

	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getVelocidadeMinima() {
		return velocidadeMinima;
	}

	public void setVelocidadeMinima(double velocidadeMinima) {
		this.velocidadeMinima = velocidadeMinima;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public boolean isEmplacado() {
		return emplacado;
	}

	public void setEmplacado(boolean emplacado) {
		this.emplacado = emplacado;
	}
	
	public void ligarDesligar() {
		if (isLigado == true) {
			System.out.println("O carro foi desligado.");
			isLigado = false;
		} else {
			System.out.println("O carro foi ligado.");
			isLigado = true;
		}
	}
	
	public void abastecer() {
		System.out.println("Abastecendo o carro.");
	}
	
	public void acelerar() {
		System.out.println("O carro acelerou.");
	}
	
	public void frear() {
		System.out.println("O carro freou.");
	}
	
	public void abrirPortas() {
		if (isPortasAbertas == true) {
			System.out.println("Fechando as portas do carro.");
			isPortasAbertas = false;
		} else {
			System.out.println("Abrindo as portas dos carro.");
			isPortasAbertas = true;
		}
	}
	
}
