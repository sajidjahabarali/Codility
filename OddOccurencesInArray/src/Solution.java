public class Solution {
    public int solution(int[] A) {
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

