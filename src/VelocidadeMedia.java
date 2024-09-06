import java.util.Scanner;

public class VelocidadeMedia {
	public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
                
        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        System.out.println("Digite os registros de velocidade em Mbps separados por vírgula:");
        String input = scanner.nextLine();
        
     // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");
        
        // Verifica se algum valor é igual a "0"
        boolean verificarQuedaConexao = false;
        for (String velocidade : velocidades) {
            if (velocidade.trim().equals("0")) {
            	verificarQuedaConexao = true;
                break;
            }
        }
        
        // Imprime a mensagem apropriada com base na verificação
        if (verificarQuedaConexao) {
            System.out.println("Queda de Conexao");
        } else {
            System.out.println("Sem Quedas");
        }
        scanner.close();
    }
}