public class Calculator{
    public static void main(String[] args){
        int a = 9, b = 3;
        double result = 0d;
        char action = '/';
        if (action == '+') result = a + b; 
        if (action == '-') result = a - b;
        if (action == '*') result = a * b;
        if (action == '/') result = (double)(a) / b;
        if (action == '%') result = a % b;
        if (action == '^') {
            result = a;
            for(int i = 1; i < b; i++) result *= a;
        }
        System.out.println(a + " " + action + " " + b + " = " + result);
    }
}