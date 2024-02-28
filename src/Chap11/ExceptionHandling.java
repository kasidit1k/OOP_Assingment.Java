package Chap11;

public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int zero = 0;
            int result = 1500 / zero;
        } catch (Exception a) {
            System.out.println("หาร 0 ไม่ได้");
        }finally{
            System.out.println("Exit");
        }
 
//        try {
//            String str = null;
//            str.length();
//        }catch(NullPointerException e){
//            System.out.println("Object = null");
//        }
//        
//        try{
//            int x[] = new int[2]; 
//            x[0] = 5; 
//            x[1] = 10; 
//            x[2] = 15;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("อ้างอิงไม่ถุกต้อง");
//        }
//        
//        try {
//            Integer.parseInt("A");
//        } catch (NumberFormatException e) {
//            System.out.println("รูปแบบตัวเลขไม่ถูกต้อง");
//        }
        

    }
}
