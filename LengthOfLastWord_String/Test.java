import java.util.Scanner;

public class Test {
    public static void findLastWord(String str){
        String[] s = str.split(" ");
        int length = s.length;
        System.out.println(s[length-1].length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findLastWord(str);
    }
}
