import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int monthNum = Integer.parseInt(in.nextLine());
    String monthName = "";
    int monthDayNum = -1;
    switch(monthNum) {
      case 1: monthName = "January"; break;
      case 2: monthName = "February"; break;
      case 3: monthName = "March"; break;
      case 4: monthName = "April"; break;
      case 5: monthName = "May"; break;
      case 6: monthName = "June"; break;
      case 7: monthName = "July"; break;
      case 8: monthName = "August"; break;
      case 9: monthName = "September"; break;
      case 10: monthName = "October"; break;
      case 11: monthName = "November"; break;
      case 12: monthName = "December"; break;
    } switch(monthName) {
      case "January": monthDayNum = 31; break;
      case "February": monthDayNum = 28; break;
      case "March": monthDayNum = 31; break;
      case "April": monthDayNum = 30; break;
      case "May": monthDayNum = 31; break;
      case "June": monthDayNum = 30; break;
      case "July": monthDayNum = 31; break;
      case "August": monthDayNum = 31; break;
      case "September": monthDayNum = 30; break;
      case "October": monthDayNum = 31; break;
      case "November": monthDayNum = 30; break;
      case "December": monthDayNum = 31; break;
    }
    System.out.println(monthName + " - " + monthDayNum + " days");
  }
}