package revisao;

public class RevisaoProduto {

	private int codProduto, numParcelas;
	private String nomeProduto, tipoProduto, tempoGarantia, corProduto;
	private double precoMinimo, precoMaximo, pesoProduto, tamanhoProduto;
	private boolean vender;
	
	public RevisaoProduto(int codProduto, String nomeProduto, String tipoProduto, String tempoGarantia,
			String corProduto, double precoMinimo, double precoMaximo, int numParcelas, double pesoProduto, double tamanhoProduto) {
		this.codProduto = codProduto;
		this.numParcelas = numParcelas;
		this.nomeProduto = nomeProduto;
		this.tipoProduto = tipoProduto;
		this.tempoGarantia = tempoGarantia;
		this.corProduto = corProduto;
		this.precoMinimo = precoMinimo;
		this.precoMaximo = precoMaximo;
		this.pesoProduto = pesoProduto;
		this.tamanhoProduto = tamanhoProduto;
	}

	public int getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(int codProduto) {
		this.codProduto = codProduto;
	}

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getTempoGarantia() {
		return tempoGarantia;
	}

	public void setTempoGarantia(String tempoGarantia) {
		this.tempoGarantia = tempoGarantia;
	}

	public String getCorProduto() {
		return corProduto;
	}

	public void setCorProduto(String corProduto) {
		this.corProduto = corProduto;
	}

	public double getPrecoMinimo() {
		return precoMinimo;
	}

	public void setPrecoMinimo(double precoMinimo) {
		this.precoMinimo = precoMinimo;
	}

	public double getPrecoMaximo() {
		return precoMaximo;
	}

	public void setPrecoMaximo(double precoMaximo) {
		this.precoMaximo = precoMaximo;
	}

	public double getPesoProduto() {
		return pesoProduto;
	}

	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}

	public double getTamanhoProduto() {
		return tamanhoProduto;
	}

	public void setTamanhoProduto(double tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}
	
	public void vender() {
		if (vender == false) {
			System.out.println("O produto " + getNomeProduto() + " está sendo vendido.");
			vender = true;
		} else {
			System.out.println("O produto " + getNomeProduto() + " já foi vendido.");
		}
	}
	
	public void estoque() {
		System.out.println("Produto " + getNomeProduto() + " estocado!");
	}
	
	public void entregar() {
		System.out.println("Produto " + getNomeProduto() + " sendo preparado para entrega.");
	}
	
	public void suporte() {
		System.out.println("Produto " + getNomeProduto() + " necessita de garantia");
	}
	
	
}