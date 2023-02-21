<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
=======
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        printDiamond(height, width);
    }

    private static void printDiamond(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int distanceFromCenterX = Math.abs(j - width / 2);
                int distanceFromCenterY = Math.abs(i - height / 2);
                if (distanceFromCenterX + distanceFromCenterY <= height / 2) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
>>>>>>> c33e58b (Initial commit)
    }
}