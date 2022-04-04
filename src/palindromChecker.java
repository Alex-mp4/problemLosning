import javax.swing.*;

public class palindromChecker {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Ett ord:");
        System.out.println(s);
        String p = palindrome(s);
        if (p == "Ja") {
            System.out.println("Det är en palindrom");
        }
        else {
            System.out.println("Inte en palindrom");
        }
    }

    private static String palindrome(String s) {
    }
}
