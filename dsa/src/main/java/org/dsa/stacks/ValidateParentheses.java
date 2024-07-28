package org.dsa.stacks;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
 *
 * The input string s is valid if and only if:
 *
 * Every open bracket is closed by the same type of close bracket.
 * Open brackets are closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * Return true if s is a valid string, and false otherwise.
 * **/

public class ValidateParentheses {
    public static void main(String[] args) {
        isValid("([{}])");
    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> closeToOpen = new HashMap<>();
        ArrayList<Character> stack = new ArrayList<>();

        closeToOpen.put(')', '(');
        closeToOpen.put('}','{');
        closeToOpen.put(']','[');

        for (int i = 0; i < s.length(); i ++) {
            char currentCharacter = s.charAt(i);
            int lastIndex = stack.size() - 1;

            if (closeToOpen.containsKey(currentCharacter)) {
                if (
                        !stack.isEmpty() && stack.get(lastIndex).equals(closeToOpen.get(currentCharacter))
                ) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }

            } else {
                stack.add(currentCharacter);
            }
        }

        return stack.isEmpty();

    }
}
