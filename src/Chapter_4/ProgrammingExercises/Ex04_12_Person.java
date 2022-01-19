package Chapter_4.ProgrammingExercises;

import java.time.*;
public class Ex04_12_Person
{
   private String firstName;
   private String lastName;
   private LocalDate birthDate;
   public Ex04_12_Person(String first, String last, LocalDate date)
   {
      firstName = first;
      lastName = last;
      birthDate = date;
   }

   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
     return lastName;
   }
   public LocalDate getBirthDate()
   {
      return birthDate;
   }
}
