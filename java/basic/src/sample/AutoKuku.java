package sample;
public class AutoKuku {
    public AutoKuku() {
        for (var i = 0; i < 10; i++) {
            for (var j = 0; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
}
