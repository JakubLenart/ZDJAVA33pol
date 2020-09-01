public class ArithmeticSequence {

    public static void main(String[] args) {
            int[] x = getArithmeticSequence(5, 2, 3);
            printTable(x);
            int[] y = getArithmeticSequence(2, 0, 3);
            printTable(y);
            int[] a = getArithmeticSequence(10, 5, 10);
            printTable(a);
        }
        private static int[] getArithmeticSequence(int lenght, int firstNumber, int incrementValue) {
            int[] arithmeticSequence = new int[lenght];
            for (int index = 0; index < lenght; index++) {
                arithmeticSequence[index] = firstNumber + incrementValue*index;
            }
            return arithmeticSequence;
        }
        public static void printTable(int[] table) {
            for (int el : table) {
                System.out.print("[" + el + "] ");
            }
            System.out.print("\n");
        }
    }

