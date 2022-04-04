import javax.swing.*;

public class reverseString {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Ett ord:");
        System.out.println(s);
        String r = reverse(s);
        System.out.println(r);
        String t = reverse2(s);
        System.out.println(t);
    }

    private static String reverse2(String s) {
        return reverse(s);
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


}
