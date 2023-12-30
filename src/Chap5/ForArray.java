
package Chap5;

public class ForArray {
    public static void main(String[] args) {
        int numArr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        System.out.println("Data in numAtt : ");
        for (int i : numArr) {
            System.out.println(i + "\t");
        }
        
        System.out.println("Data in strArr : ");
        String strArr[] = {"Sex", "Bew", "Sun", "Khew", "Aom"};
        for (String name : strArr) {
            System.out.println(name+ "\t");
        }
    }
}
