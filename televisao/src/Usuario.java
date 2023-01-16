public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada ? " + smartTv.estaLigada);
        System.out.println("Qual canal "+ smartTv.canal);
        System.out.println("Qual volume ?" + smartTv.volume);
        

        smartTv.Ligar();
        System.out.println("Está ligada? " + smartTv.estaLigada);
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        smartTv.AumentarVolume();
        System.out.println("volume " + smartTv.volume);
    }
}
