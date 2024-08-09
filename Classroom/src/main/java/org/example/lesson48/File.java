package org.example.lesson48;

import java.io.*;

public class File {
    public static final String RESOURCE = "src/lesson48/recources/";

    public static void main(String[] args) {

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(RESOURCE + "numbers.txt"))) {
            for (int i = 1; i <= 10; i++) {
                String number = i + "\n";
                bos.write(number.getBytes());
            }

        } catch (IOException e){
            System.out.println("Xəta baş verdi: " + e.getMessage());
        }
        int sum = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("numbers.txt"))) {
            StringBuilder sb = new StringBuilder();
            int ch;
            while ((ch = bis.read()) != -1) {
                if (ch == '\n') {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append((char) ch);
                }
            }

            if (sb.length() > 0) {
                sum += Integer.parseInt(sb.toString());
            }
        } catch (IOException e) {
            System.out.println("Oxuma zamanı xəta baş verdi: " + e.getMessage());
        }

        System.out.println("Toplam: " + sum);

    }
}