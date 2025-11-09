
package edu.ifsc.vendas.console;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public final class ConsoleUnix implements Console {

    private final InputStream input;

    private final OutputStream output;

    public ConsoleUnix() {
        this(System.in, System.out);
    }


    public ConsoleUnix(final InputStream npt, final OutputStream tpt) {
        this.input = npt;
        this.output = tpt;
    }

    @Override
    public void limpar() {
        try {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void escrever(final String message) {
        new PrintStream(this.output).print(message);
    }

   @Override
    public String ler() {
        return new Scanner(this.input).nextLine();
    }
}
