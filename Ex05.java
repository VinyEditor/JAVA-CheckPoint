
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double temperaturaEmCelcius, temperaturaEmFahrenheit;
		
		System.out.printf("Digite o valor em celsius: ");
		temperaturaEmCelcius = ler.nextDouble();
		
		temperaturaEmFahrenheit = (temperaturaEmCelcius * 1.8) + 32;
	
		System.out.printf("O valor em Fahrenheit � %.2f ", temperaturaEmFahrenheit);
		ler.close();
	}

}