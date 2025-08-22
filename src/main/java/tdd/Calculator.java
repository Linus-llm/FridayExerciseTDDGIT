package tdd;

public class Calculator {
    public int add(int a, int b) {
        return a+b;
    }
    public int add(String x, String y, String z){
        return Integer.parseInt(x)+Integer.parseInt(y)+Integer.parseInt(z);
    }
    public int add(int[] x){
        int result = 0;
        for(int i:x){
            result+=i;
        }
        return result;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}
