import java.time.*;
public class Ex04_03_FitnessTracker2
{
   String activity;
   int minutes;
   LocalDate date;
   // constructor added for Exercise 3a
   public Ex04_03_FitnessTracker2()
   {
      this("running", 1, LocalDate.of(2016, 1, 1));
   }
   // constructor added for Exercise 3b
   public Ex04_03_FitnessTracker2(String a, int m, LocalDate d)
   {
      activity = a;
      minutes = m;
      date = d;
   }
   public String getActivity()
   {
      return activity;
   }
   public int getMinutes()
   {
      return minutes;
   }
   public LocalDate getDate()
   {
      return date;
   }
}