// Q1) Create 2 threads in which one will print numbers from 1 to 10 and 
// sencond will print same in reverse order

public class Q1 {
    static class threadA extends Thread{
        public void run(){
            for(int i=1; i<=10; i++){
                System.out.println(i + " A");
            }
        }
    }

    static class threadB extends Thread{
        public void run(){
            for(int i=10; i>=1; i--){
                System.out.println(i + " B");
            }
        }
    }
    public static void main(String[] args) {
        threadA t1 = new threadA();
        threadB t2 = new threadB();
        t1.start();
        t2.start();
    }
}
