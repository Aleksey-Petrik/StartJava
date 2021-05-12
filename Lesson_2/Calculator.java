public class Calculator {
    public double calculate(int a, int b, char action) {
        double result = 0;
        switch(action) {
            case '+' : result = a + b; break;
            case '-' : result = a - b; break;
            case '*' : result = a * b; break;
            case '/' : result = (double) a / b; break;
            case '%' : result = a % b; break;
            case '^' : {
                result = a;
                for (int i = 1; i < b; i++) result *= a; 
                break;
            }
        }
        return result;
    }
}