package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double calculateFinalGrade() {
		return grade1 + grade2 + grade3;
	}
		
	public double calculateMissingToPass() {
		// isso é pra evitar notas negativas
		return Math.max(0, 60.0 - calculateFinalGrade());
	}
	
	public boolean isApproved() {
		return calculateFinalGrade() >= 60;
	}
}
