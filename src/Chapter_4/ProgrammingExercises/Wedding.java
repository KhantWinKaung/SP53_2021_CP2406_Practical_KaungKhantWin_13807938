import java.time.*;
public class Wedding
{
   private Ex04_12_Couple ex0412Couple;
   private LocalDate weddingDate;
   private String location;
   public Wedding(Ex04_12_Couple c, LocalDate date, String loc)
   {
      ex0412Couple = c;
      weddingDate = date;
      location = loc;
   }

   public Ex04_12_Couple getCouple()
   {
      return ex0412Couple;
   }
   public LocalDate getWeddingDate()
   {
      return weddingDate;
   }
   public String getLocation()
   {
      return location;
   }
}
