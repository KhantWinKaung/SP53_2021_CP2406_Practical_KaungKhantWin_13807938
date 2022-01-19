import java.time.*;
public class Ex04_03_TestFitnessTracker
{
   public static void main(String[] args)
   { 
      Ex04_03_FitnessTracker exercise = new Ex04_03_FitnessTracker();

      System.out.println(exercise.getActivity() + " " + exercise.getMinutes() +
         " minutes on " + exercise.getDate());

      // code to test constructor added for exercise 3b
 
      LocalDate date = LocalDate.of(2015, 8, 20);
      Ex04_03_FitnessTracker exercise2 = new Ex04_03_FitnessTracker("bicycling", 35, date);

      System.out.println(exercise2.getActivity() + " " + exercise2.getMinutes() +
         " minutes on " + exercise2.getDate());
   }
}