public class FindPrimes {
    public static void main(String[] args) {
        int prime=Integer.parseInt(args[0]);
        for (int i=2; prime>=i;i++){
            boolean isprime= true;
            for (int j=2; j<i;j++){
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime){
                System.out.println(i);
            }
        }
    }
}
