package methods;

public class CheckerLength {
    public static String CheckLen(String a, String b) {
        if (a.equals(b)) return a;
        if (a.length()>b.length()) {return  a;} else return b;
    }
}
