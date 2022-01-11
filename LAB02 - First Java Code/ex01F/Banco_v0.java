package ex01;

public class Banco_v0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta_v0 c1=new Conta_v0();
		c1.setSaldo(1000);
		c1.setLimite(2000);
		System.out.println("Saldo atual:" +c1.getSaldo());
		System.out.println("Limite:" +c1.getLimite());

	}

}
