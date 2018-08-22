package co.edu.javeriana.ingesoft1830;

public class Quiz {

	public static void main(String[] args){
		System.out.println("This is the first quiz");
		Quiz quiz = new Quiz();
		quiz.doBilling();
	}

	public void doBilling(){
		System.out.println("Inside billing");
		System.out.println("Executing billing");
	}
}