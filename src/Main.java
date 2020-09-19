public class Main {
    public static void main(String[] args) {
        
    }
    public static int bruteForce(int first, int second, int third){

        int gcd = 1;

        for (int i = 1; i < first || i < second || i < third; i++){

            if (first % i == 0 && second % i == 0 && third % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int euclidsAlgorithm(int first, int second){
        if (second == 0) {
            return first;
        }
        return euclidsAlgorithm(second, first % second);
    }
}
