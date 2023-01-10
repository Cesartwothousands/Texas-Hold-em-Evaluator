

public class Card {
    private short rank, suit;

    private static String[] suits={"Heart","Spade","Diamond","Club"};
    private static String[] ranks={"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
    //Define 4 suits and 13 ranks

    Card(short suit, short rank)
    {
        this.suit=suit;
        this.rank=rank;
    }
    //Constract function

    public short getSuit() {
        return suit;
    }
    public short getRank() {
        return rank;
    }

    public static String rankAsString( int __rank ) {
        return ranks[__rank];
    }

    public @Override String toString()
    {
        return ranks[rank] + " of " + suits[suit];
    }
}