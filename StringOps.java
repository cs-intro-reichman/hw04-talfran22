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
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'i')
                fix += (char)(string.charAt(i) - 32) ;
            else{
                if(string.charAt(i) == ' ')
                    fix += ' ';
                else{
                if(string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'O' || string.charAt(i) == 'U' || string.charAt(i) == 'I')
                  fix += string.charAt(i);
                else{
                    if(string.charAt(i) > 64 && string.charAt(i) < 91)
                       fix += (char)(string.charAt(i) + 32);
                    else
                       fix += string.charAt(i);
                    }
                }
            }
        }
        return fix;
    }

    public static String camelCase (String string) {
        String fix = "";
        for(int i = 0 ; i < string.length() ; i ++){
            if(string.charAt(i) != ' '){
                if(string.charAt(i) > 64 && string.charAt(i) < 91)
                    fix += (char)(string.charAt(i) + 32);
                else{
                    fix += string.charAt(i);
                }
            }
            else{
                if(string.charAt(i+1) != ' ' && fix != ""){
                    if((int)(string.charAt(i+1)) > 96 && (int)(string.charAt(i+1)) < 122)
                        fix += (char)(string.charAt(i+1) - 32);
                    else{
                        fix += string.charAt(i+1);
                    }
                    
                    i++;
                }
            }
        }
        return fix;
    }

    public static int[] allIndexOf (String string, char chr) {
        int sum = 0;
        for(int i = 0 ; i < string.length() ; i++){
            if(chr == string.charAt(i))
                sum++;
        }
        int[] arr = new int[sum];
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
