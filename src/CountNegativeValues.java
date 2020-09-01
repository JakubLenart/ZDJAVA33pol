public class CountNegativeValues {

    public static void countNegativeValues(int[] allValues) {
            int counter = 0;
            for(int value: allValues){
                if(value < 0){
                    counter++;
                }
            }
            System.out.println("Number of negative equals: " + counter);
        }
        public static void main(String[] args) {
            int[] allValues = {1, 3,-10, 3, 4, -1, -2};
            countNegativeValues(allValues);
        }
    }



