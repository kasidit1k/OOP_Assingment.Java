package Chap5;

import java.util.Scanner;
import java.util.ArrayList;

public class SaleCommission {

    static void printMenu() {
        System.out.println("------- Menu -------");
        System.out.println("0 : Exit ");
        System.out.println("1 : Sale Information Entry ");
        System.out.println("2 : Commission Summary ");
        System.out.println("------------------------------------");
    }

    static double calculateCommission(int saleClass, double saleTotal) {
        double commissionRate = 0.0;
        if (saleTotal < 10000) {
            switch (saleClass) {
                case 1:
                    commissionRate = 0.05;
                    break;
                case 2:
                    commissionRate = 0.15;
                    break;
                case 3:
                    commissionRate = 0.25;
                    break;
                default:
                    break;
            }
        } else {
            switch (saleClass) {
                case 1:
                    commissionRate = 0.10;
                    break;
                case 2:
                    commissionRate = 0.20;
                    break;
                case 3:
                    commissionRate = 0.30;
                    break;
                default:
                    break;
            }
        }
        return saleTotal * commissionRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        ArrayList<Saleman> list = new ArrayList<>();
        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2] : ");
            menu = sc.nextInt();

            if (menu == 1) {
                System.out.print("Enter Id : ");
                String id = sc.next();
                System.out.print("Enter Name : ");
                String name = sc.next();
                System.out.print("Enter Surname : ");
                String surname = sc.next();
                System.out.print("Enter Sale Class : ");
                int saleclass = sc.nextInt();
                System.out.print("Enter Sale Total : ");
                double saletotal = sc.nextDouble();

                Saleman man = new Saleman(); // Object Saleman
                man.setId(id);
                man.setName(name);
                man.setSurname(surname);
                man.setSaleclass(saleclass);
                man.setSaletotal(saletotal);
                list.add(man);

            } else {
                double totalSummary = 0;
                double commissionSummary = 0;  
                
                System.out.println("Show Data");
                for (int i = 0; i < list.size(); i++) {
                    Saleman cm = list.get(i);
                    double comission = calculateCommission(cm.getSaleclass(), cm.getSaletotal()); //เรียกใช้ method calculateCommission 
                   
                    totalSummary += cm.getSaletotal(); 
                    commissionSummary += comission;
                    
                    System.out.println("ID : " + cm.getId() + " Name : " + cm.getName() + " Surname : " + cm.getSurname()
                            + " Sale Class : " + cm.getSaleclass() + " Sale Total : " + cm.getSaletotal() + " baht " + " Commission : " + comission + " baht");
                }
                
                System.out.println("Summary");
                System.out.println("Sale Count : " + list.size());
                System.out.println("Sale Total : " + totalSummary + " baht");
                System.out.println("Commission Total : " + commissionSummary + " baht");
            }
        } while (menu != 0 && menu < 3);
    }
}
