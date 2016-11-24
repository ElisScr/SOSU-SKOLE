import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class representing wrong password GUI
 * @author Nadina Zukova
 * @version 1 19/05/2015
 *
 */
public class GUIWrongPassword extends JFrame
{
   private JLabel labelError;
   private ImagePanel imageError;
   private JLabel labelErrorText;
   private JButton buttonReturn;
   private JButton buttonCancel;
   private Controller controller;

   /**
   * One argument constructor
   * @param controller
   */
   
   public GUIWrongPassword(Controller controller)
   {
      super("ERROR");
      createComponents();
      initializeComponents();
      registerEvenHandlers();
      addComponentsToFrame();
      this.controller= controller;
   }

   private void createComponents()
   {
      labelError = new JLabel("Error !!!");
      imageError = new ImagePanel("error.png");
      labelErrorText = new JLabel("Wrong password!");
      labelError.setForeground(Color.RED);
      buttonReturn = new JButton("Return");
      buttonCancel = new JButton("Cancel");
   }

   private void initializeComponents()
   {
      setSize(350, 135);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void registerEvenHandlers()
   {
      actionReturn();
      actionClose();
   }

   private void addComponentsToFrame()
   {
      JPanel panelTextLabel = new JPanel(new BorderLayout());
      JPanel panelButton = new JPanel(new BorderLayout());
      panelTextLabel.add(labelError, BorderLayout.NORTH);
      panelTextLabel.add(labelErrorText, BorderLayout.CENTER);
      panelButton.add(buttonReturn, BorderLayout.EAST);
      panelButton.add(buttonCancel, BorderLayout.SOUTH);
      JPanel contentPane = new JPanel(new FlowLayout());
      contentPane.add(panelTextLabel);
      contentPane.add(imageError);
      contentPane.add(panelButton);
      JPanel mainPane = new JPanel(new BorderLayout());
      mainPane.add(contentPane, BorderLayout.CENTER);

      setContentPane(mainPane);
   }
/**
 * Event handler for button return. After click on a button, will start login GUI.
 */
   public void actionReturn()
   {
      buttonReturn.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            GUI GUI = new GUI( controller);
            GUI.setVisible(true);
            dispose();
         }
      });
   }

   /**
    * method for a button Cancel. Exits a program after a pressing on a button
    */
   public void actionClose()
   {
      buttonCancel.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            System.exit(0);
         }
      });
   }
}
