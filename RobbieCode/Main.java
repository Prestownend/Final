
public class Main
{
   public static void main()
   {
       boolean game = true;
       Character robbie = new Character();
       Display adventure = new Display("Push", "Button", "To", "Start", robbie);
       boolean[] doneYet = {false,false,false,false,false,false,false,false,false,false,false,false,false};
       while(game)
       {
          if(Character.getLocation() == 0)
          {
            if(!doneYet[0]) 
            {
              System.out.println("Welcome to Robbie's Radtastic RAMpage!\nPush a button to Start\n");
              
              doneYet[0] = true;
            }
          }
          else if(Character.getLocation() == 1)
          {
              if(!doneYet[1])
              {
                  adventure.setButtons("Continue"," "," "," ");
                  System.out.println("Insert Proluge here");
              
                  doneYet[1] = true;
              }
          }
          else if(Character.getLocation() == 2)
          {
              
          }
          else if(Character.getLocation() == 3)
          {
              
          }
          else if(Character.getLocation() == 4)
          {
              
          }
          else if(Character.getLocation() == 5)
          {
              
          }
          else if(Character.getLocation() == 6)
          {
              
          }
          else if(Character.getLocation() == 7)
          {
              
          }
          else if(Character.getLocation() == 8)
          {
              
          }
          else if(Character.getLocation() == 9)
          {
              
          }
       }
   }
}
