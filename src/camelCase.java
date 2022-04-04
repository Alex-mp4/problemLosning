import javax.swing.*;

public class camelCase {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("En mening:");
        System.out.println(s);
        String camel = camelCas(s);
        System.out.println(camel);
    }

    private static String camelCas(String s) {
        String c = "";
        char v;
        for (int i = 0; i < s.length(); i++) {
            v = s.charAt(i);
            if (v == ' ') {
                //s = s.replace(" ", "");
                s = s.substring(0,i)+""+s.substring(i+1);
                v = s.charAt(i);
                char b = Character.toUpperCase(v);
                //s = s.replace(s.charAt(i), b);
                s = s.substring(0,i)+b+s.substring(i+1);
            }
        }
        c = s;
        return c;
    }
}
