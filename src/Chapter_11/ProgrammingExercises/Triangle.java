package Chapter_11.ProgrammingExercises;

public class Triangle extends Ch11_Ex11_GeometricFigure
{
   private double area;
   public Triangle(int w, int h, String f)
   {
      super(w, h, f);
   }

   public double figureArea(int w, int h)
   {
      area = (double)(w * h * 0.5);
      return area;
   }
}
