package Chapter_4.ProgrammingExercises;

public class Ex04_04_TestPatient
{
   public static void main(String[] args)
   {
       Patient p1 = new Patient();
       Patient p2 = new Patient("1234", 35, "B", "+");
       Ex04_04_BloodData b2 = new Ex04_04_BloodData("A", "-");
       display(p1);
       display(p2);
       p1.setId("3456");
       p1.setAge(42);
       Ex04_04_BloodData b = new Ex04_04_BloodData("AB", "-");
       p1.setBloodData(b);
       display(p1);
   }
   public static void display(Patient p)
   {
      Ex04_04_BloodData bt = p.getBloodData();
      System.out.println("Patient #" + p.getId() + "  age: " + + p.getAge() +
         "\n   The blood is type " + bt.getBloodType() + bt.getRhFactor());
   }

}