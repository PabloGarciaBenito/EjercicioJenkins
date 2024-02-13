package training.maven.quick;

import org.apache.logging.log4j.*;

public class HolaMundo{
    private final String message = "Hola Mundo";
    private static final Logger lg = LogManager.getLogger(HolaMundo.class);

    public static void main(String[] args){
        System.out.println("Hola Mundo");

        lg.debug("debug");
        lg.info("info");
        lg.warn("warning");
    }
}