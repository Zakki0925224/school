package sample;
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

        var _age = 20;
        var birthMonth = 4;

        if (_age >= 18 && birthMonth == 5) {
            System.out.println("You are more than 18 years old and born in May");
        }

        if (_age >= 18 || birthMonth == 5) {
            System.out.println("You are more than 18 years old or born in May");
        }

        var scanner = new java.util.Scanner(System.in);

        System.out.print("Enter your name: ");
        var name = scanner.nextLine();
        System.out.print("Enter your age: ");
        var ageStr = scanner.nextLine();
        var age = Integer.parseInt(ageStr);

        if (name.equals("Zakki") && age >= 20) {
            System.out.println("Hello, " + name + "!");
        }

        if (age <= 5 || age >= 15) {
            System.out.println("Your age is not between 5 and 15");
        }

        if (age <= 20) {
            System.out.println("Your age is smaller than 20");
        }

        if (age == 10) {
            System.out.println("Your age is 10");
        }

        // if-else
        if (age == 10) {
            System.out.println("Your age is 10");
        }
        else {
            System.out.println("Your age is not 10");
        }

        //else if
        if (age == 10) {
            System.out.println("Your age is 10");
        }
        else if (age == 15) {
            System.out.println("Your age is 15");
        }
        else {
            System.out.println("Your age is not 10 or 15");
        }

        scanner.close();
    }
}