package Chapter_11.ProgrammingExercises;

public class Square extends Ch11_Ex11_GeometricFigure
{
   private double area;
   public Square(int w, int h, String f)
   {
     super(w, h, f);
   }

   public double figureArea(int w, int h)
   {
     area = (double)(w * h);
     return area;
   }
}