// Name: Darsh Iyer
// Date: 29 January, 2024
// Course: CS211 11490 - W24 - Fundamentals of CS II
// References used: Github

import java.math.BigInteger;

public class Fibonacci {
    private static final BigInteger TWO = new BigInteger("2");
    
    private static final BigInteger ONE = new BigInteger("1");
    
    private int n;

    public Fibonacci(int number) {
        n = number;
    }

    @SuppressWarnings("unused")
    
    private Fibonacci() {
        this(1);
    }

    public BigInteger fibForLoop() {
        BigInteger n1 = ONE;
        
        BigInteger n2 = ONE;
        
        for (int i = 3; i <= n; i++) {
            BigInteger n3 = n1.add(n2);
        
            n1 = n2;
        
            n2 = n3;
        }
        
        return n2;
    }

    public BigInteger fibonacci() {
        BigInteger[] memo = new BigInteger[n + 1];
        
        memo[0] = ONE;
        
        memo[1] = ONE;
        
        return fibonacciHelper(n, memo);
    }

    private BigInteger fibonacciHelper(int n, BigInteger[] memo) {
        if (n <= 1) {
            return memo[n];
        }
        
        if (memo[n] == null) {
            memo[n] = fibonacciHelper(n - 1, memo).add(fibonacciHelper(n - 2, memo));
        }
        
        return memo[n];
    }

    public BigInteger bigFib() {
        BigInteger[] memo = new BigInteger[n + 1];
        
        memo[0] = ONE;
        
        memo[1] = ONE;
        
        return bigFibHelper(new BigInteger(Integer.toString(n)), memo);
    }

    private BigInteger bigFibHelper(BigInteger n, BigInteger[] memo) {
        if (n.compareTo(TWO) <= 0) {
            return memo[n.intValue()];
        }
        
        if (memo[n.intValue()] == null) {
            memo[n.intValue()] = bigFibHelper(n.subtract(ONE), memo).add(bigFibHelper(n.subtract(TWO), memo));
        }
        
        return memo[n.intValue()];
    }

    public BigInteger bigFastFib() {
        return bigFastFibHelper(0, BigInteger.ZERO, BigInteger.ONE);
    }

    private BigInteger bigFastFibHelper(int index, BigInteger prev, BigInteger next) {
        if (index == n) {
            return prev;
        }
        
        else {
            return bigFastFibHelper(index + 1, next, prev.add(next));
        }
    }
}

