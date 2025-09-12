public class Main {
    public static void main(String[] args) {

        int somaPares = 0;

        for (int i = 500; i>=250; i-=2){
            System.out.println(i+"\n");
                somaPares += i;
        }
        System.out.println("Soma dos pares: "+ somaPares);
    }
}