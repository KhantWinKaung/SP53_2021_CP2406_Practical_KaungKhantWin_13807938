package Chapter_10.ProgrammingExercises;

import javax.swing.*;
public class Ch10_Ex08_CollegeCourse
{
   protected String dept;
   protected int id;
   protected double credits;
   protected double price;
   public Ch10_Ex08_CollegeCourse(String dep, int num, double cr)
   {
      final int FEEPERCREDIT = 120;
      dept = dep;
      id = num;
      credits = cr;
      price = cr * FEEPERCREDIT;
   }
   public void display()
   {
      JOptionPane.showMessageDialog(null,
         dept + id + "\nNon-lab course\n" +  credits +
         " credits\nTotal fee is $" + price);
   }
}