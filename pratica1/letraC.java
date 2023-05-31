public class letraC {
    public static void main(String[] args) {
        String str1 = "abceiobisiuv";
        int contador = 0;
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                contador++;
            }
            System.out.println(contador);
        }
    }