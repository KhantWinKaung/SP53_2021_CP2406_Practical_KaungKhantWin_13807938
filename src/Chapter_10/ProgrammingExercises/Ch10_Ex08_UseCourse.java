package Chapter_10.ProgrammingExercises;

import javax.swing.*;
public class Ch10_Ex08_UseCourse
{
   public static void main(String[] args)
   {
      String dept, inStr;
      String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
      int id, credits;
      int found = 0;
      int x;
      dept = JOptionPane.showInputDialog(null, "Enter department");
      inStr = JOptionPane.showInputDialog(null, 
         "Enter course number");
      id = Integer.parseInt(inStr);
      inStr = JOptionPane.showInputDialog(null, "Enter credits");
      credits = Integer.parseInt(inStr);
      for(x = 0; x < labCourses.length; ++x)
        if(dept.equals(labCourses[x]))
          found = 1;
      if(found == 1)
      {
        Ch10_Ex08_LabCourseCh10Ex08 course = new Ch10_Ex08_LabCourseCh10Ex08(dept, id, credits);
        course.display();
      }
      else
      {
         Ch10_Ex08_CollegeCourse course = new Ch10_Ex08_CollegeCourse(dept, id, credits);
         course.display();
      }
   }
}