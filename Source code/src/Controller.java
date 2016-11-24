import java.util.ArrayList;

/**
 * This class are connecting the information from GUI part with the Model 
 * The methods are called in the GUI part
 *@author Elis
 *@version 1.0, 26/05/2015
 */

public class Controller
{
   private ArrayList<School> schools;
   /**
    * This constructor are as argument a list of schools
    * 
    * @param a list of schools
    */

   public Controller(ArrayList<School> schools)
   {
      this.schools = schools;
   }
   /** 
    *   This method are taking information from GUI area (School name, education name, and a date)
    *   and a list of topics by education. 
    *   This method are going through the topic list size and choose randomly a topic index.
    *   At the end the chosen topic is the topic that belong to that specific index.
    *   
    * @param schoolName
    * @param educationName
    * @param dateName
    * @param schoolClass
    * @return a String that included a School name got from GUI, an education name from GUI area,
    * a date also from GUI and the Chosen topic
    */
   public String getRandomExam(String schoolName, String educationName, String dateName, String schoolClass)
   {
      // get a list of all topics
      ArrayList<Topic> topics = getTopicByEducation(schoolName, educationName);

      // get a random topic
      int index = (int) (Math.random() * topics.size());
      Topic chosenTopic = topics.get(index);

      // return exam string
      return schoolName +"\n" + " Education: " + educationName +"\n"+ " Class: " + schoolClass + "\n"
      + " topic to Exam: "+ chosenTopic+ "\n" + " Exam Date: "  + dateName;
   }
/**
 *The number of Schools (size)
 *
 * @return the total number of schools, the size.
 */
   public int getNumberOfSchools()
   {
      return schools.size();
   }
/**
 * Getting School name by index
 * 
 * @param index
 * @return the school name that belong to the index 
 */
   public String getSchoolByIndex(int index)
   {
      String SchoolName = null;
      for (int i = 0; i < getNumberOfSchools(); i++)
      {
         if (index == i)
         {
            SchoolName = schools.get(i).getName();
         }
      }
      return SchoolName;
   }
/**
 * Getting School code by index
 * 
 * @param index
 * @return the school code that belong to the index
 */
   public String getSchoolByCode(int index)
   {
      String SchoolCode = null;
      for (int i = 0; i < getNumberOfSchools(); i++)
      {
         if (index == i)
         {
            SchoolCode = schools.get(i).getCode();
         }

      }
      return SchoolCode;
   }

   /**
    * Getter for all the education by School
    * 
    * @param schoolName
    * @return an array list of education by school name
    */
   public ArrayList<Education> getEducationBySchool(String schoolName)
   {
      int index = getSchoolIndexBySchoolName(schoolName);
      ArrayList<Education> tmp = schools.get(index).getEducations();
      return tmp;
   }

   /**
    * Getter for all the topics by education and by School
    * 
    * @param schoolName
    * @param educationName
    * @return an array list of topics by education and by school
    */
   public ArrayList<Topic> getTopicByEducation(String schoolName, String educationName)
   {
      int index = getEducationIndexByEducationName(schoolName, educationName);
      ArrayList<Topic> tmp = getEducationBySchool(schoolName).get(index)
            .getTopics();
      return tmp;
   }
   
/**
 * Getter for all the School Classes by education and by School
 * @param schoolName
 * @param educationName
 * @return an array list of school classes by education and by school
 */
   public ArrayList<SchoolClass> getSchoolClassByEducation(String schoolName, String educationName)
   {
      int index = getEducationIndexByEducationName(schoolName, educationName);
      ArrayList<SchoolClass> tmp = getEducationBySchool(schoolName).get(index)
            .getClasses();
      return tmp;
   }

   /**
    * Getter for School index by School name
    * Are going through the size of School list and comparing the School name with all the School name from the list
    * If they are equals are breaking the method returning the index.
    * @param schoolName
    * @return school index by school name
    */
   private int getSchoolIndexBySchoolName(String schoolName)
   {
      int index = -1;
      for (int i = 0; i < schools.size(); i++)
      {
         if (schools.get(i).getName().equals(schoolName))
         {
            index = i;
            break;
         }
      }
      return index;
   }

   /**
    * Getter for size of education list by school
    * @param schoolName
    * @return the size of education list
    */
   public int getNumberOfEducations(String schoolName)
   {
      int tmp = getEducationBySchool(schoolName).size();
      return tmp;
   }

   /**
    * Getter for education index by education name
    * Are going through the size of School list and comparing the School name with all the School name from the list
    * If they are equals are breaking the method returning the index.
    * @param schoolName
    * @param educationName
    * @return education index by education name
    */
   private int getEducationIndexByEducationName(String schoolName,
         String educationName)
   {
      int index = -1;
      for (int i = 0; i < getEducationBySchool(schoolName).size(); i++)
      {
         if (getEducationBySchool(schoolName).get(i).getName()
               .equals(educationName))
         {
            index = i;
            break;
         }
      }
      return index;
   }

   /**
    * Getter for size of topic list
    * @param schoolName
    * @param educationName
    * @return the numbers of topics by education and by school name (size)
    */
   public int getNumberOfTopics(String schoolName, String educationName)
   {
      int tmp = getTopicByEducation(schoolName, educationName).size();
      return tmp;
   }

   /**
    * Getter for list of School Classes by education and School name
    * @param schoolName
    * @param educationName
    * @return an array list of school classes by education and school name
    */
   public int getNumberOfSchoolClass(String schoolName, String educationName)
   {
      int tmp = getSchoolClassByEducation(schoolName, educationName).size();
      return tmp;
   }

   public String toString()
   {
      int index = 0;
      return schools.get(index).toString();
   }

}