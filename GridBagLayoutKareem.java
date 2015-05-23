import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/* The "GridBagLayoutKareem" class provides an example of the GridBagLayout layout manager; it demonstrates
 * the various fields and methods featured in this layout. GridBagLayout organizes components in a dynamic
 * grid structure where each component occupies a cell-like space.
 * 
 * @author Kareem Golaub
 * @author Ronald Perlas
 * @version 2.0 February 24 2014
 */
public class GridBagLayoutKareem extends JPanel implements ActionListener
{
  /*
   * g Reference Refrences the GridBagLayout class and makes its methods and features available.
   */
  GridBagLayout g = new GridBagLayout();
  /*
   * topRow Reference Refrences the GridBagConstraints class and makes its methods and features available.
   */
  GridBagConstraints topRow = new GridBagConstraints();
  /*
   * moveColumn Reference Refrences the "Move Over" JButton.
   */
  JButton moveColumn = new JButton("Move Over");
  /*
   * growWidth Reference Refrences the "Grow Horizontal Container" JButton.
   */
  JButton growWidth = new JButton("Grow Horizontal Container!");
  /*
   * growHeight Reference Refrences the "Grow Vertical Container" JButton.
   */
  JButton growHeight = new JButton("Grow Vertical Container!");
  /*
   * horizontal Reference Refrences the "Unfill Horizontal" JButton.
   */
  JButton horizontal = new JButton("Unfill Horizontal");
  /*
   * vertical Reference Refrences the "Unfill Vertical" JButton.
   */
  JButton vertical = new JButton("Unfill Vertical");
  /*
   * move Integer Creates a new integer to store movement and initializes it to zero.
   */
  int move = 0;
  /*
   * width Integer Creates a new integer to store width and initializes it to zero.
   */
  int width = 0;
  /*
   * height Integer Creates a new integer to store height and initializes it to zero.
   */
  int height = 0;
  
  /*
   * This constructor sets the layout of the JPanel, fills the GridBagConstraints and
   * executes the buttons() method.
   */
  public GridBagLayoutKareem()
  {
    setLayout(g);
    topRow.fill = GridBagConstraints.BOTH;
    buttons();
  }
  
  /*
   * This method sets the dimensions of the GridBagLayout, sets the horizontal and vertical
   * constraints and adds the buttons to the JPanel.
   */
  public void buttons()
  {
    removeAll();
    
    topRow.gridwidth = 1;
    topRow.gridheight = 1;
    topRow.weightx = 0.5;
    topRow.gridx = 0+move;
    topRow.gridy = 0;
    add (moveColumn, topRow);
    
    topRow.gridheight = 1+height;
    topRow.gridx = 2;
    topRow.gridy = 2-height;
    add (growHeight, topRow);
    
    topRow.gridheight = 1;
    topRow.gridwidth = 1+width;
    topRow.gridx = 0;
    topRow.gridy = 1;
    add (growWidth, topRow);
    
    topRow.gridwidth = 1;
    topRow.gridx = 1;
    topRow.gridy = 2;
    add(horizontal, topRow);
    
    topRow.gridx = 3;
    topRow.gridy = 2;
    add(vertical, topRow);
    
    moveColumn.addActionListener(this);
    growWidth.addActionListener(this);
    growHeight.addActionListener(this);
    vertical.addActionListener(this);
    horizontal.addActionListener(this);
    
    setLayout(g);
    validate();
    repaint();
  }
  
  /*
   * This method responds to ActionEvents when the buttons are clicked and executes the relevant actions.
   * This method performs the appropriate action when the "Move Over", "Grow Horizontal Container", 
   * "Grow Vertical Container", "Fill Vertical", "Fill Horizontal" and their opposite buttons are invoked.
   * 
   * @param horizontalTruth Boolean Stores the horizontal settings, initialized to true.
   * @param verticalTruth Boolean Stores the verticals settings, initialized to true.
   * @param ae ActionEvent Stores the action command.
   */
  public void actionPerformed (ActionEvent ae) 
  {
    Boolean horizontalTruth = true;
    Boolean verticalTruth = true;
    
    if (ae.getActionCommand().equals("Move Over"))
    {
      move = 1;
      moveColumn.setText("Move Back");
    }
    else if (ae.getActionCommand().equals("Move Back"))
    {
      move = 0;
      moveColumn.setText("Move Over");
    }
    else if (ae.getActionCommand().equals("Grow Horizontal Container!"))
    {
      width = 1;
      growWidth.setText("Shrink Horizontal Container!");
    }
    else if (ae.getActionCommand().equals("Shrink Horizontal Container!"))
    {
      width = 0;
      growWidth.setText("Grow Horizontal Container!");
    }
    else if (ae.getActionCommand().equals("Shrink Vertical Container!"))
    {
      height = 0;
      growHeight.setText("Grow Vertical Container!");
    }
    else if (ae.getActionCommand().equals("Grow Vertical Container!"))
    {
      height = 1;
      growHeight.setText("Shrink Vertical Container!");
    }
    else if (ae.getActionCommand().equals("Fill Vertical"))
    {
      verticalTruth = true;
      if (!horizontalTruth)
        topRow.fill = GridBagConstraints.VERTICAL;
      else
        topRow.fill = GridBagConstraints.BOTH;
      vertical.setText("Unfill Vertical");
    }
    else if (ae.getActionCommand().equals("Unfill Vertical"))
    {
      verticalTruth = false;
      if (!horizontalTruth)
        topRow.fill = GridBagConstraints.NONE;
      else
        topRow.fill = GridBagConstraints.HORIZONTAL;
      vertical.setText("Fill Vertical");
    }
    else if (ae.getActionCommand().equals("Fill Horizontal"))
    {
      horizontalTruth = true;
      if (!verticalTruth)
        topRow.fill = GridBagConstraints.HORIZONTAL;
      else
        topRow.fill = GridBagConstraints.BOTH;
      horizontal.setText("Unfill Horizontal");
    }
    else 
    {
      horizontalTruth = false;
      if (!verticalTruth)
        topRow.fill = GridBagConstraints.NONE;
      else
        topRow.fill = GridBagConstraints.VERTICAL;
      horizontal.setText("Fill Horizontal");
    }
    buttons();
  }
  
}