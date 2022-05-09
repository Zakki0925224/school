public class Fortune
{
    public Fortune()
    {
        System.out.println("I divine your fortune!");
        var f = new java.util.Random().nextInt(4) + 1; // 1 ~ 4

        System.out.print("You are...");
        if (f == 1)
        {
            System.out.println("excellent luck!");
        }
        else if (f == 2)
        {
            System.out.println("good luck!");
        }
        else if (f == 3)
        {
            System.out.println("luck!");
        }
        else if (f == 4)
        {
            System.out.println("bad luck!");
        }

        switch(f)
        {
            case 1:
                System.out.println("You are...excellent luck!");
                break;

            case 2:
                System.out.println("You are...good luck!");
                break;

            case 3:
                System.out.println("You are...luck!");
                break;

            default:
                System.out.println("You are...bad luck!");
                break;
        }
    }
}
