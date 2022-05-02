public class SampleIf {
    public SampleIf() {
        var a = 1;

        if (a == 1) {
            System.out.println("a is 1");
        }
        else {
            System.out.println("a is not 1");
        }

        if (a != 1) {
            System.out.println("a is not 1");
        }
        else {
            System.out.println("a is 1");
        }

        if (a > 0) {
            System.out.println("a is bigger than 0");
        }
        else {
            System.out.println("a is not bigger than 0");
        }

        if (a < 0) {
            System.out.println("a is smaller than 0");
        }
        else {
            System.out.println("a is not smaller than 0");
        }

        if (a >= 0) {
            System.out.println("a is bigger or equal than 0");
        }
        else {
            System.out.println("a is not bigger or equal than 0");
        }

        if (a <= 0) {
            System.out.println("a is smaller or equal than 0");
        }
        else {
            System.out.println("a is not smaller or equal than 0");
        }

        var str = "sunset";

        if (str.equals("sunset")) {
            System.out.println("str is sunset");
        }
        else {
            System.out.println("str is not sunset");
        }
    }
}