import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[10];
        System.out.println(Arrays.toString(names));
        // Iniciando um array(lista) com valores padrões
        Arrays.fill(names, "Desconhecido");

        System.out.println(Arrays.toString(names));
    }

}
