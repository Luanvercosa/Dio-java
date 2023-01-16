public class Metodos {
    public static void main(String[] args) {
        String nome = "Luan"; 
        String sobrenome = "Verçosa";
        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String nome , String sobrenome){
        return "O seu nome é "+ nome + " " + sobrenome; 
    }
}
