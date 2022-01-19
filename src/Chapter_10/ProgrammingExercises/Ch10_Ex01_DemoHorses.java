package Chapter_10.ProgrammingExercises;

public class Ch10_Ex01_DemoHorses
{
    public static void main(String args[])
    {
       Ch10_Ex01_Horse ch10Ex01Horse1 = new Ch10_Ex01_Horse();
       Ch10_Ex01_RaceHorse horse2 = new Ch10_Ex01_RaceHorse();
       ch10Ex01Horse1.setName("Old Paint");
       ch10Ex01Horse1.setColor("brown");
       ch10Ex01Horse1.setBirthYear(2009);
       horse2.setName("Champion");
       horse2.setColor("black");
       horse2.setBirthYear(2011);
       horse2.setRaces(4);
       System.out.println(ch10Ex01Horse1.getName() + " is " +
          ch10Ex01Horse1.getColor() + " and was born in " + ch10Ex01Horse1.getBirthYear() + ".");
       System.out.println(horse2.getName() + " is " +
          horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
       System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");
    }
}
