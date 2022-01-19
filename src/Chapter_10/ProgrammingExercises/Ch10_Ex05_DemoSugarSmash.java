package Chapter_10.ProgrammingExercises;

public class Ch10_Ex05_DemoSugarSmash
{
   public static void main(String[] args)
   {
      Ch10_Ex05_SugarSmashPlayer ssPlayer = new Ch10_Ex05_SugarSmashPlayer();
      ssPlayer.setIdNumber(1111);
      ssPlayer.setName("Alex");
      System.out.println("\nAt start");
      display(ssPlayer);       
      ssPlayer.setScore(200, 0);
      System.out.println("\nAfter setting first score");
      display(ssPlayer);
      System.out.println("Trying to set fifth score too soon");
      ssPlayer.setScore(30, 4);
      System.out.println("\nAfter setting second score");
      ssPlayer.setScore(30, 1);
      display(ssPlayer);
      System.out.println("\nTrying to set third score when second is too low");
      ssPlayer.setScore(100, 2);
      display(ssPlayer);
      System.out.println("\nAfter setting second, third, fourth, and fifth scores");
      ssPlayer.setScore(100, 1);
      ssPlayer.setScore(300, 2);
      ssPlayer.setScore(400, 3);
      ssPlayer.setScore(10, 4);
      display(ssPlayer);
      System.out.println("\nTrying to set eleventh score");
      ssPlayer.setScore(100, 10);
//-------------------------------------------------------
      Ch10_Ex05_PremiumCh10Ex05SugarSmashPlayer pssPlayer = new Ch10_Ex05_PremiumCh10Ex05SugarSmashPlayer();
      pssPlayer.setIdNumber(2222);
      pssPlayer.setName("Cory");
      System.out.println("\nAt start");
      display(pssPlayer);       
      pssPlayer.setScore(200, 0);
      System.out.println("\nAfter setting first score");
      display(pssPlayer);
      System.out.println("Trying to set fifth score too soon");
      pssPlayer.setScore(30, 4);
      System.out.println("\nAfter setting second score");
      pssPlayer.setScore(30, 1);
      display(pssPlayer);
      System.out.println("\nTrying to set third score when second is too low");
      pssPlayer.setScore(100, 2);
      display(pssPlayer);
      System.out.println("\nAfter setting second through tenth scores");
      for(int x = 1; x < 10; ++x)
         pssPlayer.setScore(130, x);
      display(pssPlayer);
      System.out.println("\nTrying to set eleventh score");
      pssPlayer.setScore(100, 10);
       display(pssPlayer);
      System.out.println("\nTrying to set 51st score");
      pssPlayer.setScore(100, 50);
      display(pssPlayer);
   }
   public static void display(Ch10_Ex05_SugarSmashPlayer p)
   {
      System.out.println("   ID #" + p.getIdNumber() + "  Name: " +
         p.getName());
      for(int x = 0; x < p.getLevels(); ++x)
         System.out.print("   " + p.getScore(x));
      System.out.println();
   }
}