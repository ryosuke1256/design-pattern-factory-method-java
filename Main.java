public class Main {
    public static void main(String[] args) {
        ACounter visitCounter = new VisitCounter();
        visitCounter.explain();
        ACounter virtualCounter = new VirtualCounter();
        virtualCounter.explain();
    }
}