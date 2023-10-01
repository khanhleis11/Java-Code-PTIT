
package demo;


public class OneArray {
//    Nếu trong C/C++ có hàm thì trong java sẽ có method
//    Các method: public, protected, no modifier, private
    private static double tongDaySo(double a[]){
        double sum = 0;
        for (double i : a){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        double a[] = {1, 3, 5};
//        System.out.println("Tong: " + tongDaySo(1.1, 2.2, 3.3));
        System.out.println("Tong: " + tongDaySo(a));
    }
}
