import java.util.Scanner;
public class angstrom {
    public static void main(String[] args){
        System.out.print("Enter the lower range: ");
        Scanner scanner_1 = new Scanner(System.in);
        int lower_val = scanner_1.nextInt();
        System.out.print("Enter the upper range: ");
        int upper_val = scanner_1.nextInt();
        int num_length;
        String val_str;
        System.out.print("All angstrom numbers between the values " + Integer.toString(upper_val) + " and " + Integer.toString(lower_val) + " are: ");
        for (int i = lower_val; i <= upper_val; i++ ){
            val_str = Integer.toString(i);
            num_length = val_str.length();
            int sum = 0;
            for (int j = 0; j < num_length; j++ ){
                sum += Math.pow(Integer.parseInt(String.valueOf(val_str.charAt(j))),num_length);
            }
            if (sum == i){
                System.out.print(Integer.toString(i) + ' ');
            }
        }
        scanner_1.close();
    }
}
