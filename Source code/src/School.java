import java.util.ArrayList;

/**
 * A class representing School
 * @author Elis and Aleksander
 * @version 1.0, 26/05/2015
 */
public class School
{
   private String name;
   private String code;
   private ArrayList<Education> educations;

   /**
    * Two argument Constructor
    * @param name
    * @param code
    */
   public School(String name, String code)
   {
      this.educations = new ArrayList<Education>();
      this.name = name;
      this.code = code;
   }

   /**
    * Add an education to a list of educations
    * @param educations
    */
   public void addEducation(Education education)
   {
      this.educations.add(education);
   }

   /**
    * Getter for education list
    * @return an array list of educations
    */
   public ArrayList<Education> getEducations()
   {
      return educations;
   }

   /**
    * Getter for index
    * @param index
    * @return an index for an education
    */
   public Education getEducation(int index)
   {
      return educations.get(index);
   }

   /**
    * Getter for School name
    * @return name of School
    */
   public String getName()
   {
      return name;
   }

   /**
    * Setter for School Name
    * @param name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Getter for School code
    * @return code
    */
   public String getCode()
   {
      return code;
   }

   /**
    * Setter for School code
    * @param code
    */
   public void setCode(String code)
   {
      this.code = code;
   }

   /**
    * Copy a School
    * @return a copy of School
    */
   public School copy()
   {
      return new School(name, code);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof School))
         return false;

      School other = (School) obj;
      return this.name.equals(other.name) && this.code.equals(other.code);
   }

   public String toString()
   {
      return "School " + name + ", code=" + code + ", education" + educations;
   }
}
