public class Block {
    public static void sayhi(String name){
        System.out.println("ku churka " + name);
    }

    private int x;
    private int y;
    private int z;
    private String material;

    public Block(int blockX, int blockY, int blockZ, String blockmaterial) {
        this.x = blockX;
        this.y = blockY;
        this.z = blockZ;
        this.material = blockmaterial;
    }
    public void printData(){
        System.out.println("material = " + this.material);
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("z = " + this.z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
