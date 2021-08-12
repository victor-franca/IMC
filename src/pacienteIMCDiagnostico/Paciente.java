package pacienteIMCDiagnostico;

public class Paciente {
	
	
	private double peso;
	private double altura;
	

	public Paciente() {
	}


	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularIMC () {
		return peso/Math.pow(altura, 2);
	}
	
	public String diagnostico() {
		if (calcularIMC() < 16) {
			return "Baixo peso, muito grave.";
		}
		else if (calcularIMC() < 16.99){
			return "Baixo peso, grave";
		}
		else if (calcularIMC() < 18.49) {
			return "Baixo peso";
		}
		
		else if (calcularIMC() < 24.99) {
			return "Peso normal";
		}
		
		else if (calcularIMC() < 29.99) {
			return "Sobrepeso";
		}
		
		else if (calcularIMC() < 34.99) {
			return "Obsidade grau I";
		}
		
		else if (calcularIMC() < 39.99) {
			return "Obsidade grau II";
		}
		
		else if (calcularIMC() >40) {
			return "Obsidade grau III (obesidade mórbida)";
		}
		else 
			return "Algo deu errado";
	}

}
