import java.util.Scanner;

public class Ejemplo{
    public static void main(String[] args) {
 
		Scanner teclado = new Scanner(System.in);
        System.out.println("Número de rondas a jugar: ");
		int rondas = teclado.nextInt();
        while (rondas > 0){
 
		System.out.println((int)(Math.random()*6 + 1) + "\n");
        rondas --;
        }
	}
}

