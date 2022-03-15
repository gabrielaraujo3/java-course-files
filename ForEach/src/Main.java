import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User userA = new User("Gabriel", "Araujo");
        User userB = new User("Gabriel", "Araujo");

        System.out.println(userA);
        System.out.println(userA.hashCode());
        System.out.println(userB);
        System.out.println(userB.hashCode());
        System.out.println(userA.equals(userB));

        /*
        // String[] => Fixo
        // new ArrayList<String>() => Dinâmicos
        List<String> names = new ArrayList<>();
        // como adicionar elementos no array:
        names.add("Nome 4");
        names.add("Nome 1");
        names.add("Nome 3");
        names.add("Nome 2");

        Collections.sort(names);

        for(String name : names) {
            System.out.println(name);
        }
         */
/*

// na classe user formatação do return para a função toString(), retornando aqui o configurado
        User userA = new User("Gabriel", "Araujo");

        System.out.println(userA.toString());
 */
    }
}