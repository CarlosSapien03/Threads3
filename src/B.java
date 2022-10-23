public class B implements Runnable{
    private int depa1;
    private int depa2;
    private int depa3;
    private int depa4;
    public B(int r1, int r2, int r3,int r4){
        depa1 = r1;
        depa2 = r2;
        depa3 = r3;
        depa4 = r4;

        int total;
        int r3_1;
        int r3_2;
        int r3_3;
        int r3_4;

        total = depa1 + depa2 + depa3 + depa4;
        r3_1 = depa1 * 360 / total;
        r3_2 = depa2 * 360 / total;
        r3_3 = depa3 * 360 / total;
        r3_4 = (360 - r3_1 - r3_2 - r3_3);
        C angs = new C(r3_1, r3_2, r3_3, r3_4);
    }
    @Override
    public void run() {
        System.out.println("-RUN-");
        System.out.println(Thread.currentThread().getName() + " d1:" + depa1);
        System.out.println(Thread.currentThread().getName() + " d2:" + depa2);
        System.out.println(Thread.currentThread().getName() + " d3:" + depa3);
        System.out.println(Thread.currentThread().getName() + " d4:" + depa4);

    }
}