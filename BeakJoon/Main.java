package BeakJoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int cookTime = sc.nextInt();
        int completeTime = min + cookTime;
        if(completeTime > 60){
            hour += completeTime / 60;
            completeTime = completeTime % 60;
        }
        if(hour > 23){
            hour %= 23;
        }
        System.out.println(hour + " " + completeTime);
    }
}
