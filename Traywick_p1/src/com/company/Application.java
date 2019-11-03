package com.company;

import java.io.IOException;

public class Application {
    public static void main(String args[]) throws IOException {
        DuplicateRemover remover = new DuplicateRemover();

        remover.remove("problem1.txt");
        remover.Write("unique_words.txt");

    }

}
