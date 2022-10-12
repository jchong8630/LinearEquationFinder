import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first (x,y) coordinate point: ");
        String xy1 = s.nextLine();
        System.out.print("Enter the second (x,y) coordinate point: ");
        String xy2 = s.nextLine();
        LinearEquation equation = new LinearEquation(xy1, xy2);
        System.out.println(equation);
        System.out.print("Enter an x-value: ");
        int xCoord = s.nextInt();
        equation.getX(xCoord);
    }
}
