import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/* The "FlowLayoutRonald" class provides an example of the FlowLayout layout manager; it demonstrates
 * the various fields and methods featured in this layout. FlowLayout organizes components in a flowing manner; it orients 
 * components on a line and wraps around once no more components fit.
 * 
 * @author Ronald Perlas
 * @author Jeffry Lien
 * @version 1.0 February 21 2014
 */
public class FlowLayoutRonald extends JPanel
{
  /* 
   * returnField Reference References the JTextField class and creates a new text field which is
   * used to output data from get() methods to the user.
   */
  JTextField returnField = new JTextField (50);
  
  /* 
   * f Reference References the FlowLayout class and makes its methods and features accessible.
   */
  FlowLayout f;
  
  /*
   * This constructor is responsible for executing the flowFunction() method and outputting
   * all the relevant buttons and layouts on the JPanel.
   */
  public FlowLayoutRonald ()
  { 
    flowFunction();
  }
  
  /*
   * This method contains the commands to create every component that appears on the JPanel as 
   * well as integrates the methods of the FlowLayout class.
   * 
   * @param centerButton Reference References the "Center" JButton.
   * @param leftButton Reference References the "Left" JButton.
   * @param rightButton Reference References the "Right" JButton.
   * @param leadButton Reference References the "Leading" JButton.
   * @param trailButton Reference References the "Trailing" JButton.
   * @param getAlignButton Reference References the "getAlignment()" JButton.
   * @param getHgapButton Reference References the "getHgap()" JButton.
   * @param incHgapButton Reference References the "setHgap()+" JButton.
   * @param decHgapButton Reference References the "setHgap()-" JButton.
   * @param getVgapButton Reference References the "getVgap()" JButton.
   * @param incVgapButton Reference References the "setVgap()+" JButton.
   * @param decVgapButton Reference References the "setVgap()-" JButton.
   * @param setBaseAlign Reference References the "setAlignOnBaseline()" JButton.
   * @param getBaseAlign Reference References the "getAlignOnBaseline()" JButton.
   * @param preferredButton Reference References the "preferredLayoutSize()" JButton.
   * @param minimumButton Reference References the "minimumLayoutSize()" JButton.
   * @param layoutButton Reference References the "layoutContainer()+" JButton.
   * @param stringButton Reference References the "toString()-" JButton.
   * @param ae ActionEvent Stores the action command.
   */
  public void flowFunction ()
  {
    // Button creation and initialization.
    JButton centerButton = new JButton ("Center");
    JButton leftButton = new JButton ("Left");
    JButton rightButton = new JButton ("Right");
    JButton leadButton = new JButton ("Leading");
    JButton trailButton = new JButton ("Trailing");
    JButton getAlignButton = new JButton ("getAlignment()");
    JButton getHgapButton = new JButton ("getHgap()");
    JButton incHgapButton = new JButton ("setHgap()+");
    JButton decHgapButton = new JButton ("setHgap()-");
    JButton getVgapButton = new JButton ("getVgap()");
    JButton incVgapButton = new JButton ("setVgap()+");
    JButton decVgapButton = new JButton ("setVgap()-");
    JButton setBaseAlign = new JButton ("setAlignmentOnBaseline() Toggle");
    JButton getBaseAlign = new JButton ("getAlignmentOnBaseline()");
    JButton preferredButton = new JButton ("preferredLayoutSize()");
    JButton minimumButton = new JButton ("minimumLayoutSize()");
    JButton layoutButton = new JButton ("layoutContainer()");
    JButton stringButton = new JButton ("toString()");
    
    // Sets layout.
    f = new FlowLayout ();
    setLayout (f);
    
    // Adding to JPanel.
    add (returnField);
    add (leadButton);
    add (leftButton);
    add (centerButton);
    add (rightButton);
    add (trailButton);
    add (getAlignButton);
    add (getHgapButton);
    add (incHgapButton);
    add (decHgapButton);
    add (getVgapButton);
    add (incVgapButton);
    add (decVgapButton);
    add (setBaseAlign);
    add (getBaseAlign);
    add (preferredButton);
    add (minimumButton);
    add (layoutButton);
    add (stringButton);
    
    // CENTER Field
    centerButton.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        f.setAlignment (FlowLayout.CENTER);
        revalidate();
      }
    });
    // LEFT Field
    leftButton.addActionListener (new ActionListener ()
                                    {
      public void actionPerformed (ActionEvent ae)
      {
        f.setAlignment (FlowLayout.LEFT);
        revalidate();
      }
    });
    // LEADING Field
    leadButton.addActionListener (new ActionListener ()
                                    {
      public void actionPerformed (ActionEvent ae)
      {
        f.setAlignment (FlowLayout.LEADING);
        revalidate();
      }
    });
    // RIGHT Field
    rightButton.addActionListener (new ActionListener ()
                                     {
      public void actionPerformed (ActionEvent ae)
      {
        f.setAlignment (FlowLayout.RIGHT);
        revalidate();
      }
    });
    // TRAILING Field
    trailButton.addActionListener (new ActionListener ()
                                     {
      public void actionPerformed (ActionEvent ae)
      {
        f.setAlignment (FlowLayout.TRAILING);
        revalidate();
      }
    });
    // getAlignment() Method
    getAlignButton.addActionListener (new ActionListener ()
                                        {
      public void actionPerformed (ActionEvent ae)
      {
        returnField.setText ("Alignment: " + f.getAlignment ());
      }
    });
    // getHgap() Method
    getHgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        returnField.setText ("Horizontal Gap: " + f.getHgap ());
      }
    });
    // setHgap() Method
    incHgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        setVisible (false);
        f.setHgap (f.getHgap() + 1);
        setVisible (true);
      }
    });
    // setHgap() Method
    decHgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        setVisible (false);
        f.setHgap (f.getHgap() - 1);
        setVisible (true);
      }
    });
    // getVgap() Method
    getVgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        returnField.setText ("Vertical Gap: " + f.getVgap());
      }
    });
    // setVgap() Method
    incVgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        setVisible (false);
        f.setVgap (f.getVgap() + 1);
        setVisible (true);
      }
    });
    // setVgap() Method
    decVgapButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        setVisible (false);
        f.setVgap (f.getVgap() - 1);
        setVisible (true);
      }
    });
    // getBaseAlignment() Method
    getBaseAlign.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        returnField.setText ("Base Alignment: " + f.getAlignOnBaseline ());
      }
    });
    // setBaseAlignment() Method
    setBaseAlign.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        setVisible (false);
        if (f.getAlignOnBaseline() == false)
          f.setAlignOnBaseline (true);
        else
          f.setAlignOnBaseline (false);
        setVisible (true);
      }
    });
    // preferredLayoutSize() Method
    preferredButton.addActionListener (new ActionListener ()
                                         {
      public void actionPerformed (ActionEvent ae)
      {
        Dimension d = f.preferredLayoutSize(FlowLayoutRonald.this);
        returnField.setText ("Preferred Layout Size: " + d.getWidth() + "x" + d.getHeight());
      }
    });
    // minimumLayoutSize() Method
    minimumButton.addActionListener(new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        Dimension d = f.minimumLayoutSize (FlowLayoutRonald.this);
        returnField.setText ("Minimum Layout Size: " + d.getWidth() + " x " + d.getHeight ());
      }
    });
    // layoutContainer() Method
    layoutButton.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        Container c = new Container ();
        f.layoutContainer (c);
      }
    });
    // toString() Method
    stringButton.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        returnField.setText ("String Rep: " + f.toString());
      }
    });
    
    returnField.setText ("Requested Data: ");
    setVisible (true);
  }
}
