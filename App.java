public class App {
    public static void main(String[] args) throws Exception {
        Motor m1, m2;
        m1 = new Motor(5);
        m2 = m1;
        m2.setCapacitate(10);
        m1.tipareste();
    }
}
//se va afisa "Motor de capacitate 10" 