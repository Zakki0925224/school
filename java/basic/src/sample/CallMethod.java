package sample;
public class CallMethod {
    public CallMethod() {
        System.out.println("hello()を呼び出す");
        hello();
        System.out.println("hello()を呼び出した");
    }

     public static void hello() {
        System.out.println("こんにちは");
     }
}
