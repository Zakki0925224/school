public class Random {
    public Random()
    {
        var r = new java.util.Random().nextInt(90);
        System.out.println("Are you " + r + " years old?");
    }
}