public class math {
    public static void main(String[] args) {
        String input1 = args[0];
        String input2 = args[1];
        String input3 = args[2];

        double num1 = Double.parseDouble(input1);
        double num2 = Double.parseDouble(input2);
        double num3 = Double.parseDouble(input3);

        System.out.println("Addition: " + (num1 + num2 + num3));
        System.out.println("Multiplication: " + (num1 * num2 * num3));
        System.out.println("Subtraction: " + (num1 - num2 - num3));
        System.out.println("Division: " + (num1 / num2 / num3));
    }
}
