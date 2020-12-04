package entities;

public class Funcionarios implements Comparable<Funcionarios> {
	
	private String name;
	private Double salario;
	
	public Funcionarios(String name, Double salario) {
		super();
		this.name = name;
		this.salario = salario;
	}
	public String getName() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	//	Comparar por nome
//	@Override
//	public int compareTo(Funcionarios outro) {
//		return name.compareTo(outro.getName());
//	}
	//	Comparar por salario
//	@Override
//	public int compareTo(Funcionarios outro) {
//		return salario.compareTo(outro.getSalario());
//	}
	//	Comparar por decrescente salario
	@Override
	public int compareTo(Funcionarios outro) {
		return -salario.compareTo(outro.getSalario());
	}

}

