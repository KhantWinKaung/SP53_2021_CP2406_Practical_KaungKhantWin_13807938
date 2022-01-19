package Chapter_5.ProgrammingExercises;

public class Ch05_Ex08_TestAutomobiles
{
   public static void main(String[] args)
   {
      Ch05_Ex08_Automobile auto1 = new Ch05_Ex08_Automobile(1451, "Chevrolet", "Camaro", "red", 2010, 24.5);
      Ch05_Ex08_Automobile auto2 = new Ch05_Ex08_Automobile(145188, "Ford", "Focus", "white", 2019, 75);
      display(auto1, "good declaration");
      display(auto2, "bad declaration");
      auto1.setId(-3);
      display(auto1, "bad ID");
      auto1.setId(2222);
      display(auto1, "good ID");
      auto1.setMake("Toyota");
      auto1.setModel("Corolla");
      display(auto1, "chnage make and model");
      auto2.setId(8686);
      auto2.setColor("blue");
      auto2.setYear(2016);
      display(auto2, "change ID, color, and year");
      auto2.setMpg(4);
      display(auto2, "bad mpg");
      auto2.setMpg(30);
      display(auto2, "good mpg");
   }
   public static void display(Ch05_Ex08_Automobile auto, String msg)
   {
      System.out.println(msg + "    " + auto.getId() +
         " " + auto.getMake() + " " + auto.getModel() +
         " " + auto.getColor() + " " +
        auto.getYear() + " " + auto.getMpg() + " miles per gallon");
   }
}  