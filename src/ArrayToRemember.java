import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToRemember {
    public static void main(String[] args) {
        ArrayList<String> presidents = new ArrayList<String>();
        presidents.add("Kennedy");
        presidents.add("Johnson");
        presidents.add("Nixon");
        presidents.add("Ford");
        presidents.add("Carter");
        presidents.add("Reagan");
        presidents.add("Bush");
        presidents.add("Clinton");
        presidents.add("W.Bush");
        presidents.add("Obama");

        //print this ArrayList
        System.out.println(presidents);

        System.out.println();

        /*
        //print this ArrayList another way
        for (int i = 0; i < presidents.size(); i++) {
            System.out.println(presidents.get(i));
        }
        */

        //enter the word history. Your program should display their names starting with the most recent.
        Scanner keybd = new Scanner(System.in);
        System.out.println("Please enter the word history: " );
        String forArrList;

        forArrList = keybd.nextLine();
        //System.out.println("forArrList = " + forArrList);

        if (forArrList.equals("history")) {
            //print this reversed ArrayList
            System.out.println();
            //System.out.println("forArrList = " + forArrList);
            for (int i = presidents.size() - 1; i > 0; i--) {
                //for (int i = 9; i > 0; i--) { //another way for loop
                System.out.println(presidents.get(i));
            }
        }
        else {
            System.out.println("Please enter the word 'history' to get result." );
        }
    }
}
