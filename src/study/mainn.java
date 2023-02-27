package study;
import java.util.Scanner;
public class mainn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=playgam(a,b);
        System.out.println("得到的结果为："+c);
    }

    public static int playgam(int num1,int num2) {
        System.out.println("游戏开始");
        System.out.println("选人物");
        System.out.println("选技能");
        System.out.println("开始战斗");
        System.out.println("游戏结束");
        int num3=num1+num2;
        System.out.println("你的得分是"+num3);
        return num3;
    }
}
