import java.util.ArrayList;

/**
 * A class representing an education.
 * @author Elis
 * @version 1.0, 26/05/2015
 */
public class Education
{
   private String name;
   private ArrayList<Topic> topicList;
   private ArrayList<SchoolClass> schoolClassList;
   
   /**
    * A three argument Constructor
    * @param name
    * @param topicList
    * @param schoolClassList
    */
   public Education( String name, ArrayList<Topic> topicList, ArrayList<SchoolClass> schoolClassList )
   {
      this.name = name;
      this.topicList = topicList;
      this.schoolClassList = schoolClassList;
   }
   
   /**
    * Getter for School Classes list
    * @return an array list of School Classes
    */
   public ArrayList<SchoolClass> getClasses()
   {
      return schoolClassList;
   }
 
   /**
    * Getter for topic list
    * @return an array list of topics
    */
   public ArrayList<Topic> getTopics()
   {
      return topicList;
   }

   /**
    * Getter for education name
    * @return a name of education
    */
   public String getName()
   {
      return name;
   }

   /**
    * Setter for education name
    * @param name
    */
   public void setName(String name)
   {
      this.name = name;
   }
   
   /**
    * Copy education
    * @return a copy of an education
    */
   public Education copy()
   {
      return new Education(name, topicList, schoolClassList);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Education))
         return false;

      Education other = (Education)obj;
      return this.name.equals(other.name)&& topicList.equals(other.topicList)&&schoolClassList.equals(other.schoolClassList);
   }

   public String toString()
   {  
      return name ;
   }
}
