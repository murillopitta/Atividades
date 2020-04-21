package segunda.aep;

public class AppComputador {
	
	public static void main(String[] args) {
		
		try {
			Computador pcSala = new Computador();
			pcSala.setProcessador("I5 4123k");
			pcSala.setPlacaMae("Asusada K-456");
			pcSala.setArmazenamentoEmGB(250);
			pcSala.setMemoriaRam(4);
			pcSala.setWattsFonte(500);
		}catch (Exception ex){
			System.out.println("Mensagem da exceção: " + ex.getMessage());
		}
	}
}
