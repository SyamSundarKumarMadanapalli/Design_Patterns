package L_principle;

public class RetiredPlayer implements NonActivePlayer{
    private String name;
    private int runs;
    private int matches;

    public RetiredPlayer(String name, int runs, int matches) {
        this.name = name;
        this.runs = runs;
        this.matches = matches;
    }

    @Override
    public void showStats() {
        System.out.println(name + " stats: Career runs:"+ this.runs +", Matches: "+this.matches);
    }
}
