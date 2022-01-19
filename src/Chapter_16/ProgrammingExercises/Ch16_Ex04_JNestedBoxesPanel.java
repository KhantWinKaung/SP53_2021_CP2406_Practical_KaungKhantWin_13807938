package Chapter_16.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
public class Ch16_Ex04_JNestedBoxesPanel extends JPanel
{
   int count;
   final int NUMBOXES = 8;
   final int INC = 20;
   int x;
   int y;
   int width, height;
   @Override
   public void paintComponent(Graphics gr)
   {
      super.paintComponent(gr);
      width = 300;
      height = 300;
      x = 20;
      y = 20;
      for(count = 0; count < NUMBOXES; ++count)
      {
         gr.drawRect(x, y, width, height);
         x += INC; 
         y += INC;
         width -= INC * 2;
         height -= INC * 2;
      }     
   }
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.add(new Ch16_Ex04_JNestedBoxesPanel());
      frame.setSize(360, 380);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}
