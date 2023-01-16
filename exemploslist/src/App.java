 import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class  App{
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0)); //  Método indexOff() Exibe a posiçaõ do numero procurado, ou seja do numero que está dentro do array!!
        System.out.println("Adicione na lista a nota 8.0 na posição 4: " );
        notas.add(4, 8.0); // Aqui é o método add() com dois indices, o primeiro é a posição que você deseja adicionar o novo numero e o segundo é o número que você deseja
        System.out.println(notas.toString()); // O número 8.0 ja foi adicionado dentro do array
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0),6.0);// Chama o indice pelo número que deseja substituir e o segundo substitui pelo numero que deseja
        System.out.println(notas); // Aqui mostra o número já trocado!
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // Aqui deu true porque ainda tem mais um 5 na lista!!
        System.out.println("Exiba todas as notas na ordem: "); // Aqui são as notas adicionadas em ordem de criação!
        for (Double nota : notas) {
            System.out.println(nota);
            
        } // fizemos um foreach para diferenciar, porém não seria preciso!
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // Aqui mostra a 3º nota que foi adicionada no array!
        System.out.println("Exiba a menor nota: " + Collections.min(notas)); // Collection utilizada para mostrar a menor nota do array, visto que o array não tem esse tipo de método dele mesmo!
        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // Aqui já é uma collection inversa para ver a maior nota utilizada!!
       
         Iterator<Double> iterator = notas.iterator(); // método iterator
         Double soma = 0.0; // cria uma váriavel de um tipo contador
         while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
         } // cria um laço de repetição para somar as notas dp array!
         System.out.println("Exiba a soma dos valores: " + soma);
         System.out.println("Divida os valores: " + soma/notas.size() ); // ja com  a soma criada o metodo de dividir é mais facil, basta colocar array.size() que significa a quantidade de numeros da array.
         System.out.println(notas.size()); // mostra a quantidade de numeros adicionados na array
         notas.add(0.0);
         System.out.println(notas.toString());
         System.out.println("Remova o numero 0.0");
         notas.remove(0d);
         System.out.println(notas);
         System.out.println("Remova as notas menores que 7: ");
         Iterator<Double> iterator1 = notas.iterator(); //cria o método iterator!
        
         while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7 ){
                iterator1.remove();
            }
         } //cria um laço de repetião com condição (se o proximo for menor que 7, remova) ou seja remova a proxima nota se for menor que 7.
         System.out.println(notas); // mostra a nova nota com a remoção das notas menores!
         System.out.println("Apague toda a lista");
         notas.clear();
         System.out.println(notas);
         System.out.println("A lista está vazia: " +notas.isEmpty());
    }
}

    


