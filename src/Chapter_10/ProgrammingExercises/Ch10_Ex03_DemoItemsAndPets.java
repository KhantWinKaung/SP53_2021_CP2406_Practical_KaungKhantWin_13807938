package Chapter_10.ProgrammingExercises;

public class Ch10_Ex03_DemoItemsAndPets
{
   public static void main(String[] args)
   {
      Ch10_Ex03_ItemSold item1 = new Ch10_Ex03_ItemSold();
      Ch10_Ex03_ItemSold item2 = new Ch10_Ex03_ItemSold();
      Ch10_Ex03_PetSold pet1 = new Ch10_Ex03_PetSold();
      Ch10_Ex03_PetSold pet2 = new Ch10_Ex03_PetSold();
      item1.setInvoiceNumber(1111);
      item1.setDescription("30 gallon aquariam");
      item1.setPrice(39.99);
      item2.setInvoiceNumber(2222);
      item2.setDescription("hamster wheel");
      item2.setPrice(8.99);
      pet1.setInvoiceNumber(3333);
      pet1.setDescription("Standard poodle");
      pet1.setPrice(639.99);
      pet1.setIsVaccinated(true);
      pet1.setIsNeutered(true);
      pet1.setIsHousebroken(false);
      pet2.setInvoiceNumber(4444);
      pet2.setDescription("Siamese cat");
      pet2.setPrice(129.99);
      pet2.setIsVaccinated(true);
      pet2.setIsNeutered(false);
      pet2.setIsHousebroken(true);
      display(item1);
      display(item2);
      display(pet1);
      displayPetData(pet1);
      display(pet2);
      displayPetData(pet2);
   }
   public static void display(Ch10_Ex03_ItemSold item)
   {
      System.out.println("Invoice #" + item.getInvoiceNumber());
      System.out.println("     Description: " + item.getDescription());
      System.out.println("     Price: $" + item.getPrice());
   }
   public static void displayPetData(Ch10_Ex03_PetSold item)
   {
      System.out.println("     Vaccinated is " + item.getIsVaccinated());
      System.out.println("     Neutered is " + item.getIsNeutered());
      System.out.println("     Housebroken is " + item.getIsHousebroken());
   }
}