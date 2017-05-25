
/**
 * Creates items for the Game.
 * 
 * @author (Luke Humphrey) 
 * @version (a version number or a date)
 */
public class Inventory
{
   private boolean coffee;
   private boolean book;
   public Inventory()
   {
       coffee = false;
       book = false;
   }
   public void getItemCoffee()
   {
       coffee = true;
   }
   public void getItemBook()
   {
       book = true;
   }
}

