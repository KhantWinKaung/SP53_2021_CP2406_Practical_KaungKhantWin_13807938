package Chapter_11.DebuggingExercises;

import Chapter_11.DebuggingExercises.FixDebugBoat;

public class FixDebugOceanLiner extends FixDebugBoat
{
   public FixDebugOceanLiner()
   {
      super("ocean liner ");
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void setPower()
   {
      super.power = "four engines";
   }
}
