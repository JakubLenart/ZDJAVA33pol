public class SwitchArray {

    public static void switchArray(int... numbers){
        if (numbers.length >=3) {
                System.out.println("Before");
                arrayPrint(numbers);
                  int positionZeroOriginalValue = numbers[0];
                numbers[0] = numbers[2];
                numbers[2] = positionZeroOriginalValue;
                System.out.println("After");
                arrayPrint(numbers);
            } else {
                System.out.println("Too small table");
            }
        }
        public static void arrayPrint(int[] table){
            for (int el: table) {
                System.out.print("[" + el + "] ");
            }
            System.out.print("\n");
        }
        public static void main(String[] args) {
            switchArray(1,2,3,4,66);
            switchArray(1,2,3);
        }
    }

