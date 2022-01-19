package Chapter_11.ProgrammingExercises;

public class Ch11_Ex04_DomesticDivision extends Division
{
   protected String state;
   public Ch11_Ex04_DomesticDivision(String title, int acct, String st)
   {
      super(title, acct);
      state = st;
   }
   public void display()
   {
      System.out.println("Domestic Division: " +
        divisionTitle + "  Acct #" + acctNum +
        "\nLocated in " + state);
   }
}

