package MiniProjectKasidit;
import java.util.Scanner;

/**
 *
 * @author TUF
 */
public class CallculatorBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight : ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height : ");
        double height = sc.nextDouble();
        height /= 100;
        
        double bmi = weight / (height * height);
        
        System.out.println("BMI = "+bmi);
    }
}
