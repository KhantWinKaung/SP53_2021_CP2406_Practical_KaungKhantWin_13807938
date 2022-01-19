package Chapter_11.ProgrammingExercises;

public abstract class Ch11_Ex11_GeometricFigure
{
   protected int height;
   protected int width;
   protected String figure;
   public Ch11_Ex11_GeometricFigure(int h, int w, String f)
   {
      height = h;
      width = w;
      figure = f;
   }
   public int getHeight()
   {
      return height;
   }
   public int getWidth()
   {
      return width;
   }
   public String getFigure()
   {
      return figure;
   }
   public abstract double figureArea(int h, int w);
}
