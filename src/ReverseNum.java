public class ReverseNum {
    public static void main(String[] args) {
        long number = 6309505244l;
        long reverse = 0;
        while(number != 0)
        {
            long  remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}


