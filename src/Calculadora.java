import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
		
		double[] valores = new double[2];
		double resultado = 0;
		int opcao = 0;
		Scanner leitor = new Scanner(System.in);
		
		while (opcao!=6) {
			FuncoesImpressao.exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			
			case 1:
				valores = FuncoesLeituraValores.lerValores(leitor);
				break;
			
			case 2:
				resultado = FuncoesMatematicas.somar(valores[0], valores[1]);
				FuncoesImpressao.exibirResultado(resultado);
				break;
				
			case 3:
				resultado = FuncoesMatematicas.subtrair(valores[0], valores[1]);
				FuncoesImpressao.exibirResultado(resultado);
				break;
				
			case 4:
				resultado = FuncoesMatematicas.dividir(valores[0], valores[1]);
				FuncoesImpressao.exibirResultado(resultado);
				break;
			case 5:
				resultado = FuncoesMatematicas.multiplicar(valores[0], valores[1]);
				FuncoesImpressao.exibirResultado(resultado);
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}
			
		}
		leitor.close();
		

	}

}
