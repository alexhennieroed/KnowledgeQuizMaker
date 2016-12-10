package main.java.controller;

import main.java.fxapp.FXApp;

/**
 * Basic superclass to work with screen controllers
 */
public class Controller {

    protected FXApp mainApp;

    /**
     * Sets the main app being used by this controller
     * @param app the main app being used
     */
    public void setMainApp(FXApp app) {
        this.mainApp = app;
    }

}
