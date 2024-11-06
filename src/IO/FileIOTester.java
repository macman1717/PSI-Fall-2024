package IO;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class FileIOTester {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        File file = new File("src/IO/data.txt");

        for(String line : lines) {
            System.out.println(line);
        }

    }


}
