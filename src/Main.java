import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: " );
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{

        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("Parametro invalido, o segundo numero deve ser maior do que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;
        System.out.println("Iterações: ");
        for (int i = 1; i <= contagem; i++) {
            System.out.println(i);
        }
    }

}