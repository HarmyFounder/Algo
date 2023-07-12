public class Pi {
    public static void main(String[] args) {

        System.out.println(calculatePi(1000000000));

    }

    public static double calculatePi(int n){
        final int up = 4;
        double down =1.0;
        double pi = 0.0;
        double sign = 1;
        for(int i = 0; i < n; i++){
            pi += sign * (up/down);
            sign *= -1;
            down += 2;
        }

        return pi;
    }
}
