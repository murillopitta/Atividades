package aula20200413.atividade;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private double salario;
	private int anoDeIngresso;
	private int mesDeIngresso;
	
	public Funcionario() {
		System.out.println("Criando Funcionario com o construtor padrão.");
	}
	
	public Funcionario(String nome, String sobrenome, double salario, int anoDeIngresso, int mesDeIngresso) {
		System.out.println("Criando Funcionario com o construtor alternativo.");
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
		this.anoDeIngresso = anoDeIngresso;
		this.mesDeIngresso = mesDeIngresso;
	}
	
	public int anosCompletosAposIngresso() {
		return Calendar.getInstance().get(Calendar.YEAR) - anoDeIngresso;
	}
	
	public int totalDeSalariosRecebidos() {
		
		return ( anosCompletosAposIngresso() * 12 ) + Calendar.getInstance().get(Calendar.MONTH) - mesDeIngresso;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}
	public void setMesDeIngresso(int mesDeIngresso) {
		if(mesDeIngresso > 12 || mesDeIngresso < 1) {
			throw new RuntimeException("Mês inválido. Deve ser menor ou igual a 12");
		}
		this.mesDeIngresso = mesDeIngresso-1;
	}
	
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public double getSalario() {
		return salario;
	}
	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}
	public int getMesDeIngresso() {
		return mesDeIngresso;
	}
	

}
