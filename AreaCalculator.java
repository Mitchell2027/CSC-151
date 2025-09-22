/*Program will calculate the area of a rectangle and circle using JOption Pane and Methods
 * Mariah Mitchell
 * 21 Sep 2025
 *
 ************Pseudocode************
 *Ask user "Enter the length of the rectangle"
 * Input lengt
 * Ask user "Enter the width of the rectangle"
 * Input width
 * Set area = length * width
 * Display Area of rectangle
 * Ask user "Enter the radius of the circle"
 * Input radius
 * Set Area = Math.PI * radius * radius
 * Display area of the circle
 */


import javax.swing.JOptionPane;

public class AreaCalculator {
    public static void main(String[] args) {
        // Rectangle
        double length = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the length of the rectangle:")
        );
        double width = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the width of the rectangle:")
        );
        double rectArea = length * width;
        JOptionPane.showMessageDialog(null, "Area of rectangle: " + rectArea);

        // Circle
        double radius = Double.parseDouble(
            JOptionPane.showInputDialog("Enter the radius of the circle:")
        );
        double circArea = Math.PI * radius * radius;
        JOptionPane.showMessageDialog(null, "Area of circle: " + circArea);
    }
}