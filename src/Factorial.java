import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        long fact =1;
        int n=0,aux;
        Scanner kb = new Scanner(System.in);
        System.out.printf("n=");
        while (!kb.hasNextInt())
        {
            System.out.println("nope");
            kb.next();
            System.out.printf("n=");
        }
        n = kb.nextInt();
        aux=n;
        for(;n>1; n--) fact *=n;
        System.out.printf("%d!=%d", aux, fact);
    }
}
