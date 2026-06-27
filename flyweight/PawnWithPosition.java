public class PawnWithPosition {
    int x;
    int y;
    Pawn pawn;
    PawnWithPosition(int x, int y, Pawn pawn){
        this.x=x;
        this.y=y;
        this.pawn=pawn;
    }
    public void position(){
        System.out.println(pawn.name +" position is ( "+this.x+" , "+this.y+" )");
    }
}
