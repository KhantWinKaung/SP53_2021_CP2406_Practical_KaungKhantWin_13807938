package Chapter_11.ProgrammingExercises;
public class House extends Ch11_Ex14_Building
{
   protected int bedrooms;
   protected int baths;
   public void setBedrooms(int rooms)
   {
      bedrooms = rooms;
   }
   public void setBaths(int rooms)
   {
      baths = rooms;
   }
   public int getBedrooms()
   {
      return bedrooms;
   }
   public int getBaths()
   {
      return baths;
   }
}
