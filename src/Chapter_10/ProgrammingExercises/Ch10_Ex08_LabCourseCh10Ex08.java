package Chapter_10.ProgrammingExercises;

import javax.swing.*;
public class Ch10_Ex08_LabCourseCh10Ex08 extends Ch10_Ex08_CollegeCourse
{
   private final int LABFEE = 50;
   public Ch10_Ex08_LabCourseCh10Ex08(String dept, int id, int credits)
   {
      super(dept,  id, credits);
      price = price + LABFEE;
   }
   @Override
   public void display()
   {
      JOptionPane.showMessageDialog(null,
         dept + id + "\nLab course\n" +  credits +
         " credits\nLab fee is $" + LABFEE +
         "\nTotal fee is $" + price);
   }
}
