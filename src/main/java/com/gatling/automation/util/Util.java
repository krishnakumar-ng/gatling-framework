package com.gatling.automation.util;

import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Util {

    public static class Date {
        public static String getDateStringForGivenDaysBack(int days) {
            return Instant.now()
                    .truncatedTo(ChronoUnit.DAYS)
                    .minus(days, ChronoUnit.DAYS)
                    .toString()
                    .split("\\.")[0];
        }
    }

    public static class File {

        @SneakyThrows
        public static void storeDataInFile(String filePath, String data) {
            Path path = Paths.get(filePath);
            Files.write(path, data.getBytes());
        }

        @SneakyThrows
        public static String readDataFromFile(String filePath) {
            return Files.readAllLines(Paths.get(filePath)).getFirst();
        }

        @SneakyThrows
        public static void deleteFile(String filePath) {
            Files.deleteIfExists(Path.of(filePath));
        }


    }
}
