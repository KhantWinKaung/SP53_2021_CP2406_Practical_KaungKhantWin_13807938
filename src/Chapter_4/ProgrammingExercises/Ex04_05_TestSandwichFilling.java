public class Ex04_05_TestSandwichFilling
{
   public static void main(String[] args)
   {
      Ex04_05_SandwichFilling sf1 = new Ex04_05_SandwichFilling("egg salad", 220);
      Ex04_05_SandwichFilling sf2 = new Ex04_05_SandwichFilling("ham", 240);
      Ex04_05_SandwichFilling sf3 = new Ex04_05_SandwichFilling("peanut butter", 280);
      display(sf1);
      display(sf2);
      display(sf3);
   }
   public static void display(Ex04_05_SandwichFilling s)
   {
      System.out.println("The " + s.getSandwichFilling() + " filling has " +
         s.getCalories() + " calories");
   }
}
