package Chapter_4.ProgrammingExercises;

class Ex04_06_TestCircle
{
  public static void main (String args[])
  {
      Ex04_06_Circle a = new Ex04_06_Circle();
      Ex04_06_Circle b = new Ex04_06_Circle();
      Ex04_06_Circle c = new Ex04_06_Circle();

      a.setRadius(1.5);
      b.setRadius(1500.50);

      System.out.println("The area of a is " +
          a.getArea());
      System.out.println("The diameter of a is " +
          a.getDiameter());
      System.out.println("The area of b is "      +
          b.getArea());
      System.out.println("The diameter of b is " +
          b.getDiameter());
      System.out.println("The area of c is " +
          c.getArea());
      System.out.println("The diameter of c is " +
          c.getDiameter());
  }
}


