package ex13;

public class Ordenador {

	Estrategia ordenar;

	public Ordenador(Estrategia estrategia) {
		this.ordenar = this.strategy(estrategia);
	}
	
	public Estrategia strategy(Object objeto) {
		if (objeto.getClass().getName().equals("String")) {
			return new StringJ();
		} 
		
		if (objeto.getClass().getName().equals("Integer")) {
			return new NumberJ();
		} 
		
		return new Custom();
		
	}

	public void ordenaçbubbleãoBubbleSort() {
		ordenar.bubble();
	}

	public void merge() {
		ordenar.merge();
	}

	public void quick() {
		ordenar.quick();
	}
}
