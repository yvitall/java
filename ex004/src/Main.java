import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n;
        while (true){
            System.out.print("Digite qualquer valor (ou 007 para sair): ");
            n = sc.nextInt();
            sc.nextLine();
            if (n == 007){
                break;
            } else if (n > 0) {
                numbers.add(n);

            }
        }

        System.out.println(numbers);
    }
}