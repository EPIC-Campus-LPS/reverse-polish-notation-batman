public class PIP {

    static String evaluatePostfix(String input) {

        stack<Int> = new postfix<Int>();

        for(int i = 0; 0 < input.length(); i+2) {
            String temp = substring(i, i+1);
            int size = postfix.size;
            if(temp.equals("+")) {

                int new = postfix.pop() + postfix.pop();
                postfix.push(new);
                if (size < 2){
                    throw new IllegalArgumentException;
                }

            } else if (temp.equals("-")) {

                if(input.susbtring(i+1,i+2).equals(" ")){
                    int a = postfix.pop();
                    int b = postfix.pop();
                    postfix.push(b-a);
                    f (size < 2){
                        throw new IllegalArgumentException;

                    }
                }
                int value = Integer.parseInt(input.susbtring(i+1,i+2));
                postfix.push(value);
                i++;

            } else if (temp.equals("*")) {

                int new = postfix.pop() * postfix.pop();
                postfix.push(new);
                f (size < 2){
                    throw new IllegalArgumentException;
                }

            } else if (temp.equals("/")) {

                int a = postfix.pop();
                int b = postfix.pop();
                postfix.push(b/a);

                f (size < 2){
                    throw new IllegalArgumentException;

            } else {
                try{Integer.parseInt;
                } catch (NumberFormatException nfe){
                    System.out.print ("Please only use numbers and operators!");
                }
                int value = Integer.parseInt(temp);

            }

        }
    if(postfix.size != 1){
        throw new IllegalArgumentException;
        }
    return postfix.push();
    }

}
