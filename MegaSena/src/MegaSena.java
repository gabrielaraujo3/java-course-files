import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {


// Interação com terminal por meio de input

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome");

        String name = scanner.nextLine();

        System.out.println("Ola, " + name);
    }
}


// Gerador de números aleatórios

// Com while
     /*   Random generate = new Random();

       /*int i = 0;
        while(i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }


//Com for

        for(int i = 0; i < 6; i++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }
}
*/