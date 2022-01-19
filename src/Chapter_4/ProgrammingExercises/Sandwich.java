package Chapter_4.ProgrammingExercises;

public class Sandwich
{
   private Ex04_05_Bread bread;
   private Ex04_05_SandwichFilling filling;
   public Sandwich(String bread, int breadCal, String filling, int fillingCal)
   {
      this.bread = new Ex04_05_Bread(bread, breadCal);
      this.filling = new Ex04_05_SandwichFilling(filling, fillingCal);
   }
   public Ex04_05_Bread getBread()
   {
      return bread;
   }
   public Ex04_05_SandwichFilling getSandwichFilling()
   {
      return filling;
   }
}