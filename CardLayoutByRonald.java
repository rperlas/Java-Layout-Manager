import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * This class creates a JPanel equipped with a JTabbedPane which contains demos of the FlowLayout, GroupLayout,
 * GridBagLayout and SpringLayout layout managers. This class also displays a demo with 
 * GroupLayout within FlowLayout as well as a demo with all four layouts organized by a BorderLayout.
 * 
 * @author Ronald Perlas
 * @author Jeffry Lien
 * @version February 21 2014
 */
public class CardLayoutByRonald extends JPanel
{
  /*
   * This constructor creates a JTabbedPane with six tabs, each containing a distinct combination
   * of four different layout managers. The first tab contains the FlowLayoutRonald class, the second
   * contains the GroupLayoutRonald class, the third contains both, the fourth contains the GridBagLayoutKareem
   * class, the fifth contains the SpringLayoutKareem class and the sixth contains all four.
   * 
   * @param tabs Reference References the JTabbedPane.
   * @param f Reference References the FlowLayoutRonald class.
   * @param g Reference References the GroupLayoutRonald class.
   * @param a Reference References the ThirdLayouts class.
   * @param b Reference References the GridBagLayoutKareem class.
   * @param s Reference References the SpringLayoutKareem class.
   * @param z Reference References the AllLayouts class.
   */
  public CardLayoutByRonald ()
  {
    super (new GridLayout(1,1));
    
    // Adds the JTabbedPane
    JTabbedPane tabs = new JTabbedPane ();
    
    // Adds the FlowLayoutRonald class.
    FlowLayoutRonald f = new FlowLayoutRonald();
    tabs.addTab ("FlowLayout", null, f, "LayoutManager: FlowLayout");
    
    // Adds the GroupLayoutRonald class.
    GroupLayoutRonald g = new GroupLayoutRonald();
    tabs.addTab ("GroupLayout", null, g, "Layout Manager: GroupLayout");
    
    // Adds the ThirdLayouts class.
    ThirdLayouts a = new ThirdLayouts();
    tabs.addTab ("RonaldLayouts", null, a, "FlowLayout & GroupLayout");    
    
    // Adds the GridBagLayoutKareem class.
    GridBagLayoutKareem b = new GridBagLayoutKareem ();
    tabs.addTab ("GridBagLayout", null, b, "GridBagLayout");
    
    // Adds the SpringLayoutKareem class.
    SpringLayoutKareem s = new SpringLayoutKareem ();
    tabs.addTab ("SpringLayout", null, s, "SpringLayout");
    
    // Adds the AllLayouts class.
    AllLayouts z = new AllLayouts();
    tabs.addTab ("AllLayouts", null, z, "All Layouts");
    
    add (tabs);
  }
  
  /*
   * This method creates a new JFrame and sets the window size as 1200x600, the content pane
   * as 800x600, the visibility as true and the default closing operation. The method also
   * adds the CardLayoutByRonald class onto the frame window.
   * 
   * @param frame Reference References the JFrame window.
   */
  private static void createAndShowGUI() {
    JFrame frame = new JFrame();
    frame.add(new CardLayoutByRonald());
    frame.setSize (1200,600);
    frame.getContentPane().setSize (800, 600);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  
  /*
   * This main method executes the createAndShowGUI() method and executes the full program.
   */
  public static void main (String[] args)
  {
    createAndShowGUI();
  }
}