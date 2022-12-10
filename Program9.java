import java.util.*;
class Student
{
  int rollno;
  int display ()
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("Enter Rollno : ");
      rollno = in.nextInt ();
      return rollno;
  }
}
class Test extends Student
{
  int sem1_marks;
  int sem2_marks;
  int displaySem1 ()
  {
    Scanner in = new Scanner (System.in);
      System.out.print ("Enter Sem1 Marks : ");
    int sem1_marks = in.nextInt ();
      return sem1_marks;
  }
  int displaySem2 ()
  {
    Scanner in = new Scanner (System.in);
    System.out.print ("Enter Sem2 Marks : ");
    int sem2_marks = in.nextInt ();
    return sem2_marks;
  }
}

class Result extends Test implements Sports
{
  public int rollNo ()
  {
    return (display ());
  }
  public int total ()
  {
    return (displaySem1 () + displaySem2 () + score ());
  }
  public int score ()
  {
    Scanner in = new Scanner (System.in);
    System.out.print ("Enter score : ");
    int score = in.nextInt ();
    return score;
  }
}

interface Sports
{
  int score ();
}
public class Main
{
  public static void main (String[]args)
  {
    Result res = new Result ();
    int roll = res.rollNo ();
    int totalScrore = res.total ();
      System.out.println ("Roll Number : " + roll);
      System.out.println ("Total score : " + totalScrore);
  }
}
