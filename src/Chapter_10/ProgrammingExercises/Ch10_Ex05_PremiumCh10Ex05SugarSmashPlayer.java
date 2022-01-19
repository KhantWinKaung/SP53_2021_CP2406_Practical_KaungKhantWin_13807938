package Chapter_10.ProgrammingExercises;

public class Ch10_Ex05_PremiumCh10Ex05SugarSmashPlayer extends Ch10_Ex05_SugarSmashPlayer
{
   private final int MINSCORE = 100;
   private int LEVELS = 50;
   public Ch10_Ex05_PremiumCh10Ex05SugarSmashPlayer()
   {
      scores = new int[LEVELS];
   }
   @Override
   public int getLevels()
   {
      return LEVELS;
   }
}
