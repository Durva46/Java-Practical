public class Main {
    static class ParkingLot {
        private int twoWheelers, fourWheelers; private final int twoCap, fourCap; private static long revenue;
        ParkingLot(int twoCap,int fourCap) { this.twoCap=twoCap; this.fourCap=fourCap; }
        void park(String type) {
            if (type.equalsIgnoreCase("two")) { if(twoWheelers<twoCap){twoWheelers++;revenue+=20;System.out.println("Two-wheeler parked");}else System.out.println("Full"); }
            else if(type.equalsIgnoreCase("four")){if(fourWheelers<fourCap){fourWheelers++;revenue+=40;System.out.println("Four-wheeler parked");}else System.out.println("Full");}
        }
        void leave(String type) { if(type.equalsIgnoreCase("two")&&twoWheelers>0)twoWheelers--; else if(type.equalsIgnoreCase("four")&&fourWheelers>0)fourWheelers--; }
        static long getRevenue(){return revenue;}
        int getTwoWheelers(){return twoWheelers;} int getFourWheelers(){return fourWheelers;}
    }
    public static void main(String[] args) { ParkingLot lot=new ParkingLot(2,2); lot.park("two");lot.park("two");lot.park("two");lot.park("four");lot.park("four");lot.leave("two");lot.park("two"); System.out.println("Two: "+lot.getTwoWheelers()+", Four: "+lot.getFourWheelers()+", Revenue: "+ParkingLot.getRevenue()); }
}
