package teste;

import horario.Horario;

public class Teste {
	
	public static void main(String[] args) {
		Horario horario = new Horario();
		
		for(int i = 0; i <= 60; i++) {
			System.out.println(horario);
			horario.incrementaHora();
			horario.incrementaMinuto();
			horario.incrementaSegundo();
		}
		
	}

}
