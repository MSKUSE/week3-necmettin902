public class FindMaximum {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        boolean condition=num1 > num2;
        int max=condition ? num1 : num2;
        System.out.println(max);
        if (num1>num2){
            System.out.println("number1 is higher");
        } else if (num1 == num2) {
            System.out.println("these numbers is equal");
        }else if (num2>num1){
            System.out.println("number2 is higher");
        }
    }
}
