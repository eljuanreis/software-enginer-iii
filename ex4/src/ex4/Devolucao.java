package ex4;

import java.util.Date;

public class Devolucao {

	private Aluguel aluguel;
	private Date dataDev;
	private double quilometragem;
	
	void checarMulta() {
		
	}
	
	void checarConsumo() {
		
	}
	
 	public Aluguel getAluguel() {
		return aluguel;
	}
	public void setAluguel(Aluguel aluguel) {
		this.aluguel = aluguel;
	}
	public Date getDataDev() {
		return dataDev;
	}
	public void setDataDev(Date dataDev) {
		this.dataDev = dataDev;
	}
	public double getQuilometragem() {
		return quilometragem;
	}
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem;
	}
}
