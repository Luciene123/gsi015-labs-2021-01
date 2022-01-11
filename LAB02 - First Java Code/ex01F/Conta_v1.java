package ex01;

public class Conta_v1 {
	private double limite;
	private double saldo;
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double x) {
		saldo=getSaldo() + x;
	}
	public void sacar(double x) {
		if(getSaldo() +limite >= x)
		 saldo=getSaldo() - x;
	}
}