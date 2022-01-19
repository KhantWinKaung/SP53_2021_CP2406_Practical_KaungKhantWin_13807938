package Chapter_5.ProgrammingExercises;

public class Ch05_Ex09_Apartment
{
   int aptNumber;
   int bedrooms;
   double baths;
   double rent;
   public Ch05_Ex09_Apartment(int num, int bdrms, double bths, double rent)
   {
     aptNumber = num;
     bedrooms = bdrms;
     baths = bths;
     this.rent = rent;
   }
   public int getAptNumber()
   {
      return aptNumber;
   }
   public int getBedrooms()
   {
      return bedrooms;
   }
   public double getBaths()
   {
      return baths;
   }
   public double getRent()
   {
      return rent;
   }

}