package ex01;

public class Veiculo {
	private String marca;
	private String placa;
	private int Kilometragem;
	public Veiculo(String marca, String placa, int kilometragem) {
		super();
		this.marca = marca;
		this.placa = placa;
		Kilometragem = kilometragem;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKilometragem() {
		return Kilometragem;
	}
	public void setKilometragem(int kilometragem) {
		Kilometragem = kilometragem;
	}
	
	

}
