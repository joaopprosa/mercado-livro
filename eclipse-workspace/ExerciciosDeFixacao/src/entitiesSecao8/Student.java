package entitiesSecao8;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double nota4;
	public double nota5;

	public double notaFinal() {
		return nota1 + nota2 + nota3 + nota4 + nota5;
	}
}
