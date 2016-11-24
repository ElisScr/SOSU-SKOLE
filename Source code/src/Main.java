import java.util.ArrayList;


public class Main
{
   public static void main(String[] args)
   {
      //generating model
      ArrayList<School> model = SchoolModelManager.GenerateSchoolsModel();
      
      //create controller
      Controller controller = new Controller( model );
  
      GUI frame = new GUI(controller);
      frame.setVisible(true);      
   }

}
