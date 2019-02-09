import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args){
        System.out.println("Type numbers for list. \nType f if finished.");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String input = scanner.nextLine();
        while(!input.equals("f")){
            try{
                numbers.add(Integer.parseInt(input));
                input = scanner.nextLine();
            }
            catch(NumberFormatException e){
                if(!input.equals("f")) {
                    System.out.println("Please type a number to add to the list or f to exit.");
                }
            }
        }

        int[] A = new int[numbers.size()];

        for(int i = 0; i<numbers.size(); i++){
            A[i] = numbers.get(i);
        }

        int result = solution(A);
        System.out.println(result);

    }


    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1) {
            return A[0];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j <= A.length; j++) {
                //System.out.println(i + " " + j);
                //System.out.println(A[i] + " " + A[j]);
                if (j == A.length) {
                    return A[A.length - 1];
                }

                if (A[i] == -1) {
                    //System.out.println("b");
                    break;
                }

                if (A[i] == A[j]) {
                    A[i] = -1;
                    A[j] = -1;
                    break;

                } else if (j == A.length - 1) {
                    return A[i];
                }


            }
        }

        //System.out.println("end");
        return -1;

    }
}

