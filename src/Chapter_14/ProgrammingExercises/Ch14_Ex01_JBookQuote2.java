package Chapter_14.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch14_Ex01_JBookQuote2 extends JFrame implements ActionListener
{
   FlowLayout flow = new FlowLayout();
   JLabel msg1 = new  JLabel("To begin with,");
   JLabel msg2 = new JLabel("Marley was dead.");
   JButton button = new JButton("Click for source");
   JLabel msg3 = new JLabel("**    A Christmas Carol    **");
   public Ch14_Ex01_JBookQuote2()
   {
      super("Book Quote 2");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flow);
      add(msg1); 
      add(msg2);
      add(button);
      button.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      add(msg3);
      validate();
      repaint();
   }
   public static void main(String[] args)
   {
     Ch14_Ex01_JBookQuote2 aFrame = new Ch14_Ex01_JBookQuote2();
     aFrame.setSize(260, 150);
     aFrame.setVisible(true);
   }
}