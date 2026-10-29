import java.util.Objects;
public class Main {
    static class Point { private final int x,y; Point(int x,int y){this.x=x;this.y=y;}
        public String toString(){return "("+x+", "+y+")";}
        public boolean equals(Object o){if(this==o)return true;if(!(o instanceof Point p))return false;return x==p.x&&y==p.y;}
        public int hashCode(){return Objects.hash(x,y);}
    }
    public static void main(String[] args) { Point[] points={new Point(1,2),new Point(3,4),new Point(1,2),new Point(5,6),new Point(3,4)}; int distinct=0;
        for(int i=0;i<points.length;i++){boolean seen=false;for(int j=0;j<i;j++)if(points[i].equals(points[j])){seen=true;break;}if(!seen)distinct++;}
        System.out.println("Distinct: "+distinct);
    }
}
