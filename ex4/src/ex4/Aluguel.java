package ex4;

import java.util.Date;

public class Aluguel {
	public Date dtLocacao, tempoLocacao;
	public String finalidade, local;
	public double caucao, valorTotal;
	
	public Cliente cliente;
	public Carro carro;
	
	void calcularCaucao() {
		
	}
	
	void calcularValorTotal() {
		
	}
	
	public Date getDtLocacao() {
		return dtLocacao;
	}
	public void setDtLocacao(Date dtLocacao) {
		this.dtLocacao = dtLocacao;
	}
	public Date getTempoLocacao() {
		return tempoLocacao;
	}
	public void setTempoLocacao(Date tempoLocacao) {
		this.tempoLocacao = tempoLocacao;
	}
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public double getCaucao() {
		return caucao;
	}
	public void setCaucao(double caucao) {
		this.caucao = caucao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}
