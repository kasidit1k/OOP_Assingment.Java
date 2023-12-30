package Chap5;

import java.util.Scanner;
public class CountAlphabet {

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนประโยค : ");
        String sentence = sc.nextLine().toLowerCase();
        System.out.println("มีอักขระจำนวน " + sentence.length() + " ตัว");
        for (int j = 0; j < sentence.length(); j++) {
            char ch = sentence.charAt(j);
        System.out.println("ch = : " + ch);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("สระจำนวน : " + count);
        System.out.println("ไมใช่สระ : " + count);
    }
}
