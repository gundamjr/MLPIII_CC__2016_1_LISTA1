package questao2;

public class Carro {
	private String cor;
	private String modelo;
	private double velAtual;
	private double velMaxima;
	private boolean status;
	
	public Carro(String cor,String modelo,double velAtual,double velMaxima,boolean status){
		this.cor=cor;
		this.modelo=modelo;
		this.velAtual=velAtual;
		this.velMaxima=velMaxima;
		this.status=status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelAtual() {
		return velAtual;
	}

	public void setVelAtual(double velAtual) {
		this.velAtual = velAtual;
	}

	public double getVelMaxima() {
		return velMaxima;
	}

	public void setVelMaxima(double velMaxima) {
		this.velMaxima = velMaxima;
	}
	
	public void acelerar(double velAcre,double velAtual){
		if((velAtual+velAcre<=this.getVelMaxima())&&(this.status)){
		velAtual+=velAcre;
		this.setVelAtual(velAtual);
		}
		else
			System.out.println("velocidade excedida do limite ou o carro esta desligado");
	}
	public void ligar(){
		this.status=true;
	}
	@Override
	public String toString() {
	if(this.status)
		System.out.print("Status : ligado |");
	else
		System.out.print("Status : desligado |");
		return "Cor : "+this.cor+"| Modelo : "+this.modelo+"| Velocidade atual : "+this.velAtual+"| Velocidade maxima : "+this.velMaxima;
	}

}
