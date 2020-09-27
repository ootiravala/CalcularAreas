
public class FormulasAreas {

	public double formulaAreaCirculo(double radio) {
		double resultado = Math.pow(radio, 2) * Math.PI;
		return resultado;
	}

	public double formulaAreaTriangulo(double base, double altura) {
		double resultado = (base * altura) / 2;
		return resultado;
	}

	public double formulaAreaCuadrado(double base, double altura) {
		double resultado = base * altura;
		return resultado;
	}
}
