class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        char[] arr = s.toCharArray();

        int max = s.length();

        for (int i = 0; i < max; i++) {
            if (arr[i] == '{') {
                stack.push('{');
            }
            else if (arr[i] == '(') {
                stack.push('(');
            }
            else if (arr[i] == '[') {
                stack.push('[');
            }

            else if (stack.isEmpty()) {
                return false;
            }

            //checks closing 
            else if (arr[i] == ')') {
                if (stack.pop() != '(') {
                    return false;
                }
            }
            else if (arr[i] == ']') {
                if (stack.pop() != '[') {
                    return false;
                }
            }
            else if (arr[i] == '}') {
                if (stack.pop() != '{') {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }

        return false;
    }
    
}