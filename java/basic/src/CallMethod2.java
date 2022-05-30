import java.lang.reflect.Method;

public class CallMethod2 {
    public CallMethod2() {
        methodA("aaa");
        System.out.println(methodB());
    }

    public static void methodA(String value) {
        System.out.println(value);
    }

    public static String methodB() {
        return "文字列を返す";
    }
}
