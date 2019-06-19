package com.corp;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Logging {
    private static final Logger LOG = LogManager.getLogger(Logging.class);
    public static void main(String[] a) throws FileNotFoundException {
    //    System.getProperty("");
        LOG.debug("this is debug message");
        LOG.info("this is info message");
        LOG.warn("this is warn message");
        LOG.error("this is error message");
        LOG.fatal("this is fatal message");

        FileOutputStream fous=new FileOutputStream(new File("fike.txt"));

    }
}
