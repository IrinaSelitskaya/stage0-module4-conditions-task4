package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
     first=20;
     second=25;
     third=30;
     int result1;
     int result2;
     int resultTotal;
     result1=first>third? first: third;
     result2=second>third? second: third;
     resultTotal=first>second? result1: result2;
     System.out.println(resultTotal);
}
}
