package hooks;

import BasePac.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;

import static DriverFactory.Driverfactory.initialize_browser;


public class hooksClass extends base {



    @Before
    public static void start() throws IOException {
        initialize_browser();
        maximize();
    }
    @After
    public static void end() throws InterruptedException {
        quit();
    }
}
