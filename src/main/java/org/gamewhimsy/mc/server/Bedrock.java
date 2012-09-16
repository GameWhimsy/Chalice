package org.gamewhimsy.mc.server;

import java.io.IOException;

import jline.TerminalFactory;
import jline.console.ConsoleReader;

/**
 * Main class.
 *
 * Copyright (c) 2012 Tulonsae.
 */
public class Bedrock {

    private static final String copyright = "Copyright (c) 2012 Tulonsae.";
    private static final String license = "MIT-style license.";

    private static final String prompt = "Bedrock> ";

    /**
     * Main entry.
     *
     * @param args Arguments (unused).
     */
    public static void main(String[] args) {
        try {
            ConsoleReader console = new ConsoleReader();
            console.setPrompt(prompt);
            String line = null;
            while ((line = console.readLine()) != null) {
                console.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                TerminalFactory.get().restore();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
