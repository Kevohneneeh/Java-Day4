import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        double[][] prices;
        prices = new double[5][2];
        Scanner chukua;
        chukua = new Scanner(System.in);
        for (int i = 0; i<5; i ++){
            prices[i][0] = chukua.nextDouble();
            prices[i][1] = prices[i][0]*0.70;
        }
        for (int i = 0; i < 5; i++){
            System.out.println("Original price = "+prices[i][0]+"\t\tDiscounted Price);
        }
    }
}
