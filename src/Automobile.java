public class Automobile extends Thread{
    private Parcheggio p;

    public Automobile(String name, Parcheggio p) {
        super(name);
        this.p = p;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " cerca parcheggio");
        p.parcheggia(Thread.currentThread());
        System.out.println(Thread.currentThread().getName() + " è ripartito");
    }
}
