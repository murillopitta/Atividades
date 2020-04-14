package aula20200413.atividade;

public class AppFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario jonas = new Funcionario();
		
		jonas.setNome("Jonas");
		jonas.setSobrenome("da Silva");
		jonas.setSalario(1500.00);
		jonas.setAnoDeIngresso(2020);
		jonas.setMesDeIngresso(2);
		
		System.out.println("Anos ap�s ingresso: " + jonas.anosCompletosAposIngresso() + " (" + jonas.getNome() + ")");
		System.out.println("Total de sal�rios recebidos: " + jonas.totalDeSalariosRecebidos() + " (" + jonas.getNome() + ")");
		
		Funcionario maria = new Funcionario("Maria", "Aparecida", 1650.00, 2015, 8);
		
		System.out.println("Anos ap�s ingresso: " + maria.anosCompletosAposIngresso() + " (" + maria.getNome() + ")");
		System.out.println("Total de sal�rios recebidos: " + maria.totalDeSalariosRecebidos() + " (" + maria.getNome() + ")");
		
	}
	
	

}
