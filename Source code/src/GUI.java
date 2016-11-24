import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 * A class representing GUI (for login)
 * @author Nadina Zukova 
 * @version 1.2 20/05/2015
 */
public class GUI extends JFrame
{
   private JLabel labelLogin;
   private JComboBox<String> comboBoxUserName;
   private JTextField textFieldPassword;
   private JLabel labelTextUserName;
   private JLabel labelTextPassword;
   private JButton buttonOk;
   private JButton buttonCancel;
   private Controller controller;

   /**
    * One argument constructor
    * 
    * @param controller
    */
   public GUI(Controller controller)
   {
      super("Login:");
      this.controller = controller;
      createComponents();
      initializeComponents();
      registerEvenHandlers();
      addComponentsToFrame();
      setVisible(true);
   }

   private void createComponents()
   {
      labelLogin = new JLabel("Login ");
      labelTextUserName = new JLabel("Shool code:");
      labelTextPassword = new JLabel("Enter password:");

      String[] schoolnames;
      schoolnames = new String[controller.getNumberOfSchools()];

      for (int i = 0; i < controller.getNumberOfSchools(); i++)
      {
         schoolnames[i] = controller.getSchoolByIndex(i).toString();
      }

      comboBoxUserName = new JComboBox<>(schoolnames); // creating ComboBox with a schoolnames
      textFieldPassword = new JTextField(5);
      buttonOk = new JButton("OK");
      buttonCancel = new JButton("Cancel");
   }

   private void initializeComponents()
   {
      setSize(550, 150);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      comboBoxUserName.setSelectedItem(null);
      textFieldPassword.setText("");
   }

   private void registerEvenHandlers()
   {
      actionLogin();
      actionClose();
   }

   /**
    * method for a button Close. Exits a programm after a pressing on a button
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

   public void startGUI(Controller controller)
   {
      this.controller = controller;
   }

   private void addComponentsToFrame()
   {
      JPanel panelTextLabel = new JPanel(new BorderLayout());
      JPanel panelCenter = new JPanel(new BorderLayout());
      JPanel panelButton = new JPanel(new BorderLayout());

      panelTextLabel.add(labelTextUserName, BorderLayout.NORTH);
      panelTextLabel.add(labelTextPassword, BorderLayout.SOUTH);

      panelCenter.add(comboBoxUserName, BorderLayout.NORTH);
      panelCenter.add(textFieldPassword, BorderLayout.SOUTH);

      panelButton.add(buttonOk, BorderLayout.EAST);
      panelButton.add(buttonCancel, BorderLayout.SOUTH);

      JPanel contentPane = new JPanel(new FlowLayout());
      contentPane.add(panelTextLabel);
      contentPane.add(panelCenter);
      contentPane.add(panelButton);

      JPanel mainPane = new JPanel(new BorderLayout());

      mainPane.add(contentPane, BorderLayout.CENTER);
      mainPane.add(labelLogin, BorderLayout.NORTH);

      setContentPane(mainPane);
   }

   /**
    * method for login. Passes the username (school name) to constructor for
    * ExamGUI som argument. If password is wrong, starts WrongPASSword GUI
    */
   public void actionLogin()
   {
      buttonOk.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            if (comboBoxUserName.getSelectedIndex() != -1)
            {
               String userName = (String) comboBoxUserName.getSelectedItem();
               String password = textFieldPassword.getText();

               if (userName.equals("SOSU Nord") && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName
                     .equals("Social-og Sundhedsskolen Skive, Thisted, Viborg")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Randers Social-og Sundhedsskole")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Aarhus Social-og Sudhedsskole")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Social-og Sudhedsskolen, Silkeborg")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Social-og Sudhedsskolen, Herning")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName
                     .equals("Social-og Sudhedsskolen, Frederecia, Horsens")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Social-og Sudhedsskolen, Esbjerg")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Social-og Sudhedsskolen Syd")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Social-og Sudhedsskolen Fyn")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Bornholms Sudheds-og Sygeplejeskole")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("Heilsuskull Føroya")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("SOPU København og Nordsjælland")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName
                     .equals("UC Diakonissen Social-og Sudhedsskole")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName
                     .equals("SOSU C Social-og Sudhedsuddannelses Centret")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("SOSU Sjælland")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else if (userName.equals("SOSU Nykøbing F.")
                     && password.equals("1"))
               {
                  ExamGUI ExamGUI = new ExamGUI(userName, controller);
                  ExamGUI.setVisible(true);
                  dispose();
               }

               else
               {
                  GUIWrongPassword GUIWrongPassword = new GUIWrongPassword(
                        controller);
                  GUIWrongPassword.setVisible(true);
                  dispose();
               }
            }
         }
      });
   }
}
