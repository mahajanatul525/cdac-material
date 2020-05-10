package mypack;

import java.util.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.*;
import javax.faces.event.ActionEvent;

@ManagedBean(name="accbean")
@SessionScoped
public class ActionBean
{
 
  String buttonText = "Disable";

  public String getButtonText() {
    return buttonText;
  }

  public void setButtonText(String buttonText) {
    this.buttonText = buttonText;
  }

  /* Action listener method */
  public void processMyAction(ActionEvent event)
  {
    if (buttonText.equals("Disable"))
    {
      buttonText = "Enable";
      System.out.println("buttonText: " + buttonText);
    }
    else
    {
      buttonText = "Disable";
      System.out.println("buttonText: " + buttonText);
    }
  }
} 
