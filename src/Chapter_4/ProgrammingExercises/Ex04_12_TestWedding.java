import java.time.*;
public class Ex04_12_TestWedding
{
   public static void main(String[] args)
   {
      LocalDate date1 = LocalDate.of(1986, 12, 14);
      LocalDate date2 = LocalDate.of(1984, 3, 8);
      LocalDate date3 = LocalDate.of(1991, 4, 17);
      LocalDate date4 = LocalDate.of(1992, 2, 14);
      LocalDate date5 = LocalDate.of(2016, 6, 18);
      LocalDate date6 = LocalDate.of(2016, 6, 25); 
      Person bride1 = new Person("Kimberly", "Hanson", date1);
      Person groom1 = new Person("Mark", "Ziller", date2); 
      Person bride2 = new Person("Janna", "Howard", date3);
      Person groom2 = new Person("Julius", "Nemo", date4);
      Ex04_12_Couple ex0412Couple1 = new Ex04_12_Couple(bride1, groom1);
      Ex04_12_Couple ex0412Couple2 = new Ex04_12_Couple(bride2, groom2);
      Wedding wedding1 = new Wedding(ex0412Couple1, date5, "Mayfair Country Club");
      Wedding wedding2 = new Wedding(ex0412Couple2, date6, "Oceanview Park");
      displayWeddingDetails(wedding1);
      displayWeddingDetails(wedding2);
   }
   public static void displayWeddingDetails(Wedding w)
   {
      Ex04_12_Couple ex0412Couple = w.getCouple();
      LocalDate weddingDate = w.getWeddingDate();
      String location = w.getLocation();
      Person bride = ex0412Couple.getBride();
      Person groom = ex0412Couple.getGroom();
      String firstBride = bride.getFirstName();
      String lastBride = bride.getLastName();
      LocalDate brideBDate = bride.getBirthDate();
      String firstGroom = groom.getFirstName();
      String lastGroom = groom.getLastName();
      LocalDate groomBDate = groom.getBirthDate();
      System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
      System.out.println("Date: " + weddingDate + "   Location: " +
            location);
      System.out.println("Bride: " + firstBride +
         " " + lastBride + " " + brideBDate);
      System.out.println("Groom: " + firstGroom +
         " " + lastGroom + " " + groomBDate);
   }
}