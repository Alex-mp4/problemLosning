import javax.swing.*;

public class palindromChecker {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Ett ord:");
        System.out.println(s);
        String r = reverse(s);
        System.out.println(r);
        String p = palindrome(s, r);
        if (p.equals("Ja")) {
            System.out.println("Det är en palindrom");
        }
        else {
            System.out.println("Inte en palindrom");
        }
    }

    public static String reverse(String s) {
        char c;
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            t = c + t;
        }
        return t;
    }

    private static String palindrome(String s, String r) {
        String j = "Ja";
        String n = "Nej";
        boolean tof = false;

        for (double i = 0; i < s.length(); i++) {
            if (i == s.length()) {
                i = Math.floor(i/2);
                for (int o = 0; o < i; o++) {
                    if (s.charAt(o) == r.charAt(o)) {
                        tof = true;
                    }
                }
            }
        }

        if (tof) {
            return j;
        }
        else {
            return n;
        }
    }
}
