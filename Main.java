import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println( "Enter the number of credits ");
    String credits = scan.nextLine();
    System.out.println( " Enter your grade ");
    String grade= scan.nextLine();
    int grade_points=0;

   
  
  switch (grade) {
       case "A":
      grade_points=4;
        break;
      case "B":
      grade_points=3;
        break;
      case "C":
      grade_points=2;
        break;
      case "D":
      grade_points=1;
        break;
      case "F":
      grade_points=0;
        break;
  



  
}
    int points = grade_points * Integer.parseInt(credits);

    int gpa= points/Integer.parseInt(credits);

    System.out.println(" Credits: " + credits);
    System.out.println(" grade: " + grade);
    System.out.println(" points: " + points);
    System.out.println(" GPA: " + gpa);



}}

