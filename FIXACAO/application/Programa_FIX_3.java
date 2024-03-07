package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Student;

public class Programa_FIX_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();
		
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.calculateFinalGrade());
		System.out.println(student.isApproved() ? "PASS" : "FAILED");
		
		if(!student.isApproved()) {
			System.out.printf("MISSING %.2f POINTS", student.calculateMissingToPass());
		}
		sc.close();
	}
}
