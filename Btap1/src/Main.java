// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        NumberGen numberGen = new NumberGen(0 , "awda");
        NumberGen numberGen1 = new NumberGen(0 , "wdasd");
        Thread numberThread = new Thread(numberGen1);
        Thread numberThread1 = new Thread(numberGen);
        numberThread.setPriority(Thread.MIN_PRIORITY);
        numberThread1.setPriority(Thread.MAX_PRIORITY);
        numberThread.start();
        numberThread1.start();
        System.out.println("HashCode numberGen " + numberGen.hashCode());
        System.out.println("HashCode numberGen1 " + numberGen1.hashCode());
    }
}
