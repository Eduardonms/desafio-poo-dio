import java.util.Scanner;

public class VerificaConexao {
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a entrada do usuário
        System.out.println("Digite os registros de velocidade em Mbps separados por vírgula:");
        String entrada = scanner.nextLine();
        
        // Fecha o scanner
        scanner.close();
        
        // Divide a entrada em uma array de strings usando a vírgula como delimitador
        String[] velocidadesStr = entrada.split(",");
        
        // Verifica se algum valor é igual a "0"
        boolean houveQueda = false;
        for (String velocidade : velocidadesStr) {
            if (velocidade.trim().equals("0")) {
                houveQueda = true;
                break;
            }
        }
        
        // Imprime a mensagem apropriada com base na verificação
        if (houveQueda) {
            System.out.println("Queda de Conexao");
        } else {
            System.out.println("Sem Quedas");
        }
    }
}