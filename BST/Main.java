import java.util.*;

public class Main {
    public static String processString(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) { 
            st.push(s.charAt(i));
        }
        sb1.append(st.peek());
        st.pop();
        int i = 0;

        while (!st.isEmpty()) {
            if (i < sb1.length() && sb1.charAt(i) == st.peek()) {
                sb2.append(st.peek());
                st.pop();
            } else {
                sb1.append(st.peek());
                st.pop();
            }
        }

        sb1.reverse();
        i = 0;
        int j = 0;

        while (i < sb1.length() && j < sb2.length()) {
            if (sb1.charAt(i) == sb2.charAt(j)) {
                j++;
            } else {
                sb1.append(sb2.charAt(j)); 
                i++;
            }
        }

       if(sb1.length()!=s.length()) return "";

        return sb1.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        String result = processString(s);
        System.out.println("Result: " + result);
    }
}
