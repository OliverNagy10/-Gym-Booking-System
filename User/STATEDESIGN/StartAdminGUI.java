// Author - Oliver Nagy

package USER.STATEDESIGN;

import java.io.FileNotFoundException;
import java.io.IOException;

import GUI.Factory.GUI;
import GUI.Factory.GUIFactory;

public class StartAdminGUI implements State {

    @Override
    public void enterGUI() throws FileNotFoundException, IOException {

        // factory method
        GUIFactory gui = new GUIFactory();
        GUI admin = gui.getGUI("Admin");
        admin.Create();

    }

}
