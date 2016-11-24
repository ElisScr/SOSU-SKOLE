import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{
  private ImageIcon imageIcon;

  public ImagePanel(String imagePath)
  {
    imageIcon = new ImageIcon(imagePath);
 
    addComponentsToPanel();
  }
  public ImagePanel(String imagePath, MouseListener listener)
  {
    this(imagePath);
    registerListener(listener);
  }

  private void addComponentsToPanel()
  {
    JLabel imageLabel = new JLabel(imageIcon);
    add(imageLabel);
  }

  private void registerListener(MouseListener listener)
  {
    if (listener == null)
      return;
    addMouseListener(listener);
  }

}
