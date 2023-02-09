package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
     int result1;
     int result2;
     int resultTotal;
     result1=first>third? first: third;
     result2=second>third? second: third;
     resultTotal=first>second? result1: result2;
     System.out.println(resultTotal);
}
}
