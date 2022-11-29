// Author - Oliver Nagy
/* Concrete State
 * 
 * 
 */
package GUI.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.FACTORY.GUI;
import GUI.FACTORY.GUIFactory;

public class StartAdminGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {
        // We decided to use Factory method here
        GUIFactory gui = new GUIFactory();
        GUI admin = gui.getGUI("Admin");
        admin.Create();

    }

}