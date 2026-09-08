import java.util.Scanner;
import java.util.InputMismatchException;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        Banco c1 = new Banco(1, 100, "Sede", 1);

        try {
            while (op != 4 && op != 5) {

                System.out.println("\n===== MENU =====");
                System.out.println("1 - Creditar");
                System.out.println("2 - Debitar");
                System.out.println("3 - Consultar Saldo");
                System.out.println("4 - Encerrar Conta");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opcao: ");

                op = sc.nextInt();

                switch (op) {

                    case 1:
                        if (c1.getTipo() != 4) {
                            System.out.print("Informe o valor a creditar: ");
                            double valorCredito = sc.nextDouble();
                            c1.creditar(valorCredito);
                            System.out.println("Novo saldo: R$ " + c1.getSaldo());
                        } else {
                            System.out.println("Erro: conta encerrada, operacao nao permitida.");
                        }
                        break;

                    case 2:
                        if (c1.getTipo() != 4) {
                            System.out.print("Informe o valor a debitar: ");
                            double valorDebito = sc.nextDouble();
                            c1.debitar(valorDebito);
                            System.out.println("Novo saldo: R$ " + c1.getSaldo());
                        } else {
                            System.out.println("Erro: conta encerrada, operacao nao permitida.");
                        }
                        break;

                    case 3:
                        System.out.println(c1.consultarSaldo());
                        break;

                    case 4:
                        if (c1.getSaldo() < 0) {
                            System.out.println("Nao e possivel encerrar: saldo negativo.");
                            op = 0;
                        } else {
                            c1.encerrarConta();
                            System.out.println(c1.textoEncerrar());
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando o programa...");
                        break;

                    default:
                        System.out.println("Opcao invalida! Tente novamente.");
                        break;
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada invalida. Digite apenas numeros.");
        } catch (Exception e) {
            throw new RuntimeException("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
