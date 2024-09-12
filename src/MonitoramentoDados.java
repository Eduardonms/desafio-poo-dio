
import java.util.Scanner;

public class MonitoramentoDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando ao usuário o limite mensal de dados em GB
        double limiteGb = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        // Solicitando ao usuário o consumo total de dados em MB
        int consumoTotalMb = scanner.nextInt();
        
        scanner.close();  
        
        
     // Função para converter GB para MB
        double limiteMb = limiteGb * 1024;
        
     // Função principal para verificar o limite de dados móveis
        if (consumoTotalMb > limiteMb) {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        } else {
            int dadosDisponiveis = (int) (limiteMb - consumoTotalMb);
            System.out.println("Voce ainda possui " + dadosDisponiveis + " MB disponiveis.");
        }
        
    }
}