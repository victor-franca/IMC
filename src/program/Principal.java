package program;

import pacienteIMCDiagnostico.Paciente;

public class Principal {

	public static void main(String[] args) {
		
		
		Paciente paciente = new Paciente(75,1.73);
		Paciente paciente1 = new Paciente (45,1.80);
		Paciente paciente2 = new Paciente (80,1.45);
		
		System.out.printf("Calculo IMC: %.2f Diagnostico: %s",paciente.calcularIMC(), paciente.diagnostico());
		System.out.printf("\nCalculo IMC: %.2f Diagnostico: %s",paciente1.calcularIMC(), paciente1.diagnostico());
		System.out.printf("\nCalculo IMC: %.2f Diagnostico: %s",paciente2.calcularIMC(), paciente2.diagnostico());

	}

}
