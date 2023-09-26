import java.util.*;
public class PIP {

    static String evaluatePostfix(String input) {

        Stack<Integer> postfix = new Stack<>();

        for (int i = 0; i < input.length(); i ++) {

            String temp = input.substring(i, i + 1);

            int size = postfix.size();

            if(temp.equals(" ")) {

            } else if (temp.equals("+")) {

//                if (size < 2) {
//                    throw new IllegalArgumentException();
//                }

                int newValue = postfix.pop() + postfix.pop();

                postfix.push(newValue);

            } else if (temp.equals("-")) {

//                if (size < 2) {
//                    throw new IllegalArgumentException();
//                }

//                if (input.substring(i + 1, i + 2).equals(" ")) {
                    int a = postfix.pop();
                    int b = postfix.pop();
                    postfix.push(b - a);

               // }

                int value = Integer.parseInt(input.substring(i + 1, i + 2));

                postfix.push(value);

                i++;

            } else if (temp.equals("*")) {

//                if (size < 2) {
//                    throw new IllegalArgumentException();
//                }

                int newValue = postfix.pop() * postfix.pop();
                postfix.push(newValue);


            } else if (temp.equals("/")) {

//                if (size < 2) {
//                    throw new IllegalArgumentException();
//                }

                int a = postfix.pop();
                int b = postfix.pop();

                postfix.push(b / a);

            } else {

//                try {
//                    Integer.parseInt(temp);
//                } catch (NumberFormatException nfe) {
//                    System.out.print("Please only use numbers and operators!");
//                }

                int value = Integer.parseInt(temp);
                postfix.push(value);

            }

        }

//        if (postfix.size() != 1) {
//
//            throw new IllegalArgumentException();
//
//        }

        return String.valueOf(postfix.pop());

    }

}
