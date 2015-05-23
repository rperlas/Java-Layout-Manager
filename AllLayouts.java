import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/*
 * This class creates a JPanel containing demo applications of the FlowLayout, GroupLayout,
 * GridBadLayout and SpringLayout layout managers; each demo is contained within its own space
 * of a BorderLayout.
 * 
 * @author Ronald Perlas
 * @author Jeffry Lien
 * @version February 21 2014
 */
public class AllLayouts extends JPanel
{
  /*
   * This constructor is responsible for executing the allFunction() method and outputting
   * all the relevant buttons and layouts on the JPanel.
   */
  public AllLayouts ()
  {
    allFunction();
  }
  
  /*
   * This method creates a new instance of the FlowLayoutRonald, GroupLayoutRonald, GridBagLayoutKareem
   * and SpringLayoutKareem classes. These classes each have their own seprate JPanel which are organized
   * in a BorderLayout formation with each class designated its own space.
   * 
   * @param f Reference References the FlowLayoutRonald class.
   * @param g Reference References the GroupLayoutRonald class.
   * @param k Reference References the GridBagLayoutKareem class.
   * @param s Reference References the SpringLayoutKareem class.
   */
  public void allFunction ()
  {
    FlowLayoutRonald f = new FlowLayoutRonald ();
    GroupLayoutRonald g = new GroupLayoutRonald ();
    GridBagLayoutKareem k = new GridBagLayoutKareem ();
    SpringLayoutKareem s = new SpringLayoutKareem ();
    
    f.setPreferredSize (new Dimension (300,100));
    
    setLayout (new BorderLayout ());
    add (f, BorderLayout.PAGE_START);
    add (g, BorderLayout.PAGE_END);
    add (s, BorderLayout.CENTER);
    add (k, BorderLayout.LINE_START);
    
    setVisible (true);
  }
}