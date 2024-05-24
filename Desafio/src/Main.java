import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        for (int i = 0; i < limiteDiario; i++) {

            double valorSaque = scanner.nextDouble();

            if(valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if(valorSaque < limiteDiario) {
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            } else {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

        }
        scanner.close();
    }
}


// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;


// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:


// TODO: Informe que o saque foi realizado e mostre o limite restante: