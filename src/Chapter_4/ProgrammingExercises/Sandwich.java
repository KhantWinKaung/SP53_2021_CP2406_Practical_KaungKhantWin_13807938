public class Sandwich
{
   private Ex04_05_Bread bread;
   private SandwichFilling filling;
   public Sandwich(String bread, int breadCal, String filling, int fillingCal)
   {
      this.bread = new Ex04_05_Bread(bread, breadCal);
      this.filling = new SandwichFilling(filling, fillingCal);
   }
   public Ex04_05_Bread getBread()
   {
      return bread;
   }
   public SandwichFilling getSandwichFilling()
   {
      return filling;
   }
}