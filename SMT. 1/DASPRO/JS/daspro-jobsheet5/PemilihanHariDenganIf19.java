import java.util.Scanner;
public class PemilihanHariDenganIf19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        int number;
        String dayType;

        System.out.print("Input day name: ");
        number = sc.nextInt();

        if (number >=1 && number <=5) 
        {
            System.out.print(number + " is a " + (dayType = "weekday"));
        }
        else if (number >=6 && number <=7)
        {
            System.out.print(number + " is a " + (dayType = "weekend"));
        }
        else{
            System.out.print("Invalid Number");
        }
    }
}