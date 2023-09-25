package binaryGap;

public class Main {
    public static void main(String[] args) {

        String temp = "11100";

        String[] values = temp.split("1");

        for (String value : values) {
            System.out.println(value);
        }

    }
}