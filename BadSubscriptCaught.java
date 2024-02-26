import javax.swing.*;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] firstNames = {"Tim", "Tom", "Bob", "Bill", "Carl", "Kim", "Marge", "Paul", "Becca", "Linda"};
        int num=-1;
        boolean b1 = false, b2=false;

        String input = JOptionPane.showInputDialog("Which index would you like to check?");
        while(!b1) {
            try {
                num = Integer.parseInt(input);
                b1=true;
            } catch (Exception e) {
                input = JOptionPane.showInputDialog(null, "Please enter an integer");
            }
        }

        try {
            JOptionPane.showMessageDialog(null, firstNames[num - 1]);
            b2 = true;
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Integers must be between 1 and 10");
        }

    }
}