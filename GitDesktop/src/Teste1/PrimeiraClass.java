package Teste1;

public class PrimeiraClass {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		aluno.setMatricula(1000);
		
		System.out.println("primeira alteração!");
		System.out.println("Segunda alteração");
		System.out.println("Terceira alteração");
		System.out.println("Quarta alteração");
		System.out.println(aluno.getMatricula());
	}

}
