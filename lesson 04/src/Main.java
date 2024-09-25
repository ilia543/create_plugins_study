public class Main {
    public static void main(String[] args) {

        Block grass = new Block( 0,0,0,"GRASS");
        Block cobblestone = new Block(1,1,1,"COBBLESTONE");


        grass.printData();
        cobblestone.printData();

        Block.sayhi("bober");
    }
}