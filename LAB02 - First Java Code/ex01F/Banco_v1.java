package ex01;

public class Banco_v1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta_v1 c1=new Conta_v1();		
		c1.setLimite(300);
		c1.depositar(500);
		c1.sacar(200);
		System.out.println("Saldo atual:" +c1.getSaldo());		

	}

}
