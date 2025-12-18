/**********************
* RosterTester.java
* statement coverage test
* @author Tammy Pirmann
* @version 20210430
**************************/
public class RosterTester{
    public static void main(String[] args){
      //create a roster with no args
      Roster jav = new Roster();
      //create a roster with args
      Roster fds = new Roster("Freshman Design", "CI10X", 400);
     
      //use setters
      jav.setCourseName("Intro to Programming with Java");
      jav.setCourseId("CS501");
     
      //use getters
      System.out.println(jav.getCourseName());
      System.out.println(jav.getCourseId());
      System.out.println(jav.getStudents());
      System.out.println(fds.getCourseName());
      System.out.println(fds.getCourseId());
      System.out.println(fds.getStudents());
     
      //use toString
      System.out.println(jav);
      System.out.println(fds);
    }
  }
 