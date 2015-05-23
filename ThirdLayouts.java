import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * The ThirdLayouts class creates a JPanel containing demos of the FlowLayout and 
 * GroupLayout classes which are to be used on the third tab of the CardLayoutRonald 
 * class. FlowLayoutRonald is the primary class while GroupLayoutRonald is the secondary
 * class in this program.
 * 
 * @author Ronald Perlas
 * @version 1.0 February 21 2014
 */
public class ThirdLayouts extends JPanel
{
  /*
   * This constructor is responsible for executing the thirdFunction() method and outputting
   * all the relevant buttons and layouts on the JPanel.
   */
  public ThirdLayouts ()
  {
    thirdFunction();
  }
  
  /*
   * This method creates a new instance of both the FlowLayoutRonald and GroupLayoutRonald
   * classes which output a demo of the FlowLayout and GroupLayout layout managers respectively.
   * These layout demos are then arranged, one within another, onto the JPanel.
   * 
   * @param f Reference References the FlowLayoutRonald class.
   * @param g Reference References the GroupLayoutRonald class.
   */
  public void thirdFunction ()
  {
    FlowLayoutRonald f = new FlowLayoutRonald ();
    GroupLayoutRonald g = new GroupLayoutRonald ();
    
    setLayout (new GridLayout (0,1));
    add (f, BorderLayout.NORTH);
    add (g, BorderLayout.SOUTH);
    
    setVisible (true);
  }
}