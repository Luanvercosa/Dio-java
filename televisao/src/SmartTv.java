public class SmartTv {
    boolean estaLigada = false;
    int canal = 1;
    int volume = 25;


    public void Ligar(){
        estaLigada = true;
    }
    public void Desligar(){
        estaLigada = false;
    }
    public void AumentarVolume(){
        volume++;
        System.out.println("Alterando volume para " + volume);
    }
    
    public void DiminuirVolume(){
        volume--;
        System.out.println("Alterando volume para " + volume);
    }
    public void AumentarCanal(){
        canal++;
    }
    public void DiminuirCanal(){
        canal--;
}
    public void MudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
