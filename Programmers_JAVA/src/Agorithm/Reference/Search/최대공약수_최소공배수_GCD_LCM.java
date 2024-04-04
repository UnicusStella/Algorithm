package Agorithm.Reference.Search;

public class 최대공약수_최소공배수_GCD_LCM {
    public static void main(String[] args) {

        최대공약수_최소공배수_GCD_LCM stella = new 최대공약수_최소공배수_GCD_LCM();

        int[] arr1 = {2, 6};

        int[] arr2 = {3, 7};

        System.out.println("Answer = " + stella.solution(arr1));
        System.out.println("Answer = " + stella.solution(arr2));
    }

    /*
        arr1	                    result
     */
    public int solution(int[] arr) {

        int answer = 0;

        int gcd = GCD(arr[0], arr[1]);
        int lcm = LCM(arr[0], arr[1]);

        System.out.println();
        System.out.println("gcd = " + gcd);
        System.out.println("lcm = " + lcm);
        System.out.println();

        return answer;
    }

    private int LCM(int num1, int num2) {

        return (num1 * num2) / GCD(num1, num2);
    }

    private int GCD(int num1, int num2) {
        if (num1 % num2 == 0) return num2;

        return GCD(num2, num1 % num2);
    }
}
