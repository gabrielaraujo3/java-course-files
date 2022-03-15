import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // String[] => Fixo
        // new ArrayList<String>() => Dinâmicos
        List<String> names = new ArrayList<>();
        // como adicionar elementos no array:

        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");


        // .size (itens em um ArrayList) - .length (itens em um array normal [])
        // buscar um elemento especifico pelo indice get()
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // encontrar o indice do elemento
        System.out.println(names.indexOf("Nome 2"));

        // verifica se a lista está vazia
        System.out.println(names.isEmpty());

        // verifica se a lista contém algum elemento / filtrar
        System.out.println(names.contains("Nome 14"));

        //verifica o tamanho da lista
        System.out.println(names.size());

        // limpar de vez a lista (remover todos os elementos)
        names.clear();
        System.out.println(names.isEmpty());
    }
}
