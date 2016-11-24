import java.util.ArrayList;

/**
 * A class representing an Exam
 * @author Elis
 * @version 1.0, 26/05/2015
 */
public class Exam
{
   private Date date;
   private Topic topic;
   private SchoolClass schoolClass;
   private Education education;

   /**
    * Four argument Constructor 
    * @param date
    * @param education
    * @param schoolClass
    * @param topic
    */
   public Exam(Date date, Education education, SchoolClass schoolClass, Topic topic)
   {
      this.date = date.copy();
      this.education = education;
      this.schoolClass = schoolClass;
      this.topic = topic;
   }

   /**
    * Setter for School Class
    * @param schoolClass
    */
   public void setSchoolClass(SchoolClass schoolClass)
   {
      this.schoolClass = schoolClass;
   }

   /**
    * Getter for School Classes list by education
    * @return an array list of School Classes by education
    */
   public ArrayList<SchoolClass> getSchoolClass()
   {
      return education.getClasses();
   }

   /**
    * Getter for date
    * @return date
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * Setter for date
    * @param date
    */
   public void setDate(Date date)
   {
      this.date = date.copy();
   }

   /**
    * Getter for education
    * @return education
    */
   public Education getEducation()
   {
      return education;
   }

   /**
    * Setter for education
    * @param education
    */
   public void setEducation(Education education)
   {
      this.education = education;
   }

   /**
    * Getter for topic
    * @return topic
    */
   public Topic getTopic()
   {
      return topic;
   }

   /**
    * Setter for topic
    * @param topic
    */
   public void setTopic(Topic topic)
   {
      this.topic = topic;
   }

   public String toString()
   {
      return date + ", Education " + education + " , School Class "
            + schoolClass + ", Chosen Topic " + topic;
   }

}
