import java.util.Scanner;

public class EstacionamentoTeste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precoInicial = 0;
        double precoPorHora = 0;

        System.out.println("Seja bem vindo ao sistema de estacionamento!\n" +
                "Digite o preço inicial:");
        precoInicial = entrada.nextDouble();

        System.out.println("Agora digite o preço por hora:");
        precoPorHora = entrada.nextDouble();
        entrada.nextLine();

        // Instancia a classe Estacionamento, já com os valores obtidos anteriormente
        Estacionamento es = new Estacionamento(precoInicial, precoPorHora);

        boolean exibirMenu = true;

        // Realiza o loop do menu
        while (exibirMenu) {
            System.out.println("Digite a sua opção:");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Remover veículo");
            System.out.println("3 - Listar veículos");
            System.out.println("4 - Encerrar");

            switch (entrada.nextLine()) {
                case "1":
                    es.AdicionarVeiculo();
                    break;

                case "2":
                    es.removerVeiculo();
                    break;

                case "3":
                    es.listarVeiculos();
                    break;

                case "4":
                    exibirMenu = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Pressione enter para continuar");
            entrada.nextLine();
        }

        System.out.println("O programa se encerrou");
    
        entrada.close();
    }


}
