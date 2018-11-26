public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(avarage(34.0,78.9,65.5));
        System.out.println(average(59,34,42));
    }
    public static double avarage(double a, double b, double c){
      double answer = (a+b+c)/3.0;
      return answer;
    }
    public static Integer average(int a, int b, int c){
        int answer = (a+b+c)/3;
        return answer;
    }
}
