package org.example;

import org.eclipse.ui.part.ViewPart;
import edu.utexas.seal.reffinder.Application;
import org.eclipse.core.resources.IProject;

public class YourRefFinderView extends ViewPart {
    public static final String ID = "edu.utexas.seal.refdistiller2.views.RefDistillerView";

    private  IProject projOrig = "/home/leuson/Documents/projects/antlr4";

    @Override
    public void createPartControl(org.eclipse.swt.widgets.Composite composite) {
        Application refFinder = new Application();
        try {

            refFinder.myStart(projOrig, projDelta, null);
            String xmlFilePath = projDelta.getLocation().toOSString()+System.getProperty("file.separator") +"RefList.xml";
            //XmlReader xml = new XmlReader(xmlFilePath);
            //please refer to XmlReader and XMLOutput for more details
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    @Override
    public void setFocus() {

    }
}