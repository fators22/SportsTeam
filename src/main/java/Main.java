/**
 * Write a description of class MainSports here.
 * 
 * @author CS Awesome
 * @modified Fatma Orsun
 * @version December 2022
 */


public class Main
{
    public static void main(String[] args)
    {
        SportsTeam bergenTech = new Football("Knights", 16, 10, 6, 0, 51, 8);

        SportsTeam passaicTech = new Baseball("Bulldogs", 162, 59, 103, 0, 200, 690, 126);

        System.out.println(bergenTech);

        System.out.print("\n\n" + passaicTech);

    }
}
