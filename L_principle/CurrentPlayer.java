package L_principle;

class CurrentPlayer implements ActivePlayer {
    private String name;
    private String nextFixture;
    private int runs;
    private int matches;

    public CurrentPlayer(String name, int runs, int matches) {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    @Override
    public void assignNxtMatchFixture(String fixture) {
        this.nextFixture = fixture;
        System.out.println(name + " assigned next fixture: " + fixture);
    }

    @Override
    public void showStats() {
        System.out.println(name + " stats: Runs this season: "+ this.runs +", Matches: "+this.matches);
    }

    public String getNextFixture() {
        return nextFixture;
    }
}