package teste;

import horario.Horario;

public class Teste {
	
	public static void main(String[] args) {
		Horario horario = new Horario(23, 12, 59);
		
		System.out.println(horario);
		
		horario.setHora(10);
		horario.setSegundo(56);
		horario.setMinuto(25);
		
		System.out.println(horario);
		
		horario.incrementaSegundo();
		horario.incrementaMinuto();
		horario.incrementaHora();
		
		System.out.println(horario);
		
	}

}
