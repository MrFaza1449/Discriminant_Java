package Calculat;

import java.util.Scanner;

public class StoringValues {

    public static void start(){
        System.out.println("-------------------------------");
        System.out.print("Введите значение переменной А:");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        
        System.out.print("Введите значение переменной B:");
        double b = in.nextDouble();

        System.out.print("Введите значение переменной C:");
        double c = in.nextDouble();
        System.out.println("-------------------------------");
        in.close();
        Solution.solution(a,b,c); 
    }
}
