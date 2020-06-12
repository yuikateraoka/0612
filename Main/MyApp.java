package Main;
import Calculation.CalFee;
import java.util.Scanner;

/**
 * MyApp 클래스 
 * 
 * @author (2020.06.12) 
 * @version (2014671308 김진수 , 2018315030 이가영,20183150 테라오카 유이카)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("신작인지 구작인지 입력해주세요(true,false) : ");
        boolean old  = sc.nextBoolean();
        System.out.print("요금을 입력 하세요 :");
        int cost = sc.nextInt();
        
        CalFee calfee = new CalFee();
        System.out.println("DVD요금은 : " + calfee.Cal(age,old,cost));
    }
}
