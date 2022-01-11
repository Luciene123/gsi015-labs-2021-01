package ex01;

public class AcessaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo meuCarro= new Veiculo("Escort","xyz-3456",60000);
		String marca;
		int Kilometragem;
		marca=meuCarro.getMarca();
		System.out.println(marca);
		Kilometragem=meuCarro.getKilometragem();
		System.out.println(Kilometragem);
		meuCarro.setKilometragem(100000);
		System.out.println(meuCarro.getKilometragem());
	}

}
