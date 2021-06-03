import java.util.Scanner;

public class main {
    public static void main (String args[]) {
        int MyAge = 12;
        String MyName = "Kostas Zafolias";
        char MyChar = 'K'; //useless var
        String MyLanguage = "I know HTML and CSS , Javascript , Java , Python , GO and SQL";        
        //variables 
        Scanner myObj = new Scanner(System.in);
    System.out.println("Hello, My name is Kostas and this is my portfolio!");
    System.out.println("Are you ready?");
    String Ready = myObj.nextLine();
    if (Ready.equals("yes")) {
        System.out.println ("Hi, I am Kostas and I am an 12 year old and I am programming from December 2020.");
        System.out.println("I know HTML and CSS , Javascript , Java , Python , GO and SQL");
        System.out.println("I have been offered a job from Semrush");
    } // end of 
    else {
        System.out.println ("oh well");
    } 
    }
    }
