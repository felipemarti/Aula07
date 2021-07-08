import java.util.Scanner;
public class FuncoesLeituraValores {
	
	public static double[] lerValores(Scanner leitor) {
	
	double[] valores = new double[2];
	System.out.println("\n\nDigite o 1º valor:");
	valores[0] = leitor.nextDouble();
	System.out.println("\n\nDigite o 2º valor:");
	valores[1] = leitor.nextDouble();
	
	System.out.println("Os valores " + valores[0] + " e " + valores[1] + " foram armazenados\n\n");
	return valores;
	}
	
}