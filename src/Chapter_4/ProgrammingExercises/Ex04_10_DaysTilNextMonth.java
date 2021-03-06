package Chapter_4.ProgrammingExercises;

import java.time.*;

public class Ex04_10_DaysTilNextMonth
{
   public static void main(String[] args)
   {
      LocalDate today = LocalDate.now();
      int day;
      int daysTilNextMo;
      System.out.println("Today is " + today);
      day = today.getDayOfMonth();
      daysTilNextMo = today.lengthOfMonth() - day;
      System.out.println("There are " + daysTilNextMo +
         " days until " + today.plusMonths(1).getMonth() + " starts");
   }
}
