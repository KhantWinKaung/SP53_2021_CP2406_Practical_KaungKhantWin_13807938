package Chapter_11.ProgrammingExercises;

public abstract class Ch11_Ex04_UseDivision
{
   public static void main(String[] args)
   {
      Ch11_Ex04_DomesticDivision abcDomDiv = new
              Ch11_Ex04_DomesticDivision("Sales", 123, "California");
      Ch11_Ex04_DomesticDivision xyzDomDiv = new
              Ch11_Ex04_DomesticDivision("Technology", 234, "Kansas");
      Ch11_Ex04_InternationalDivision abcIntDiv = new
              Ch11_Ex04_InternationalDivision("Technology", 345, "Germany", "German");
      Ch11_Ex04_InternationalDivision xyzIntDiv = new
              Ch11_Ex04_InternationalDivision("Marketing", 456, "Japan",
         "Japanese");
      abcDomDiv.display();
      xyzDomDiv.display();
      abcIntDiv.display();
      xyzIntDiv.display();
   }
}

