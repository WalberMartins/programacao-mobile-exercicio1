package teste;

import horario.Horario;

public class Teste {
	
	public static void main(String[] args) {
		Horario horario = new Horario(22, 58, 0);
		
		for(int i = 0; i <= 120; i++) {
			System.out.println(horario);
			horario.incrementaSegundo();
		}
		
	}

}
