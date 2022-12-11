import java.util.Scanner;
public class DigitosNumero {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int num = sc.nextInt();
        sc.close();
        int digitos = ContarDigitos(num);
        System.out.println("O numero " + num + " possui " + digitos + " digitos.");

    }
    public static int ContarDigitos(int num) {
        String digitos = Integer.toString(num);
        return digitos.length();
    }
}
