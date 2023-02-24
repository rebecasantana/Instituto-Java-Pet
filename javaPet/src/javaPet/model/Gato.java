package javaPet.model;

public class Gato extends Animal {
	
	private boolean felv; //leucemia felina
	private boolean fiv; // aids felina
	
	public Gato(String nome, int iD, String raca, double idade, double peso, String sexo, boolean aptoDoacao, boolean felv, boolean fiv) {
		super(nome, iD, raca, idade, peso, sexo, aptoDoacao);
		this.felv = felv;
		this.fiv = fiv;
	}


	public boolean isFelv() {
		return felv;
	}

	public void setFelv(boolean felv) {
		this.felv = felv;
	}

	public boolean isFiv() {
		return fiv;
	}

	public void setFiv(boolean fiv) {
		this.fiv = fiv;
	}
	
	public void visualizar(){
		// TODO Atualizar para definir como Gato/Cachorro
		super.visualizar();
		System.out.println("O animal possui FeLV? " + felv);
		System.out.println("O animal possui FIV? " + fiv);
	}
}
