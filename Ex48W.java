import java.util.Scanner;

public class Ex48W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, i;
		
		System.out.println("Digite um número qualquer: ");
		x = ler.nextInt();
		
		i = 1;
		
		while (i <= 20) {
			y = x + i;
			System.out.println(y);
			i++;
		}
	}
}