import java.util.Scanner;

// movie theater ticket program that takes as input row and column 

public class MovieTickets {
    
    public static void main(String[] args) {
        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
    
        int row = sc.nextInt();
        int column = sc.nextInt();

        if(seats[row][column]==0){
            System.out.println("Free");
        } else
System.out.println("Sold");
    }

}
