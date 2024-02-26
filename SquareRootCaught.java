import javax.swing.*;

public class SquareRootCaught {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("What number would you like to take the square root of");
        double num=0;
        boolean b1=false;
        while(!b1) {
            try {
                num = Double.parseDouble(input);
                b1=true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Input must be a number");
            }
        }
        try {
            if (Double.isNaN(Math.sqrt(num))) throw new ArithmeticException();
            JOptionPane.showMessageDialog(null, "The square root of "+input+" is "+Math.sqrt(num));
        }
        catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Cannot take square root of negative number");
        }

    }
}
