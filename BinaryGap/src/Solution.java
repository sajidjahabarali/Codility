import java.util.Scanner;

class Solution {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type an integer: ");
        int N = scanner.nextInt();
        int binaryGap = solution(N);
        System.out.println(binaryGap);


    }

    public static int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);
        //System.out.println(binary);

        int currentCount = 0;
        int maxCount = 0;
        boolean counting = false;

        for(int i=0; i<binary.length(); i++){

            if(binary.charAt(i)=='1'){
                if(counting){
                    if(currentCount>maxCount){
                        maxCount = currentCount;
                    }
                    currentCount = 0;
                }
                else{
                    counting = true;
                }
            }
            else{
                currentCount++;
            }

        }

        return maxCount;

    }
}