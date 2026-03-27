public class inputnumber {
    public static void main(String[] args) {
            int number = Integer.parseInt(args[0]);
            System.out.println("You entered: " + number);
            if (number==-1) {
                System.out.println("The number is -1.");
                System.out.println("sum = " + (number + 1));
                System.out.println("average = " + (number + 1) / 2);
                System.out.println("max = " + Math.max(number, 1));
                System.out.println("min = " + Math.min(number, 1));
            }
             else {
                System.out.println("The number is zero.");
            }
    }
}

