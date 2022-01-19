public class Patient
{
   private String id;
   private int age;
   private Ex04_04_BloodData bloodData;
   public Patient()
   {
      id = "0";
      bloodData = new Ex04_04_BloodData();
   }
   public Patient(String id, int age, String bType, String rhFactor)
   {
      this.id = id;
      this.age = age;
      bloodData = new Ex04_04_BloodData(bType, rhFactor);
   }
   public String getId()
   {
      return id;
   }
   public void setId(String id)
   {
      this.id = id;
   }
   public int getAge()
   {
      return age;
   }
   public void setAge(int age)
   {
      this.age = age;
   }
   public Ex04_04_BloodData getBloodData()
   {
      return bloodData;
   }
   public void setBloodData(Ex04_04_BloodData b)
   {
      bloodData = b;
   }
}
         