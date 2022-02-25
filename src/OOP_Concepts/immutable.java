package OOP_Concepts;

public class immutable {
    public static void main(String[] args) {
        String a = "Ertuğrul";
        a = a.substring(5);
        System.out.println(a);

        StringBuilder n = new StringBuilder(a);
        n.reverse();
        System.out.println(n);

    }}
