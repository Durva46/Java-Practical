import java.util.Objects;
public class Main {
    static class Card { final String rank,suit; Card(String rank,String suit){this.rank=rank;this.suit=suit;}
        public String toString(){return rank+" of "+suit;}
        public boolean equals(Object o){if(this==o)return true;if(!(o instanceof Card c))return false;return rank.equals(c.rank)&&suit.equals(c.suit);}
        public int hashCode(){return Objects.hash(rank,suit);}
    }
    public static void main(String[] args) { Card[] cards={new Card("Ace","Spades"),new Card("King","Hearts"),new Card("Ace","Spades")};
        for(int i=0;i<cards.length;i++)for(int j=0;j<i;j++)if(cards[i].equals(cards[j])){System.out.println("Duplicate found: "+cards[i]);return;}
        System.out.println("No duplicate found");
    }
}
