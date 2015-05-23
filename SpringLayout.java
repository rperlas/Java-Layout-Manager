import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/* The "SpringLayoutKareem" class provides an example of the SpringLayout layout manager; it demonstrates
 * the various fields and methods featured in this layout. SpringLayout lays out components based on a set of 
 * constraints and is generally used to alter the coordinates or spacing of its components.
 * 
 * @author Kareem Golaub
 * @author Ronald Perlas
 * @version 2.0 February 24 2014
 */
public class SpringLayoutKareem extends JPanel implements ActionListener
{
  /*
   * layout Reference References the SpringLayout class and makes its methods and features accessible.
   */
  SpringLayout layout = new SpringLayout();
  /*
   * increaseSpacing Reference References the "Increase Spacing" JButton.
   */
  JButton increaseSpacing;
  /*
   * decreaseSpacing Reference References the "Decrease Spacing" JButton.
   */
  JButton decreaseSpacing;
  /*
   * moveUp Reference References the "Move Up" JButton.
   */
  JButton moveUp;
  /*
   * moveDown Reference References the "Move Down" JButton.
   */
  JButton moveDown;
  /*
   * moveLeft Reference References the "Move Left" JButton.
   */
  JButton moveLeft;
  /*
   * moveRight Reference References the "Move Right" JButton.
   */
  JButton moveRight;
  /*
   * center Reference References the " " JLabel.
   */
  JLabel center;
  
  /*
   * maxLeft Integer Stores the maximum left distance; initialized to 920.
   */
  int maxLeft = 920;
  /*
   * maxUp Integer Stores the maximum upper distance; initialized to 240.
   */
  int maxUp = 240;
  /*
   * spacing Integer Stores the distance between components; initialized to 10.
   */
  int spacing = 10;
  /*
   * maxLeft Integer Stores the upper distance; initialized to 10.
   */
  int upDistance = 10;
  /*
   * maxLeft Integer Stores the right distance; initialized to 10.
   */
  int right = 10;
  /*
   * maxLeft Integer Stores the left distance; initialized to 10.
   */
  int left = 10;
  
  /*
   * This constructor sets the layout of the JPanel, sets the visibility and
   * executes the buttons() method.
   */
  public SpringLayoutKareem()
  {
    setLayout(layout);
    setVisible(true);
    buttons();
  }
  
  /*
   * This method sets the constraints of the SpringLayout, creates the various JButtons, adds ActionListeners
   * to the buttons and adds them to the JPanel.
   */
  public void buttons()
  {
    increaseSpacing = new JButton("Increase Spacing");
    decreaseSpacing = new JButton("Decrease Spacing");
    moveUp= new JButton("Move Up");
    moveDown = new JButton("Move Down");
    moveRight = new JButton("Move Right");
    moveLeft = new JButton("Move Left");
    center = new JLabel(" ");
    
    layout.putConstraint(SpringLayout.WEST, moveLeft, 10, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, moveRight, 10, SpringLayout.EAST, moveLeft);
    layout.putConstraint(SpringLayout.WEST, moveUp, 10, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, moveDown, 10, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, increaseSpacing, 10, SpringLayout.EAST, moveUp);
    layout.putConstraint(SpringLayout.WEST, decreaseSpacing, 10, SpringLayout.EAST, moveDown);
    
    layout.putConstraint(SpringLayout.NORTH, increaseSpacing, 10, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveLeft, 46, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveRight, 46, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveUp, 10, SpringLayout.NORTH, this);
    
    layout.putConstraint(SpringLayout.NORTH, moveDown, 46, SpringLayout.SOUTH, moveUp);
    layout.putConstraint(SpringLayout.NORTH, decreaseSpacing, 46, SpringLayout.SOUTH, increaseSpacing);
    
    layout.putConstraint(SpringLayout.HORIZONTAL_CENTER, center, 0, SpringLayout.HORIZONTAL_CENTER, this);
    layout.putConstraint(SpringLayout.VERTICAL_CENTER, center, 0, SpringLayout.VERTICAL_CENTER, this);
    
    increaseSpacing.addActionListener(this);
    decreaseSpacing.addActionListener(this);
    moveDown.addActionListener(this);
    moveUp.addActionListener(this);
    moveRight.addActionListener(this);
    moveLeft.addActionListener(this);
    
    add(increaseSpacing);
    add(decreaseSpacing);
    add(moveUp);
    add(moveDown);
    add(moveRight);
    add(moveLeft);
    add(center);
  }
  
  /*
   * This method invokes the appropriate response to the relevant ActionEvent for the buttons:
   * "Increase Spacing", "Decrease Spacing", "Move Up", "Move Down", "Move Left" and "Move Right".
   * 
   * @param ae ActionEvent Stores the action command.
   */
  public void actionPerformed (ActionEvent ae)
  {
    if (ae.getActionCommand().equals("Increase Spacing"))
    {
      if (upDistance < maxUp && left < maxLeft)
      {
        spacing = 20;
        maxLeft = 900;
        maxUp = 220;
      }
    }
    else if (ae.getActionCommand().equals("Decrease Spacing"))
    {
      spacing = 10;
      maxLeft = 920;
      maxUp = 240;
    }
    else if (ae.getActionCommand().equals("Move Up"))
    {
      if (upDistance > 10)
        upDistance -= 20;
    }
    else if (ae.getActionCommand().equals("Move Down"))
    {
      if (upDistance < maxUp)
        upDistance += 20;
    }
    else if (ae.getActionCommand().equals("Move Right"))
    {
      if (left < maxLeft)
        left += 20;
    }
    else if (ae.getActionCommand().equals("Move Left"))
    {
      if (left > 10)
        left -= 20;
    }
    else
    {
    }
    
    layout.putConstraint(SpringLayout.WEST, moveLeft, left, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, moveRight, spacing, SpringLayout.EAST, moveLeft);
    layout.putConstraint(SpringLayout.WEST, moveUp, left, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, moveDown, left, SpringLayout.WEST, this);
    layout.putConstraint(SpringLayout.WEST, increaseSpacing, spacing, SpringLayout.EAST, moveUp);
    layout.putConstraint(SpringLayout.WEST, decreaseSpacing, spacing, SpringLayout.EAST, moveDown);
    
    layout.putConstraint(SpringLayout.NORTH, increaseSpacing, upDistance, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveLeft, 26+upDistance+spacing, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveRight, 26+upDistance+spacing, SpringLayout.NORTH, this);
    layout.putConstraint(SpringLayout.NORTH, moveUp, upDistance, SpringLayout.NORTH, this);
    
    layout.putConstraint(SpringLayout.NORTH, moveDown, spacing, SpringLayout.SOUTH, moveLeft);
    layout.putConstraint(SpringLayout.NORTH, decreaseSpacing, spacing, SpringLayout.SOUTH, moveRight);
    
    setLayout(layout);
    revalidate();
  }
}
