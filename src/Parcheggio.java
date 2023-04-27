import static java.lang.Thread.sleep;

public class Parcheggio {
    private int posti;
    private int posti_occupati = 0;
    private boolean tutti_occupati = false;

    public Parcheggio(int posti) {
        this.posti = posti;
    }

    public void parcheggia(Thread currentThread){
        try {
            while (tutti_occupati){
                int waitTime = (int) (Math.random() * 10000) + 1;
                System.out.println(currentThread.getName() + " gira in tondo per " + waitTime + "ms");
                wait(waitTime);
            }
            posti_occupati++;
            if(posti_occupati >= posti) {
                tutti_occupati = true;
                System.out.println("tutti_occupati = true");
            }
            int tempoParcheggio = (int) (Math.random() * 5000) + 1;
            System.out.println(currentThread.getName() + " rimarra' parcheggiato per " + tempoParcheggio + "ms");
            sleep(tempoParcheggio);
            posti_occupati--;
            if(posti_occupati < posti) {
                tutti_occupati = false;
                System.out.println("tutti_occupati = false");
            }
            notify();
        } catch (Exception ignored){

        }
    }
}