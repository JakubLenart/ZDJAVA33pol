public class TestVarargs {

    public static void printAllArguments(String greetingSeparator, Object... arguments)
    { System.out.println(greetingSeparator);
            for(int i=0; i<arguments.length; i++) {
                System.out.println(arguments[i]);
            }
        }
        public static void main(String[] args) {
            printAllArguments("----", 1);
            printAllArguments( "--***--",1,2);
            printAllArguments(  "*****", 1,2, "Mickey Mouse");
            Object[] array1 = {1,2, "Mickey Mouse using array as argument"};
            printAllArguments("@@@@@@@@@@@@@@@@", array1);
        }
    }





