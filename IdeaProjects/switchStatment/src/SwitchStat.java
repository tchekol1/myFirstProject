import java.util.Scanner;

public class SwitchStat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = scanner.nextInt();
        String month;
        switch (number){
            case 30:
                 month="September April June November";
                break;
            case 29:
                month= "Feburary";
                break;
            case 31:
                month="October November December May";
                break;
            default:
                month="No month exactly that day";
                break;

        }
        System.out.println(month);

    }
}
