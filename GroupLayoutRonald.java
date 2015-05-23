import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/* The "GroupLayoutRonald" class provides an example of the GroupLayout layout manager; it demonstrates
 * the various fields and methods featured in this layout. GroupLayout organizes components in a controlled,
 * axis-based manner where components are oriented in parallel or sequential structures.
 * 
 * @author Ronald Perlas
 * @author Jeffry Lien
 * @author Edwin Ng
 * @version 1.0 February 21 2014
 */ 
public class GroupLayoutRonald extends JPanel
{
  /*
   * g Reference References the GroupLayout class and makes its methods and features accessible.
   */ 
  GroupLayout g;
  
  /*
   * getInfoButton Reference References the "getMethods()" JButton 
   */
  JButton getInfoButton;
  /*
   * stringButton Reference References the "toString()" JButton 
   */
  JButton stringButton;
  /*
   * setContainGapsButton Reference References the "setAutoCreateContainerGaps()" JButton 
   */
  JButton setContainGapsButton; 
  /*
   * setAutoGapsButton Reference References the "setAutoCreateGaps()" JButton 
   */
  JButton setAutoGapsButton;
  /*
   * setHonorsVisButton Reference References the "setHonorsVisible()" JButton 
   */
  JButton setHonorsVisButton; 
  /*
   * diagonalButton Reference References the "Diagonal" JButton 
   */
  JButton diagonalButton;
  /*
   * verticalButton Reference References the "Vertical" JButton 
   */
  JButton verticalButton; 
  /*
   * horizontalButton Reference References the "Horizontal" JButton 
   */
  JButton horizontalButton; 
  /*
   * linkSizeButton Reference References the "linkSize()" JButton 
   */
  JButton linkSizeButton;
  /*
   * replaceButton Reference References the "replace()" JButton 
   */
  JButton replaceButton;
  /*
   * returnButton Reference References the "Return" JButton 
   */
  JButton returnButton;
  
  /*
   * This constructor is responsible for executing the groupFunction() method and outputting
   * all the relevant buttons and layouts on the JPanel.
   */
  public GroupLayoutRonald ()
  {
    groupFunction();
  }
  
