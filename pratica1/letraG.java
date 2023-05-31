public class letraG {
    public static void main(String[] args) {
        String str1 = "ana";
        if(isPalindrome(str1)){
            System.out.println("é palíndromo!");
        }else{
            System.out.println("não é um palíndromo.");
        }
    }
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}



