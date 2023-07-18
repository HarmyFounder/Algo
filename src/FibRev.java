public class FibRev {

    public static void main(String[] args) {

        System.out.println(fib(57438));

    }

    public static int fib(int n){
        int start = 1;
        int next = 0;
        int end = 0;

        for(int i = 0; i < n; i++){
           next = start + end;
           start = end;
           end = next;
        }
        return end;
    }

}
