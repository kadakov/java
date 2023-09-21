import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = in.nextLine();
        String line = "";
        String new_text = "";
        text.toCharArray();
        for (int i = 0; i < text.length(); ++i)
        {
            int num = (int)text.charAt(i)-(int)'a'+1;
            //System.out.println(num);
            new_text += text.charAt(i) + "  ";
            if (num > 0 && num < 27) {
                line += Integer.toString(num) + "  ";
            }
            else { // if "_" replace "__" ?
                line += text.charAt(i) + "  ";
            }

        }

        System.out.println(new_text);
        System.out.println(line);
        in.close();
    }
}