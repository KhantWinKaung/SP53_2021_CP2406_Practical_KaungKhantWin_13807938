package Chapter_9.ProgrammingExercises;

import java.util.Scanner;
public class Ch09_Ex07_SortPurchasesArray
{
   public static void main(String[] args)
   {
      Ch09_Ex07_Purchase[] ch09Ex07Purchases = new Ch09_Ex07_Purchase[6];
      int i;
      String message;
      char choice;
      final char QUIT = 'Z';
      int number;
      double price;
      Scanner keyboard = new Scanner(System.in);
      for(i = 0; i < ch09Ex07Purchases.length; ++i)
      {
         System.out.print("Enter invoice number >> ");
         number = keyboard.nextInt();
         System.out.print("Enter sale amount >> ");
         price = keyboard.nextDouble();
         ch09Ex07Purchases[i] = new Ch09_Ex07_Purchase();
         ch09Ex07Purchases[i].setInvoiceNumber(number);
         ch09Ex07Purchases[i].setSaleAmount(price);
      }
      keyboard.nextLine();
      System.out.print("\nSort Purchases by (I)nvoice number, or (S)ale amount? ");
      choice = keyboard.nextLine().charAt(0);
      while(choice != QUIT)
      {
         if(choice == 'I')
         {
             sortByInvoice(ch09Ex07Purchases);
             message = "\nSorted by invoice number\n"; 
             display(ch09Ex07Purchases, message);
         }
         else
           if(choice == 'S')
           {
              sortBySaleAmount(ch09Ex07Purchases);
              message = "\nSorted by sale amount\n";
              display(ch09Ex07Purchases, message);
           }
           else
              System.out.println("Invalid choice");
        System.out.println("\nSort Purchases by (I)nvoice number, or (S)ale amount?");
        System.out.print("      or enter " + QUIT + " to quit >> "  );
        choice = keyboard.nextLine().charAt(0);
      }
   }
   public static void sortBySaleAmount(Ch09_Ex07_Purchase[] array)
   {
      int a, b;
      Ch09_Ex07_Purchase temp;
      int highSub = array.length - 1;
      for (a = 0; a < highSub; ++a)
      {
         for (b = 0; b < highSub; ++b)
         if(array[b].getSaleAmount() > array[b + 1].getSaleAmount())
         {
            temp = array[b];
            array[b] = array[b + 1];
            array[b + 1] = temp;
          }
        }
    }
    public static void sortByInvoice(Ch09_Ex07_Purchase[] array)
    {
        int a, b;
        Ch09_Ex07_Purchase temp;
        int highSub = array.length - 1;
        for (a = 0; a < highSub; ++a)
        {
           for (b = 0; b < highSub; ++b)
           if (array[b].getInvoiceNumber() > array[b + 1].getInvoiceNumber())
           {
              temp = array[b];
              array[b] = array[b + 1];
              array[b + 1] = temp;
           }
        }
     }
     public static void display(Ch09_Ex07_Purchase[] p, String msg)
     {
        System.out.println(msg);
        for (int i = 0; i < p.length; i++)
           p[i].display();
     }
}
