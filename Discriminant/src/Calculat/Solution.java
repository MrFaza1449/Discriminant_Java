package Calculat;

public class Solution {
    public static void solution (double a, double b, double c){
        System.out.println("\nУравнение: " + a + "x^2 " + - b + "x + " + c + " = 0");
        System.out.println("Находим дискриминант уравнения\n");

        double dis = (b*b)-(4*a*c);
        System.out.println("Дискриминант равен = " + dis);
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Уравнение имеет два корня: x1 = " + x1 + ", x2 = " + x2);
        } else if (dis == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
