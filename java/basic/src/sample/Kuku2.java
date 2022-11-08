package sample;

public class Kuku2 {
    public Kuku2() {
        var nums = new java.util.Scanner(System.in).nextLine().split(",");

        var kuku = new String[9][nums.length];

        for (var i = 0; i < 9; i++) {
            for (var j = 0; j < nums.length; j++) {
                if (i == 0) {
                    kuku[i][j] = nums[j];
                } else {
                    kuku[i][j] = String.valueOf(Integer.parseInt(nums[0]) * i);
                }
            }
        }

        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < 9; j++) {
                System.out.print(kuku[i][j] + " ");
            }
            System.out.println();
        }
    }
}
