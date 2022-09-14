import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double base, altura, areaDoTriangulo;

		System.out.printf("Digite o valor da base: ");
		base = ler.nextDouble();

		System.out.printf("Digite o valor da altura: ");
		altura = ler.nextDouble();

		areaDoTriangulo = (base * altura) / 2;

		System.out.printf("A area do triangulo � %.2f", areaDoTriangulo);
		ler.close();
	}

}

		