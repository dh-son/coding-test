package binaryGap;

public class BinaryGap {

    public int calculatorBinaryGap(int number) {

        String binary = Integer.toBinaryString(number);

        String[] values = binary.split("1");

        int count = 1;
        int length;
        int result = 0;

        for (String value : values) {

            length = value.length();

            if (count == values.length && isLastOne(binary)) {
                length = 0;
            }

            result = Math.max(result, length);
            count++;
        }

        System.out.println("=====> binary: " + binary);
        System.out.println("=====> result: " + result);

        return result;
    }

    private boolean isLastOne(String str) {

        return str.charAt(str.length() - 1) != '1';
    }
}
