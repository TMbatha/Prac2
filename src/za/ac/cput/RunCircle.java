package za.ac.cput;

import javax.swing.JOptionPane;

/**
 * RunCircle.java
 * 12/02/2024
 * @author Thabiso Mbatha
 */
public class RunCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        
        String inputRadius = JOptionPane.showInputDialog("Enter Radius");
        double convertedRadius = Double.parseDouble(inputRadius);
        
        circle.setRadius(convertedRadius);
        
        JOptionPane.showMessageDialog(null, circle);
    }
}
