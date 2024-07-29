package Exception;
    public class Exception {

        public static void main(String[] args) {
            System.out.println("Before exception.....");
            try {

                int i=1/Integer.parseInt(args[0]);//dividing a number by zero will give Arithmetic Exception

            }catch(ArithmeticException ae) {
                System.out.println("Please give a non zero value...");
            }catch(ArrayIndexOutOfBoundsException ae) {
                System.out.println("Please give a value...");
            }finally {
                System.out.println("Finally Block called...");
            }

        }
    }


