package questao2;

public class Principal {

	public static void main(String[] args) {
		Carro car= new Carro("azul","uno",0.0,100.0,false);
		
		System.out.println(car);
		car.acelerar(5, car.getVelAtual());
		
		car.ligar();
		
		System.out.println(car);
		car.acelerar(5, car.getVelAtual()); 
		System.out.println(car);
		car.acelerar(55, car.getVelAtual()); 
		System.out.println(car);
	}

}