  /*
   * This method contains the commands to create every component that appears on the JPanel as 
   * well as integrates the methods of the GroupLayout class.
   * 
   * @param ae ActionEvent Stores the action command.
   */
  public void groupFunction ()
  { 
    // Set layouts.
    g = new GroupLayout (this);
    setLayout (g);
    
    // Button initialization.
    getInfoButton = new JButton ("getMethods()");
    stringButton = new JButton ("String");
    setContainGapsButton = new JButton ("setAutoCreateContainerGaps()");
    setAutoGapsButton = new JButton ("setAutoCreateGaps()");
    setHonorsVisButton = new JButton ("setHonorsVisibility()");
    diagonalButton = new JButton ("Diagonal");
    verticalButton = new JButton ("Vertical");
    horizontalButton = new JButton ("Horizontal");
    linkSizeButton = new JButton ("linkSize()");
    replaceButton = new JButton ("replace()");
    returnButton = new JButton ("Return");
    
    // Default Layout
    g.setVerticalGroup(
                       g.createSequentialGroup()
                         .addComponent(getInfoButton)
                         .addComponent(diagonalButton)
                         .addComponent(verticalButton)
                         .addComponent(horizontalButton)
                         .addComponent(replaceButton)
                         .addComponent(stringButton)
                         .addComponent(setContainGapsButton)
                         .addComponent(setAutoGapsButton)
                         .addComponent(linkSizeButton)
                         .addComponent(setHonorsVisButton));
    g.setHorizontalGroup(
                         g.createSequentialGroup()
                           .addComponent(getInfoButton)
                           .addComponent(diagonalButton)
                           .addComponent(verticalButton)
                           .addComponent(horizontalButton)
                           .addComponent(replaceButton)
                           .addComponent(stringButton)
                           .addComponent(setContainGapsButton)
                           .addComponent(setAutoGapsButton)
                           .addComponent(linkSizeButton)
                           .addComponent(setHonorsVisButton));
    
    // Horizontal Layout
    horizontalButton.addActionListener (new ActionListener ()
                                          {
      public void actionPerformed (ActionEvent ae)
      {
        remove (returnButton);
        g.setVerticalGroup(
                           g.createParallelGroup()
                             .addComponent(getInfoButton)
                             .addComponent(diagonalButton)
                             .addComponent(verticalButton)
                             .addComponent(horizontalButton)
                             .addComponent(replaceButton)
                             .addComponent(stringButton)
                             .addComponent(setContainGapsButton)
                             .addComponent(setAutoGapsButton)
                             .addComponent(linkSizeButton)
                             .addComponent(setHonorsVisButton));
        g.setHorizontalGroup(
                             g.createSequentialGroup()
                               .addComponent(getInfoButton)
                               .addComponent(diagonalButton)
                               .addComponent(verticalButton)
                               .addComponent(horizontalButton)
                               .addComponent(replaceButton)
                               .addComponent(stringButton)
                               .addComponent(setContainGapsButton)
                               .addComponent(setAutoGapsButton)
                               .addComponent(linkSizeButton)
                               .addComponent(setHonorsVisButton));
        
      }
    }); 
    
    // Diagonal Layout
    diagonalButton.addActionListener (new ActionListener ()
                                        {
      public void actionPerformed (ActionEvent ae)
      {
        remove (returnButton);
        g.setVerticalGroup(
                           g.createSequentialGroup()
                             .addComponent(getInfoButton)
                             .addComponent(diagonalButton)
                             .addComponent(verticalButton)
                             .addComponent(horizontalButton)
                             .addComponent(replaceButton)
                             .addComponent(stringButton)
                             .addComponent(setContainGapsButton)
                             .addComponent(setAutoGapsButton)
                             .addComponent(linkSizeButton)
                             .addComponent(setHonorsVisButton));
        g.setHorizontalGroup(
                             g.createSequentialGroup()
                               .addComponent(getInfoButton)
                               .addComponent(diagonalButton)
                               .addComponent(verticalButton)
                               .addComponent(horizontalButton)
                               .addComponent(replaceButton)
                               .addComponent(stringButton)
                               .addComponent(setContainGapsButton)
                               .addComponent(setAutoGapsButton)
                               .addComponent(linkSizeButton)
                               .addComponent(setHonorsVisButton));
        
      }
    }); 
    
    // Vertical Layout
    verticalButton.addActionListener (new ActionListener ()
                                        {
      public void actionPerformed (ActionEvent ae)
      {
        remove (returnButton);
        g.setVerticalGroup(
                           g.createSequentialGroup()
                             .addComponent(getInfoButton)
                             .addComponent(diagonalButton)
                             .addComponent(verticalButton)
                             .addComponent(horizontalButton)
                             .addComponent(replaceButton)
                             .addComponent(stringButton)
                             .addComponent(setContainGapsButton)
                             .addComponent(setAutoGapsButton)
                             .addComponent(linkSizeButton)
                             .addComponent(setHonorsVisButton));
        g.setHorizontalGroup(
                             g.createParallelGroup()
                               .addComponent(getInfoButton)
                               .addComponent(diagonalButton)
                               .addComponent(verticalButton)
                               .addComponent(horizontalButton)
                               .addComponent(replaceButton)
                               .addComponent(stringButton)
                               .addComponent(setContainGapsButton)
                               .addComponent(setAutoGapsButton)
                               .addComponent(linkSizeButton)
                               .addComponent(setHonorsVisButton));
        
      }
    }); 
    
    // get() Methods
    getInfoButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        new JOptionPane().showMessageDialog (GroupLayoutRonald.this, "Auto Create Container Gaps Enabled: " + g.getAutoCreateContainerGaps () + "\n"
                                               + "Auto Create Component Gaps Enabled: " + g.getAutoCreateGaps () + "\n"
                                               + "Honors Component Visibility: " + g.getHonorsVisibility () + "\n"
                                               + "Horizontal Alignment: " + g.getLayoutAlignmentX(GroupLayoutRonald.this) + "\n"
                                               + "Vertical Alignment: " + g.getLayoutAlignmentY (GroupLayoutRonald.this) + "\n"
                                               + "Layout Style: " + g.getLayoutStyle () + "\n"
                                               + "Minimum Layout Size: " + g.minimumLayoutSize(GroupLayoutRonald.this).getWidth() + " by " + g.minimumLayoutSize(GroupLayoutRonald.this).getHeight() + "\n"
                                               + "Maximum Layout Size: " + g.maximumLayoutSize(GroupLayoutRonald.this).getWidth() + " by " + g.maximumLayoutSize(GroupLayoutRonald.this).getHeight() + "\n"
                                               + "Preferred Layout Size: " + g.preferredLayoutSize(GroupLayoutRonald.this).getWidth() + " by " + g.preferredLayoutSize(GroupLayoutRonald.this).getHeight() + "\n"
                                               , "About: Layout Data", JOptionPane.PLAIN_MESSAGE);
      }
    });
    
    // toString() Method
    stringButton.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        new JOptionPane().showMessageDialog (GroupLayoutRonald.this, g.toString(), "String Representation of Layout", JOptionPane.PLAIN_MESSAGE);
      }
    });
    
    
    // setAutoCreateContainerGaps() Method
    setContainGapsButton.addActionListener (new ActionListener ()
                                              {
      public void actionPerformed (ActionEvent ae)
      {
        if (g.getAutoCreateContainerGaps() == true)
          g.setAutoCreateContainerGaps (false);
        else
          g.setAutoCreateContainerGaps (true);
      }
    });
    
    // setAutoCreateGaps() Method
    setAutoGapsButton.addActionListener (new ActionListener ()
                                           {
      public void actionPerformed (ActionEvent ae)
      {
        if (g.getAutoCreateGaps() == true)
          g.setAutoCreateGaps(false);
        else
          g.setAutoCreateGaps(true);
      }
    });
    
    // setHonorsVisibility() Method
    setHonorsVisButton.addActionListener (new ActionListener ()
                                            {
      public void actionPerformed (ActionEvent ae)
      {
        if (g.getHonorsVisibility() == true)
          g.setHonorsVisibility (false);
        else
          g.setHonorsVisibility (true);
      }
    });
    
    // linkSize() Method
    linkSizeButton.addActionListener (new ActionListener ()
                                        {
      public void actionPerformed (ActionEvent ae)
      {
        g.linkSize(SwingConstants.HORIZONTAL, linkSizeButton, setHonorsVisButton, setAutoGapsButton);
      }
    });
    
    // replace() Method
    replaceButton.addActionListener (new ActionListener ()
                                       {
      public void actionPerformed (ActionEvent ae)
      {
        g.replace (replaceButton, returnButton);
      }
    });
    
    // replace() Method
    returnButton.addActionListener (new ActionListener ()
                                      {
      public void actionPerformed (ActionEvent ae)
      {
        g.replace (returnButton, replaceButton);
      }
    });
  }
}