import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int numbers;
        int somNumbersImpares = 0;
        for (int i = 250 ; i<=500;i++){
            if (i % 2 != 0) {
                System.out.print(i+ "\n");
                somNumbersImpares += i;

            }
        }
        System.out.println("A soma de todos os números ímpares entre 250 a 500 é igual a: "+ somNumbersImpares);
    }
}