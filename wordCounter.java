/**
 * wordCounter
 * v1.0.0b
 */
import java.util.Scanner;

public class wordCounter {

    public static int wordCount(String txt){    
        int count = 1;

        for(int i = 0; i < txt.length(); i++){
            if (txt.substring(i, i+1).equals(" ")){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "hello world";
        System.out.println(wordCount(text));

        scan.close();
    }
}