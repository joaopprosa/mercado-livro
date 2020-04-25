package applicationSecao8;

import java.util.Locale;
import java.util.Scanner;

import entitiesSecao8.Student;

public class ProgramExercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = sc.nextLine();
		System.out.println();
		
		student.nota1 = sc.nextDouble();
		System.out.println();
		
		student.nota2 = sc.nextDouble();
		System.out.println();
		
		student.nota3 = sc.nextDouble();
		System.out.println();
		
		if(student.notaFinal() >= 60) {
			System.out.printf("FINAL GRADE = %.2f\n", student.notaFinal());
			System.out.println("PASS");
		}else {
			System.out.printf("FINAL GRADE = %.2f\n", student.notaFinal());
			System.out.println("FAILED");
			System.out.printf("MISSING = %.2f\n", (60 - student.notaFinal()));
		}
		sc.close();
	}
}
