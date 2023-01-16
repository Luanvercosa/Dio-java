public class CarroTeste {
    public static void main(String[] args) {
            Carro gol = new Carro(); // Chama o carro pelo nome dele

           gol.ano = 2019; // ano do carro
           gol.marca = "Volkswagem"; // marca do carro
           gol.tanque = 20; //Quantidade de litros do tanque

           System.out.println(gol.ano);
           System.out.println(gol.marca); 
           System.out.println(gol.tanque);
        
           System.out.println(gol.estaLigado);
           gol.Ligar();
           gol.abastecer();
           gol.abastecer();
           gol.abastecer();
           gol.abastecer();
           gol.abastecer();
           System.out.println(gol.quantidadeDeGasolina);
           gol.Ligar();
           System.out.println(gol.estaLigado);
           gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);
          gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);
          gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);
          gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);
          gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);
          gol.Acelerar();
          System.out.println(gol.quantidadeDeGasolina);


          Carro uno = new Carro();
          uno.ano = 2023;
          uno.marca = "Fiat";
          uno.tanque = 19;


          System.out.println(uno.ano);
          System.out.println(uno.marca);
          System.out.println(uno.tanque);
          System.out.println(uno.estaLigado);
          uno.Ligar();
          System.out.println(uno.estaLigado);
          
          
          

    }
}
