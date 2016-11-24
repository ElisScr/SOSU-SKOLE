
/**
 * A class representing a Topic
 * @author Elis and Lilian
 * @version 1.0, 26/05/2015
 */
public class Topic
{
   private String name;
   
   /**
    * One argument Constructor
    * @param name
    */
   public Topic( String name )
   {
      this.name = name;
   }

   /**
    * Getter for Topic name
    * @return name
    */
   public String getName()
   {
      return name;
   }

   /**
    * Setter for Topic name
    * @param name
    */
   public void setName(String name)
   {
      this.name = name;
   }

 
   public String toString()
   {
      return  name ;
   }
}
