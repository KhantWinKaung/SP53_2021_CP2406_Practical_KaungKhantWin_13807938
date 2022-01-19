class Ex04_06_Circle
{
   private double radius;
   private double area;
   private double diameter;
   Ex04_06_Circle()
   {
      radius = 1;
      computeDiameter();
      computeArea();
   }
   public void setRadius(double r)
   {
      radius = r;
      computeDiameter();
      computeArea();
   }
   public double getRadius()
   {
      return radius;
   }
   private void computeDiameter()
   {
      final int DIAMETER_FACTOR = 2;
      diameter =  radius * DIAMETER_FACTOR;
   }
   private void computeArea()
   {
      area = (radius * radius) * Math.PI;
   }
   public double getDiameter()
   {
      return diameter;
   }
   public double getArea()
   {
      return area;
   }
}
