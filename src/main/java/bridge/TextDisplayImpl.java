package bridge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextDisplayImpl extends DisplayImpl {

    private String fileName;

    public TextDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawPrint() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            for (int i = 1; (line = br.readLine()) != null; i++) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
