import java.util.Scanner;

public class EmprestimosBanco {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

       // System.out.println("Empréstimo: ");
       double P = sc.nextDouble();

        //System.out.println("Pagos por mês");
        double A = sc.nextDouble();

        int i = sc.nextInt();

        System.out.println();
    }

    // A = fA + (1/100 * TP)


    static double parcelaComJuros(double A, double P, int i){
        return A+calcularJuros(P,i);
    }

    static double calcularJuros(double P, int i){
        return (i/100.0d) * P;
    }

    // Por mês
}
