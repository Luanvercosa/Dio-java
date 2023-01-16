public class Carro {
    boolean estaLigado = false;
    String marca;
    int ano;
    double tanque;
    double quantidadeDeGasolina;
    boolean abastecer;
    
    // Método de Ligar o Carro, Pórem ele só liga com gasolina
    // para liga-lo, basta apenas abastecer com o método Abastecer()
     void Ligar(){
        if (quantidadeDeGasolina > 0){
            estaLigado = true;
        }else{estaLigado = false;
        }
        
    }
    // Método Desligar o carro;
    void Desligar(){
        estaLigado = false;
    }
    // Método de acelerar o carro, Pórem ele só irá acelerar se o carro estiver com gasolina e ligado!
    void Acelerar(){
        if (quantidadeDeGasolina > 0 && estaLigado == true){
            quantidadeDeGasolina--; // A cada acelerada o carro irá perder 1 litro de gasolina!
            System.out.println("Vrum vrum vrum");
        }else{ // se estiver sem gasolina o carro irá desligar sozinho
            estaLigado = false;
            System.out.println("IC IC IC ");
        }
    } // Metodo Abastecer, ele irá abastecer um litro a cada vez que for chamado, porém ele não irá ultrapassar os litros suportados do tanque do carro
    void abastecer(){
        quantidadeDeGasolina ++;
        if(quantidadeDeGasolina <= tanque){ // Se a quantidade de gasolina for menor ou igual a do tanque, abasteça
            System.out.printf("Abastecendo %.2f litros! \n", quantidadeDeGasolina);
        }else{ // se não, não abasteça mais
            quantidadeDeGasolina --;
        }
        
}    
}
    
    
    



    



