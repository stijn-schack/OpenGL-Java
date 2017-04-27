package com.schackteleers.projectrpg.engine.fileio;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Stijn Schack
 * @since 27/04/2017
 */
public class FileIO {
    public static String loadShaderResource(String fileName) throws IOException {
        String shaderCode;
        try (InputStream in = FileIO.class.getClass().getResourceAsStream(fileName); Scanner scanner = new Scanner(in, "UTF-8")) {
            shaderCode = scanner.useDelimiter("\\A").next();
        }
        return shaderCode;
    }
}