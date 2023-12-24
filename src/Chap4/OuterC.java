package Chap4;

class OuterC {

    int out1 = 5;
    static int out2 = 10;

    void outerMethod1() { //non-static method
        System.out.println("outerMethod1");
    }

    static void outerMethod2() { // static method
        System.out.println("outerMethod2");
    }

    void outerMethod3(int x, boolean y, int z) { //non-static 
        System.out.println("outerMethod3");
        class Local {
            void showDetails() {
                System.out.println("showDetails");
            }
        }

        class MyLocal {
            void showDetails() {
                System.out.println("showDetails");
            }
        }

        if (y) {
            new Local().showDetails(); //เรียกใช้ method
        } else {
            outerMethod1();
        }
    }

    void outerMethod4() { // non-static
        class Local {
            void showDetails() {
                System.out.println("showDetails");
            }
        }
        
        class MyLocal {
            void showDetails() {
                System.out.println("showDetails");
            }
        }
    }
}
