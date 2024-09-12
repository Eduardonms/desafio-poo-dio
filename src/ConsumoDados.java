import java.util.Scanner;

public class ConsumoDados {

    public static void main(String[] args) {
        
        // Solicita a entrada do usuário
        //System.out.println("Digite o consumo semanal de dados em MB, separados por vírgulas:");
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");
        
        
        // Divide a string de entrada em uma lista de valores
        String[] dadosSemanais = input.split(",");
        
        // Inicializa variáveis para cálculo
        int numeroDeSemanas = dadosSemanais.length;
        double totalConsumo = 0;
        double maiorConsumo = 0;
        int semanaDeMaiorConsumo = 0;
        
        // Processa cada valor da entrada
        for (int i = 0; i < numeroDeSemanas; i++) {
            double consumo = Double.parseDouble(dadosSemanais[i].trim());
            totalConsumo += consumo;
            
            // Verifica se este é o maior consumo
            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaDeMaiorConsumo = i + 1; // Semana é indexada a partir de 1
            }
        }
        
        // Calcula a média semanal
        double mediaSemanal = totalConsumo / numeroDeSemanas;
        
     // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + (int)totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + (int)mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + (int)semanaDeMaiorConsumo);

        scanner.close();
    }
}
