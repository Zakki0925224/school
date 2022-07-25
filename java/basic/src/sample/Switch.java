package sample;
public class Switch
{
    public Switch()
    {
        var s = new java.util.Scanner(System.in);
        System.out.print("Enter your age: ");
        var age = Integer.parseInt(s.nextLine());

        switch(age)
        {
            case 0:
                System.out.println("You are...0 years old");
                break;

            case 10:
                System.out.println("You are...10 years old");
                break;

            case 20:
                System.out.println("You are...20 years old");
                break;

            case 30:
                System.out.println("You are...30 years old");
                break;

            case 35:
                System.out.println("You are...35 years old");
                break;

            default:
                System.out.println("You age is out of supported range");
                break;
        }
    }
}
