package Chapter_11.ProgrammingExercises;

public class Ch11_Ex14_CreateBuildings
{
   public static void main(String[] args)
   {
      Ch11_Ex14_Building aCh11Ex14Building = new Ch11_Ex14_Building();
      House aHouse = new House();
      School aSchool = new School();
      aCh11Ex14Building.setSqFeet(10000);
      aCh11Ex14Building.setStories(1);
      aHouse.setSqFeet(1800);
      aHouse.setStories(2);
      aHouse.setBedrooms(3);
      aHouse.setBaths(2);  
      aSchool.setSqFeet(3500);
      aSchool.setStories(3);
      aSchool.setClassrooms(48);
      aSchool.setGradeLevel("High");
      System.out.println("The Buliding:\n" + 
         aCh11Ex14Building.getSqFeet() + " square feet\n" +
         aCh11Ex14Building.getStories() + " stories\n");
      System.out.println("\nThe House:\n" +
         aHouse.getSqFeet() + " square feet\n" +
         aHouse.getStories() + " stories\n" +
         aHouse.getBedrooms() + " bedrooms and " +
         aHouse.getBaths() + " bathrooms\n");
      System.out.println("\nThe School:\n" +
         aSchool.getSqFeet() + " square feet\n" +
         aSchool.getStories() + " stories\n" +
         aSchool.getClassrooms() + " classrooms. It's a " +
         aSchool.getGradeLevel() + " school\n"); 
   }
}
   
