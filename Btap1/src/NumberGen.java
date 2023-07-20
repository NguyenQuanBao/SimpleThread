public class NumberGen implements Runnable {
int number = 1;
String lt = "ldanwd";

    public NumberGen(int number, String lt) {
        this.number = number;
        this.lt = lt;
    }

    @Override
    public void run() {
        for ( int i = 1 ; i <=10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" mức độ ưu tiên Thread hiện tại " + Thread.currentThread().getPriority() );
    }
}
