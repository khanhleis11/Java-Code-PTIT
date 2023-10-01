package demo;

public class BasicStatement {
    public static void main(String[] args) {
        int a[];
        a = new int[9];
        a[0] = 12;
        a[1] = 1;
        System.out.println("So phan tu: " + a.length);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
//            System.out.println("")
        }
        System.out.println("");
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println("");
//        Thư viện Math có thể làm được rất nhiều thứ...
        System.out.println(Math.E);
        System.out.println(Math.toDegrees(Math.PI/2));
//        System.out.println("");
    }
}
