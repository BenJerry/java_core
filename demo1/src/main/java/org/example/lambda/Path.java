package org.example.lambda;

import java.nio.file.FileSystems;


public interface Path {

    public static java.nio.file.Path get(String first, String ... more) {
        return FileSystems.getDefault().getPath(first, more);
    }

}
