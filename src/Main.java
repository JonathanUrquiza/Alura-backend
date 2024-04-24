import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa una opción ");
        String option = scanner.nextLine();

        while (option != "salir") {
            System.out.println("Ud. ingreso " + option);
            option = scanner.nextLine();

        }
    };
};