package Chapter_4.ProgrammingExercises;

public class Ex04_05_Bread
{
   private String breadType;
   private int caloriesPerSlice;
   public final static String MOTTO = "The staff of life";
   public Ex04_05_Bread(String bread, int cal)
   {
      breadType = bread;
      caloriesPerSlice = cal;
   }
   public String getBreadType()
   {
      return breadType;
   }
   public int getCaloriesPerSlice()
   {
      return caloriesPerSlice;
   }
}