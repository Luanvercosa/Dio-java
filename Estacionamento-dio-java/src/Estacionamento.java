import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {
    String placa;
    Integer horas;
    private double precoInicial = 0;
    private double precoPorHora = 0;
    List<String> veiculos = new ArrayList<String>();
    Scanner entrada = new Scanner(System.in);

    public Estacionamento(double precoInicial, double precoPorHora)
    {
        this.precoInicial = precoInicial;
        this.precoPorHora = precoPorHora;
    }
    void AdicionarVeiculo(){
        System.out.print("Digite a placa para estacionar: ");
        placa = entrada.nextLine();
        veiculos.add(placa);
    }
    public void removerVeiculo() {
        System.out.println("Digite a placa do veículo para remover:");
    
        // Pedir para o usuário digitar a placa e armazenar na variável placa
        String placa = entrada.nextLine();
    
        // Verifica se o veículo existe
        if (veiculos.contains(placa)) {
            System.out.println("Digite a quantidade de horas que o veículo permaneceu estacionado:");
    
            // Pedir para o usuário digitar a quantidade de horas que o veículo permaneceu estacionado,
            int horas = entrada.nextInt();
            entrada.nextLine(); // limpar o buffer
            double valorTotal = precoInicial + (precoPorHora * horas);
    
            veiculos.remove(placa);
    
            System.out.printf("O veículo %s foi removido e o preço total foi de: R$ %.2f \n" ,placa,valorTotal);
        } else {
            System.out.println("Desculpe, esse veículo não está estacionado aqui. Confira se digitou a placa corretamente");
        }
    }
        public void listarVeiculos() {
            // Verifica se há veículos no estacionamento
            if (!veiculos.isEmpty()) {
                System.out.println("Os veículos estacionados são:");
                for (String veiculo : veiculos) {
                    System.out.println(veiculo);
                }
            } else {
                System.out.println("Não há veículos estacionados.");
            }
        }


}
