package asteriscos;

import java.util.Scanner;

public class asteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuantos asteriscos quieres en la pantalla? ");
        int respuesta = sc.nextInt();

        for (int i = 0; i < respuesta; i++) {
            System.out.println("*");
        }
    }
}
