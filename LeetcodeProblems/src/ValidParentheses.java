import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> closingOf = new HashMap<Character, Character>();
        closingOf.put('{', '}');
        closingOf.put('[', ']');
        closingOf.put('(', ')');

        Stack<Character> stk = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {

            if (closingOf.containsValue(s.charAt(i))) {

                if (stk.isEmpty()) return false;
                else {
                    if (s.charAt(i) == closingOf.get(stk.peek())) {
                        stk.pop();
                    }
                    else {
                        return false;
                    }
                }
            }

        if (closingOf.containsKey(s.charAt(i))) {
            stk.push(s.charAt(i));
        }
    }

        return stk.isEmpty();
    }
}
