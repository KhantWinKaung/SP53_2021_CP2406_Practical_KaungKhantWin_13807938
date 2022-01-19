package Chapter_4.ProgrammingExercises;

public class Ex04_05_SandwichFilling
{
   private String filling;
   private int calories;
   public Ex04_05_SandwichFilling(String fill, int cal)
   {
      filling = fill;
      calories = cal;
   }
   public String getSandwichFilling()
   {
      return filling;
   }
   public int getCalories()
   {
      return calories;
   }
}