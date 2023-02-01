package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
     first=30;
     second=25;
     third=15;
     int result;
     if(first>second){
      result=first>third? first: third;
      System.out.println(result);
     }else{
      result=second>third? second: third;
      System.out.println(result);
    } 
}
}
