import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * A class representing GUI for exam generation.
 * 
 * @author Nadina Zukova, Aleksander Keremidarov 
 * @version 5, 26/5/2015
 */
public class ExamGUI extends JFrame
{
   private String userName;
   private JLabel labelSchoolName;
   private JLabel InputDateLabel;
   private JTextField inputDate;
   private JLabel chooseEducation;
   private JComboBox<String> comboBoxEducation;
   private JButton showTopics;
   private JLabel chooseClasses;
   private JComboBox<String> comboBoxClasses;
   private TextArea clas_topics;
   private JButton generateExam;
   private TextArea examResult;
   private JButton buttonQuit;
   private JButton buttonClear;
   private Controller controller;

   /**
    * Two-arguments constructor. Username is passed from GUI with - that is SOSU School name. 
    * 
    * @param userName
    * @param controller
    */

   public ExamGUI(String userName, Controller controller)
   {
      super("Exam:");
      this.controller = controller;
      this.userName = userName;
      createComponents();
      initializeComponents();
      registerEvenHandlers();
      addComponentsToFrame();
   }

   private void createComponents()
   {
      labelSchoolName = new JLabel("School");
      InputDateLabel = new JLabel("Please input exam date: ");
      inputDate = new JTextField(20);
      chooseEducation = new JLabel("Please select the education:");
      // creating ComboBOX Educations
      String[] educationNames;
      educationNames = new String[controller.getNumberOfEducations(userName)];
      ArrayList<Education> ex = controller.getEducationBySchool(userName);

      for (int i = 0; i < controller.getNumberOfEducations(userName); i++)
      {
         educationNames[i] = ex.get(i).toString();
      }
      comboBoxEducation = new JComboBox<>(educationNames);

      // creating ComboBox Classes
      chooseClasses = new JLabel("Please select the class:");
      comboBoxClasses = new JComboBox<>(); // empty drop-down menu
      showTopics = new JButton("Show topics");
      clas_topics = new TextArea(11, 35);
      generateExam = new JButton("Generate EXAM");
      examResult = new TextArea(11, 60);
      buttonQuit = new JButton("QUIT");
      buttonClear = new JButton("Clear");
   }

   private void initializeComponents()
   {
      setSize(865, 445);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      inputDate.setText("");
      comboBoxEducation.setSelectedItem(null);
      comboBoxClasses.setSelectedItem(null);
      labelSchoolName.setText(userName);
      labelSchoolName.setAlignmentX(LEFT_ALIGNMENT);
      labelSchoolName.setForeground(Color.BLUE);
      clas_topics.setText("NO TOPICS TO SHOW");
      clas_topics.setEditable(false);
      clas_topics.setForeground(Color.RED);
      examResult.setText("NO EXAM CHOOSEN");
      examResult.setForeground(Color.RED);
      examResult.setEditable(false);
   }

   private void registerEvenHandlers()
   {
      quit();
      clear();
      showTopics();
      generateExam();
   }

   /**
    * Method for generate random Exam. Reads String from the ComboBox Education
    * and ComboBox Classes, reads String from Date text field, generates random
    * Exam from topics for chosen education
    */
   public void generateExam()
   {
      generateExam.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ee)
         {
            if (comboBoxEducation.getSelectedIndex() != -1)
            {
               String educationName = (String) comboBoxEducation
                     .getSelectedItem();
               String clasName = (String) comboBoxClasses.getSelectedItem();
               String date = inputDate.getText();
               examResult.setText(controller.getRandomExam(userName,
                     educationName, date, clasName).toString());
               examResult.setForeground(Color.BLACK);
            }
         }
      });
   }

   /**
    * ActionListener for button Show Topics. Generates topics for chosen
    * education from the ComboBox Education. Generated topics appears on a
    * textField clas_topics, font color black. In the same time activate
    * comboBox Classes, what is empty until button ShowTopics is pressed.
    */
   public void showTopics()
   {
      showTopics.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ee)
         {
            if (comboBoxEducation.getSelectedIndex() != -1)
            {
               String educationName = (String) comboBoxEducation
                     .getSelectedItem();
               String topicsText = "";

               for (int i = 0; i < controller.getTopicByEducation(userName,
                     educationName).size(); i++)
               {
                  topicsText += controller
                        .getTopicByEducation(userName, educationName).get(i)
                        .toString()
                        + "\n";
               }
               clas_topics.setText(topicsText);
               clas_topics.setForeground(Color.BLACK);
               showClassNames();
            }
         }
      });
   }

   /**
    * Method to show class names for chosen education. Reads String from
    * comboBox Education, converts it to Education name and shows classes for
    * that education.
    */
   public void showClassNames()
   {
      comboBoxClasses.removeAllItems();
      String educationName = (String) comboBoxEducation.getSelectedItem();
      ArrayList<SchoolClass> cl = controller.getSchoolClassByEducation(
            userName, educationName);

      for (int j = 0; j < cl.size(); j++)
      {
         comboBoxClasses.addItem(cl.get(j).toString());
      }
   }

   /**
    * Clears all entered/chosen data from forms and text areas and Date field.
    * Writes "No topics" and "No EXAM" on text areas for topics and exam.
    */
   public void clear() // stay log in the same school, but can choose
                        // education and classes again
   {
      buttonClear.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ee)
         {
            inputDate.setText("");
            comboBoxEducation.setSelectedItem(null);
            comboBoxClasses.removeAllItems();
            examResult.setText("NO EXAM CHOOSEN");
            examResult.setForeground(Color.RED);
            clas_topics.setText("NO TOPICS TO SHOW");
            clas_topics.setForeground(Color.red);
         }
      });
   }
/**
 * Action for button Quit. Closes GUI window and exit form program.
 */
   public void quit()
   {
      buttonQuit.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent ae)
         {
            System.exit(0);
         }
      });
   }

   private void addComponentsToFrame()
   {
      JPanel panelDate = new JPanel(new FlowLayout());
      panelDate.add(InputDateLabel);
      panelDate.add(inputDate);
      JPanel tablePane1 = new JPanel(new FlowLayout());
      tablePane1.add(chooseEducation);
      tablePane1.add(comboBoxEducation);
      JPanel middlPane1 = new JPanel(new FlowLayout());
      middlPane1.add(showTopics);
      JPanel tablePane2 = new JPanel(new FlowLayout());
      tablePane2.add(chooseClasses);
      tablePane2.add(comboBoxClasses);
      tablePane2.add(panelDate);
      JPanel tablePane3 = new JPanel(new FlowLayout());
      tablePane3.add(clas_topics);
      tablePane3.add(examResult);
      tablePane3.add(generateExam);
      JPanel bottomPanel = new JPanel(new FlowLayout());
      bottomPanel.add(buttonClear);
      bottomPanel.add(buttonQuit);
      JPanel topContentPane = new JPanel(new BorderLayout());
      topContentPane.add(tablePane1, BorderLayout.EAST);
      topContentPane.add(middlPane1, BorderLayout.SOUTH);
      JPanel downContentPane = new JPanel(new BorderLayout());
      downContentPane.add(tablePane3, BorderLayout.WEST);
      downContentPane.add(bottomPanel, BorderLayout.SOUTH);

      JPanel mainPane = new JPanel(new FlowLayout());
      mainPane.add(labelSchoolName);
      mainPane.add(topContentPane);
      mainPane.add(tablePane2);
      mainPane.add(downContentPane);

      setContentPane(mainPane);
   }
}