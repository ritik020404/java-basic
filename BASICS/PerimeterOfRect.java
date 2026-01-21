import java.util.Scanner;
public class PerimeterOfRect {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l= sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();
        int peri = 2*(l+b);
        System.out.println("The Perimeter of rect is: ");
        System.out.println(peri);
    }
}
