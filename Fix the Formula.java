package raw;
import java.util.Scanner;
import java.util.ArrayList;
public class Tricky {
    
    protected static int decode(String str){
        ArrayList<Character> ca = new ArrayList(); // Operand Storage
        ArrayList<Integer> ia = new ArrayList(); // Number Storage
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '+' ||ch == '-'||ch == '/'||ch == '*'){
                ca.add(ch);
            }
            else if(ch == '0' || ch == '1'||ch == '2'||
                    ch == '3'|| ch == '4' || ch == '5'||
                    ch == '6'||ch == '7'|| ch == '8'||ch == '9'){
                int n = ch - '0';
                ia.add(n);
            } }
        int sum = ia.get(0);
        for(int i =0 ;i<ca.size();i++){
            char ch = ca.get(i);
            if(ch == '+'){
                sum+=ia.get(i+1);
            }
            else if(ch == '-'){
                sum-=ia.get(i+1);
            }
            else if(ch == '/'){
                sum/=ia.get(i+1);
            }
            else{
                sum*=ia.get(i+1);
            } }
        return sum;
    }
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        System.out.println(decode(str));
    }
}
