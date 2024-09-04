import java.util.Scanner;

public class Leap year {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Year = sc.nextInt();

        if(Year % 4 == 0){
            System.out.println("Leap year");
        }else{
            System.out.println("not a leap year");}
    }
}
