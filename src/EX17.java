public class EX17 {

    public static void main(String[] args) {
        int printNumbers = 20;
        print(printNumbers);
    }

    public static void print(int printNumber) {
        System.out.println(printNumber);
        int counter = -25;
        while (counter < printNumber) {
            System.out.println(counter);
            counter++;
        }
    }
}

