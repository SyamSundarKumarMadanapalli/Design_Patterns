package L_principle;

public class Player {
    public static void main(String[] args) {
        NonActivePlayer retired = new RetiredPlayer("Smith", 5000, 150);
        CurrentPlayer current = new CurrentPlayer("Warner", 7000,195);
        NonActivePlayer Partiallyretired = new CurrentPlayer("Kohli", 14000,250);

        retired.showStats();

        current.showStats();
        current.assignNxtMatchFixture("India vs Australia");
        System.out.println("nextFixture: "+current.getNextFixture());

        Partiallyretired.showStats();
    }
}
