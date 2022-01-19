package Chapter_11.ProgrammingExercises;

public class Ch11_Ex04_InternationalDivision extends Division
{
   protected String country;
   protected String language;
   public Ch11_Ex04_InternationalDivision(String title, int acct, String cty, String lang)
   {
      super(title, acct);
      country = cty;
      language = lang;
   }
   public void display()
   {
      System.out.println("International Division: " + divisionTitle +
         "  Acct #" + acctNum + "\nLocated in " + country +
         " Language is " + language);
   }
}

