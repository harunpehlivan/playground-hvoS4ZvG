package com.yourself.exoPart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by richard on 27/03/2018.
 */
public class libUtil {
   public static boolean existsInFile(String str, File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        try {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().contains(str))
                    return true;
            }
            return false;
        } finally {
            scanner.close();
        }
    }
}
