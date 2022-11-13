class Solution {


    static int steps = 0;

    public static int numberOfSteps(int num) {

        if ((num % 2 == 0)) {
            if( num == 0 ) {
                return steps;
            }else {
                numberOfStepsHelper(num);
            }

         } else {
            if(num == 1){
                return steps += 1;
            }else {
                num = num - 1;
                steps += 1;
                numberOfStepsHelper(num);
            }
        }

        return steps;
    }

    private static void numberOfStepsHelper(int num) {
        num = num / 2;
        steps += 1;
        numberOfSteps(num);

    }
}

