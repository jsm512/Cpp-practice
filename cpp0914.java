import java.util.Scanner;

public class Cpp0914 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("점수를 입력하세요");
            int score = sc.nextInt();
            if(score == 0) break;
            if(score >= 95) System.out.println("A+ 입니다.");
            else if(score < 95 && score >= 90) System.out.println("A 입니다.");
            else if(score < 90 && score >= 85) System.out.println("B+ 입니다.");
            else if(score < 85 && score >= 80) System.out.println("B 입니다.");
            else if(score < 80 && score >= 75) System.out.println("C+ 입니다.");
            else if(score < 75 && score >= 80) System.out.println("C 입니다.");
            else System.out.println("재수강해라");
        }
    }
}
