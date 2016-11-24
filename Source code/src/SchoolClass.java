
/**
 * A Class representing School Class
 * @author Elis and Aleksander
 * @version 1.0, 26/05/2015
 */
public class SchoolClass
{
   private String name;

   /**
    * One argument Constructor
    * @param name
    */
   public SchoolClass(String name)
   {
      this.name = name;
   }

   /**
    * Getter for School Class name
    * @return name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Setter for School Class name
    * @param name
    */
   public void setName(String name)
   {
      this.name = name;
   }

   /**
    * Copy a School Class
    * @return a copy of School Class
    */
   public SchoolClass copy()
   {
      return new SchoolClass(name);
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof SchoolClass))
         return false;

      SchoolClass other = (SchoolClass) obj;
      return this.name.equals(other.name);
   }

   public String toString()
   {
      return name;
   }

}
