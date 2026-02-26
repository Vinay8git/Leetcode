class Solution1 {

    private void divideByTwo(StringBuilder s) {
        s.deleteCharAt(s.length() - 1);
    }

    private void addOne(StringBuilder s) {
        int i = s.length() - 1;

        // Iterating while the character is 1 and changing to 0
        while (i >= 0 && s.charAt(i) != '0') {
            s.setCharAt(i, '0');
            i--;
        }

        if (i < 0) {
            s.insert(0, '1');
        } else {
            s.setCharAt(i, '1');
        }
    }

    public int numSteps(String s) {
        StringBuilder str = new StringBuilder(s);

        int operations = 0;
        while (str.length() > 1) {
            int N = str.length();

            if (str.charAt(N - 1) == '0') {
                divideByTwo(str);
            } else {
                addOne(str);
            }

            operations++;
        }

        return operations;
    }
}



public class Solution {

    public int numSteps(String s) {
        int N = s.length();

        int operations = 0;
        int carry = 0;
        for (int i = N - 1; i > 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i)) + carry;

            if (digit % 2 == 1) {
                operations += 2;
                carry = 1;
            } else {
                operations++;
            }
        }

        return operations + carry;
    }
}