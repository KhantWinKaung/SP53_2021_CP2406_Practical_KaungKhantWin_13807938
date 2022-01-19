public class Ex04_12_Couple
{
   private Ex04_12_Person bride;
   private Ex04_12_Person groom;
   public Ex04_12_Couple(Ex04_12_Person br, Ex04_12_Person gr)
   {
      bride = br;
      groom = gr;
   }

   public Ex04_12_Person getBride()
   {
      return bride;
   }
   public Ex04_12_Person getGroom()
   {
     return groom;
   }
}
