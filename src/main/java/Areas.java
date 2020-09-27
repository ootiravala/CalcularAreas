import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {

		FormulasAreas formulasAreas = new FormulasAreas();
		String dato = "";
		String figura = "";
		double resultado;

		do {
			figura = JOptionPane.showInputDialog("¿Area del circulo, triangulo o cuadrado?");

			if (figura.equals("circulo")) {
				dato = JOptionPane.showInputDialog("Introduzca el radio del circulo");
				double radio = Double.parseDouble(dato);

				resultado = formulasAreas.formulaAreaCirculo(radio);
				JOptionPane.showMessageDialog(null, "El área del circulo es: " + resultado);
			}
			if (figura.equals("triangulo")) {
				dato = JOptionPane.showInputDialog("Introduzca la base");
				double base = Double.parseDouble(dato);
				dato = JOptionPane.showInputDialog("Introduzca la altura ");
				double altura = Double.parseDouble(dato);

				resultado = formulasAreas.formulaAreaTriangulo(base, altura);
				JOptionPane.showMessageDialog(null, "El area del triangulo es: " + resultado);
			}
			if (figura.equals("cuadrado")) {
				dato = JOptionPane.showInputDialog("Introduzca la base");
				double base = Double.parseDouble(dato);
				dato = JOptionPane.showInputDialog("Introduzca la altura ");
				double altura = Double.parseDouble(dato);

				resultado = formulasAreas.formulaAreaCuadrado(base, altura);
				JOptionPane.showMessageDialog(null, "El area del caudrado es: " + resultado);
			}
		} while (figura.isEmpty()
				|| !figura.equals("circulo") && !figura.equals("triangulo") && !figura.equals("cuadrado"));
	}
}
