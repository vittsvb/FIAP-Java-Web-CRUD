import java.util.List;

public class Funcionario {
	private String cpf;
	private String nome;
	private int idade;
	private Double salario;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public Funcionario(String cpf, String nome, int idade, Double salario) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	} 
		
	public List<Funcionario> adicionar(List<Funcionario> listaFunc, Funcionario func){
		
		listaFunc.add(func);
		
		return listaFunc;
		
	}
	
}
