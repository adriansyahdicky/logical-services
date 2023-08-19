package com.logical.logicalservice.service;

import com.logical.logicalservice.dto.BalancedBracketsDTO;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
public class BalancedBracketServices {

    public String isBracketBalanced(BalancedBracketsDTO balancedBracketsDTO) {
        Stack<Character> stack = new Stack<>();

        for (char ch : balancedBracketsDTO.getInput().toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return "NO";
                }

                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return "NO";
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
