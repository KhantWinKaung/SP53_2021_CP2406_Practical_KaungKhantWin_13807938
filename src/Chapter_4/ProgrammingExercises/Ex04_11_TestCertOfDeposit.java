package Chapter_4.ProgrammingExercises;

import javax.swing.*;
import  java.time.*;
public class Ex04_11_TestCertOfDeposit
{
   public static void main(String[] args)
   {
      String certNum;
      String name;
      double balance;
      String entryString;
      int mo, da, yr;
      LocalDate issueDate;

      certNum = JOptionPane.showInputDialog(null,
        "First certificate\nEnter certificate number");
      name = JOptionPane.showInputDialog(null,
        "Enter last name of owner");
      entryString = JOptionPane.showInputDialog(null,
        "Enter balance");
      balance = Double.parseDouble(entryString);
      entryString = JOptionPane.showInputDialog(null,
        "Enter month  of issue");
      mo = Integer.parseInt(entryString);
      entryString = JOptionPane.showInputDialog(null,
         "Enter day of issue");
      da = Integer.parseInt(entryString);
      entryString = JOptionPane.showInputDialog(null,
        "Enter year of issue");
      yr = Integer.parseInt(entryString);
      issueDate = LocalDate.of(yr, mo, da);
      Ex04_11_CertOfDeposit cert1 = new Ex04_11_CertOfDeposit(certNum, name, balance, issueDate);
      
      certNum = JOptionPane.showInputDialog(null,
        "Second certificate\nEnter certificate number");
      name = JOptionPane.showInputDialog(null,
        "Enter last name of owner");
      entryString = JOptionPane.showInputDialog(null,
        "Enter balance");
      balance = Double.parseDouble(entryString);
      entryString = JOptionPane.showInputDialog(null,
        "Enter month  of issue");
      mo = Integer.parseInt(entryString);
      entryString = JOptionPane.showInputDialog(null,
         "Enter day of issue");
      da = Integer.parseInt(entryString);
      entryString = JOptionPane.showInputDialog(null,
        "Enter year of issue");
      yr = Integer.parseInt(entryString);
      issueDate = LocalDate.of(yr, mo, da);
      Ex04_11_CertOfDeposit cert2 = new Ex04_11_CertOfDeposit(certNum, name, balance, issueDate);
 

      display(cert1);
      display(cert2);
   }
   public static void display(Ex04_11_CertOfDeposit cd)
   {
      JOptionPane.showMessageDialog(null,"Certificate " +
         cd.getCertNum() + "\nName: " + cd.getName() +  " " +
         "  Balance: $" + cd.getBalance() +
         "\nIssued: " + cd.getIssueDate() +
         "\nMaturity date is " + cd.getMaturityDate());
   }
}