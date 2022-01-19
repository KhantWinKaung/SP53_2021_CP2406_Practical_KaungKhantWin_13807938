package Chapter_4.ProgrammingExercises;

public class Ex04_04_TestBloodData
{
   public static void main(String[] args)
   {
       Ex04_04_BloodData b1 = new Ex04_04_BloodData();
       Ex04_04_BloodData b2 = new Ex04_04_BloodData("A", "-");
       display(b1);
       display(b2);
       b1.setBloodType("AB");
       b1.setRhFactor("-");
       display(b1);
   }
   public static void display(Ex04_04_BloodData b)
   {
      System.out.println("The blood is type " + b.getBloodType() + b.getRhFactor());
   }

}