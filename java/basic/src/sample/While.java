package sample;
public class While {
    public While() {
        // while
        var temp = 0;

        while (temp < 10) {
            System.out.println(temp);
            temp++;
        }

        System.out.println("---------------------");

        // do while
        var temp2 = 10;

        do {
            System.out.println(temp2);
            temp2++;
        } while (temp2 < 10);
    }
}