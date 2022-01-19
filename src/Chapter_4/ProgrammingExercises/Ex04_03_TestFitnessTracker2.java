package Chapter_4.ProgrammingExercises;

import java.time.*;
public class Ex04_03_TestFitnessTracker2
{
   public static void main(String[] args)
   { 
      Ex04_03_FitnessTracker2 exercise = new Ex04_03_FitnessTracker2();

      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
         " minutes on " + exercise.getDate());

      // code to test constructor added for exercise 3b
 
      LocalDate date = LocalDate.of(2015, 8, 20);
      Ex04_03_FitnessTracker2 exercise2 = new Ex04_03_FitnessTracker2("bicycling", 35, date);

      System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
         " minutes on " + exercise2.getDate());
   }
}