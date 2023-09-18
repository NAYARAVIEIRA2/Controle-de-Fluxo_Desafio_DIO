import java.util.Scanner;

public class Contador {
	public static void  main (String []args) {
		Scanner Terminal =new Scanner(System.in);
		System.out.println("**********************");
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = Terminal.nextInt();
		System.out.println("**********************");
		System.out.println("Digite o segundo paâmentro: ");
		int parametroDois = Terminal.nextInt();
		
		try {
			contar (parametroUm,parametroDois);			
		}
		catch(ParametrosInvalidosExceptionexten e) {
		System.out.println(e.getMessage());
			
		}
		Terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosExceptionexten {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosExceptionexten("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}