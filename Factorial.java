package week1.day1.assignments;

public class Factorial {
	//Goal: Find the Factorial of a given number
public static void main(String[] args) {
	int input = 5;
	int fact = 1;
	for (int i = 1;i<=input;i++) {
		fact = fact * i;
	}
	System.out.println(fact);
}
}
