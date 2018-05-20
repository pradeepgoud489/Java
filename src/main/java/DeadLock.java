public class DeadLock {

    public static void method1(){
        synchronized (String.class){
            System.out.println("String.class object is locked");
        }

        synchronized (Integer.class){
            System.out.println("Integer.class object is locked");
        }
    }

    public static  void method2(){
        synchronized (Integer.class){
            System.out.println("Integer.class object is locked");
        }synchronized (String.class){
            System.out.println("String.class object is locked");
        }
    }

    public static void main(String[] args) {
        method1();
        method2();
    }
}
