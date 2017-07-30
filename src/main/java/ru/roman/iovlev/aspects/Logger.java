package ru.roman.iovlev.aspects;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

/**
 * Created by Roman_Iovlev on 7/30/2017.
 */
public class Logger {
    public static List<String> records = new ArrayList<>();
    public static void write(String msg) {
        records.add(msg);
        out.println(format("[%s] %s", currentTimeMillis(), msg));
    }
    public static void clear() { records.clear(); }
}
