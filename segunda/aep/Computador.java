package segunda.aep;

public class Computador {
	private String processador;
	private String placaMae;
	private int armazenamentoEmGB;
	private int wattsFonte;
	private int memoriaRamEmGB;
	
	public Computador() {
		System.out.println("Criando Computador com o construtor padrão.");
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void setPlacaMae(String placaMae) {
		this.placaMae = placaMae;
	}
	
	public void setArmazenamentoEmGB(int armazenamentoEmGB){
		if(armazenamentoEmGB < 500) {
			throw new RuntimeException("Armazenamento insuficiente, precisa ser maior que 500!");
		}
		this.armazenamentoEmGB = armazenamentoEmGB;
	}
	
	public void setWattsFonte(int wattsFonte) {
		this.wattsFonte = wattsFonte;
	}
	
	public void setMemoriaRam(int memoriaRamEmGB) {
		if (memoriaRamEmGB < 4) {
			throw new RuntimeException("Memória RAM insuficiente, precisa ser maior que 4!");
		}
		this.memoriaRamEmGB = memoriaRamEmGB;
	}
	
	
}
