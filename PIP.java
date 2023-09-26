public class PIP {

    static String evaluatePostfix(String input) {

        stack<Int> = new postfix<Int>();

        for(int i = 0; 0 < input.length(); i+2) {
            String temp = substring(i, i+1);
            if(temp.equals("+")) {

                int new = postfix.pop() + postfix.pop();
                postfix.push(new);

            } else if (temp.equals("-")) {

                if(input.susbtring(i+1,i+2).equals(" "))

                int a = postfix.pop();
                int b = postfix.pop();
                postfix.push(b-a);

            } else if (temp.equals("*")) {

                int new = postfix.pop() * postfix.pop();
                postfix.push(new);

            } else if (temp.equals("/")) {

                int a = postfix.pop();
                int b = postfix.pop();
                postfix.push(b/a);

            } else {

                int value = Integer.parseInt(temp);

            }

        }

    }

}
