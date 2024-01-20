public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(capVowelsLowRest("Hello World"));
        System.out.println(camelCase("   HElLo World"));
        println(allIndexOf("MMMM", 'M'));
    }

    public static String capVowelsLowRest (String string) {
        String fix = "";
        for(int i = 0; i < string.length() ; i ++){
            // #feedback: why do you need to call charAt method such many times? store it in a variable instead!
            char currentChar = string.charAt(i);
            // #feedback: always use {} to scope the body of the condition - even when there is only one line of code
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'o' || currentChar == 'u' || currentChar == 'i') {
                fix += (char)(currentChar - 32) ;
            // #feedback: try avoid nest another conditions within else, usualy it can be merged
            } else if(currentChar == 'A' || currentChar == 'E' || currentChar == 'O' || currentChar == 'U' || currentChar == 'I') {
                fix += currentChar;
            } else if(currentChar > 64 && scurrentChar < 91) {
                fix += (char)(currentChar + 32);
            } else {
            // #feedback: space case covered here :)
                fix += currentChar;
            }
        }
        
        return fix;
    }

    public static String camelCase (String string) {
        String fix = "";
        for(int i = 0 ; i < string.length() ; i ++){
            // #feedback: avoid multiple calculation of same value - store it in variable
            char currentChar = string.charAt(i);
            if(currentChar != ' '){
                if(currentChar > 64 && currentChar < 91) {
                    fix += (char)(currentChar + 32);
                } else {
                    fix += currentChar;
                }
            }
            else{
                char nextChar = string.charAt(i+1);
                if(nextChar != ' ' && fix != ""){
                    if((int)(nextChar) > 96 && (int)(nextChar) < 122) {
                        fix += (char)(nextChar - 32);
                    } else {
                        fix += nextChar;
                    }
                    // #feedback: it's not common to change i beside the loop definition - maybe you could create a flag here to guide next itteration instead...
                    i++;
                }
            }
        }
        return fix;
    }

    public static int[] allIndexOf (String string, char chr) {
        // #feedback: `count` can be better name here
        int count = 0;
        for(int i = 0 ; i < string.length() ; i++){
            if(chr == string.charAt(i))
                count++;
        }
        int[] arr = new int[count];
        int k = 0;
        for(int j = 0 ; j < string.length(); j++){
            if(string.charAt(j) == chr){
                arr[k] = j;
                k++;
            }

        }
        return arr;
    }
    public static void println(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
