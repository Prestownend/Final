public class Character
{
    public static int location = 0;
    private int health = 5;
    public Character()
    {
        location = 0;
        health = 5;
    }
    public void takeDamage()
    {
        health -= 1;
    }
    public static int getLocation()
    {
        return location;
    }
    public static void setLocation(int desiredLocation)
    {
        location = desiredLocation;
    }
}