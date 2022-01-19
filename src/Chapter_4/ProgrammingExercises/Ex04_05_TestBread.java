package Chapter_4.ProgrammingExercises;

public class Ex04_05_TestBread
{
   public static void main(String[] args)
   {
      Ex04_05_Bread bread1 = new Ex04_05_Bread("rye", 120);
      Ex04_05_Bread bread2 = new Ex04_05_Bread("wheat", 95);
      Ex04_05_Bread bread3 = new Ex04_05_Bread("white", 100);
      display(bread1);
      display(bread2);
      display(bread3);
   }
   public static void display(Ex04_05_Bread b)
   {
      System.out.println("The " + b.getBreadType() + " bread has " +
         b.getCaloriesPerSlice() + " calories per slice");
      System.out.println("   The bread motto is " + b.MOTTO);
   }
}
