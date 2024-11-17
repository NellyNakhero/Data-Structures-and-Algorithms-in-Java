public  class Main  {
    public static void main(String[] args) {
        System.out.println("Hello DSA");

        //O(n) = 1
        int constantRunTimeComplexityArgs = 2;
        constantRunTimeComplexity(constantRunTimeComplexityArgs);

        //0(n) = log n
        int logN10 = 10;
        logarithmicRuntimeComplexity(logN10);
        int logN200 = 200;
        logarithmicRuntimeComplexity(logN200);
        int logN3000 = 3000;
        logarithmicRuntimeComplexity(logN3000);

        //O(n) = n
        int[] integers5 = new int[] {10,20,30,40,50};
        linearRuntimeComplexity(integers5);
        int[] integers10 = new int[] {10,20,30,40,50,60,70,80,90,100};
        linearRuntimeComplexity(integers10);

        //O(n)=n log n
        int input1 = 1;
        linearArithmicRuntimeComplexity(input1);
        int input5 = 5;
        linearArithmicRuntimeComplexity(input5);
        int input10 = 10;
        linearArithmicRuntimeComplexity(input10);

        //O(n) = n power c ; n`c
        int pinput1 = 1;
        polynomialArithmicRuntimeComplexity(pinput1);
        int pinput3 = 3;
        polynomialArithmicRuntimeComplexity(pinput3);
        int pinput5 = 5;
        polynomialArithmicRuntimeComplexity(pinput5);

        //O(n) = C power n ; c`n
        int einput1 = 1;
        System.out.println("exponentialRuntimeComplexity of " + einput1);
        exponentialRuntimeComplexity(einput1);
        int einput3 = 3;
        System.out.println("exponentialRuntimeComplexity of " + einput3);
        exponentialRuntimeComplexity(einput3);
        int einput5 = 5;
        System.out.println("exponentialRuntimeComplexity of " + einput5);
        exponentialRuntimeComplexity(einput5);

        //O(n) = n!
        int fact1 = 1;
        System.out.println( "factorialRuntimeComplexity of " +fact1);
        factorialRuntimeComplexity(fact1);
        int fact3 = 3;
        System.out.println( "factorialRuntimeComplexity of " +fact3);
        factorialRuntimeComplexity(fact3);
        int fact5 = 5;
        System.out.println( "factorialRuntimeComplexity of " +fact5);
        factorialRuntimeComplexity(fact5);

    }

    static void constantRunTimeComplexity(int n) {
        int[] integers = new int[] {10,20,30,40,50};
        System.out.println("element at "+n+" is "+integers[n]);
    }

    static  void  logarithmicRuntimeComplexity(int n) {
        for (int i = 1; i < n; i = i * 10) {
            System.out.println("print for logarithmic runtime complexity for n="+n +" >>> "+ i);
        }
    }

    static  void  linearRuntimeComplexity(int[] integers) {
        for (int i =0; i< integers.length; i++) {
            System.out.println("print for size"+integers.length+" for linear runtime complexity" + integers[i]);
        }
    }

    static void linearArithmicRuntimeComplexity(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j< n; j = j * 2) {
                System.out.println("print for input " + n + " for linear arithmic {"+i +","+j +"}" );
            }
        }
    }

    static void polynomialArithmicRuntimeComplexity(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<= n; j++) {
                System.out.println("print for input " + n + " for polynomial {"+i +","+j +"}" );
            }
        }
    }

    static  int  exponentialRuntimeComplexity(int n) {
        if (n <= 1) {
            System.out.println("Fibonacci of "+ n + " is "+ n);
            return n;
        } else {
            System.out.println("Fibonacci of "+ n + " is "+ exponentialRuntimeComplexity((n-2)) + exponentialRuntimeComplexity(n-1));
            return exponentialRuntimeComplexity((n-2)) + exponentialRuntimeComplexity(n-1);
        }
    }

    static  int factorialRuntimeComplexity(int f){

        int result = 1;
        if (f <= 1) {
            System.out.println("factorial is 1");
            return 1;
        }
        else {
            result = f * factorialRuntimeComplexity(f - 1);
            System.out.println("factorial is " + result);
            return result;
        }
    }

    static  int factorialRuntimeComplexityLoop(int f){
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
            System.out.println("factorial is {}"+ result);
        }
        return result;
    }
}