package Chapter_5.ProgrammingExercises;

public class Ch05_Ex07_TestJobApplicants
{
   public static void main(String[] args)
   {
      Ch05_Ex07_JobApplicant app1 = new Ch05_Ex07_JobApplicant("Johnson", "312-345-9875",
            true, false, true, false);
      Ch05_Ex07_JobApplicant app2 = new Ch05_Ex07_JobApplicant("Kermit", "312-543-1275",
            true, false, false, false);
      Ch05_Ex07_JobApplicant app3 = new Ch05_Ex07_JobApplicant("Lawrence", "608-288-09125",
            true, false, true, true);
      Ch05_Ex07_JobApplicant app4 = new Ch05_Ex07_JobApplicant("Mitchell", "815-288-3881",
            true, true, true, true);
      String qualifiedMsg = "is qalified for an interview   ";
      String notQualifiedMsg = "is not qualified for an interview at this time   ";
      if(isQualified(app1))
         display(app1, qualifiedMsg);
      else
         display(app1, notQualifiedMsg);
      if(isQualified(app2))
         display(app2, qualifiedMsg);
      else
         display(app2, notQualifiedMsg);
      if(isQualified(app3))
         display(app3, qualifiedMsg);
      else
         display(app3, notQualifiedMsg);
      if(isQualified(app4))
         display(app4, qualifiedMsg);
      else
         display(app4, notQualifiedMsg);
   }
   public static boolean isQualified(Ch05_Ex07_JobApplicant app)
   {
      int count = 0;
      boolean isQual;
      final int MIN_SKILLS = 3;
      if(app.getHasWordSkill())
         count = count + 1;
      if(app.getHasSpreadsheetSkill())
         count = count + 1;
      if(app.getHasDatabaseSkill())
         count = count + 1;
      if(app.getHasGraphicsSkill())
         count = count + 1;
      if(count >= MIN_SKILLS)
         isQual = true;
      else
         isQual = false;
      return isQual;
   }
   public static void display(Ch05_Ex07_JobApplicant app, String msg)
   {
      System.out.println(app.getName() + " " + msg +
         "  Phone: " + app.getPhone());
   }
}