public class Main {
    public static void main(String[] args) {
        Pawn whitePawn=new Pawn("whitePawn", "white");
        PawnWithPosition pawn0_0=new PawnWithPosition(0, 0, whitePawn);
        PawnWithPosition pawn8_8=new PawnWithPosition(8, 8, whitePawn);
        PawnWithPosition pawn3_0=new PawnWithPosition(3, 0, whitePawn);
        PawnWithPosition pawn0_5=new PawnWithPosition(0, 5, whitePawn);
        PawnWithPosition pawn7_0=new PawnWithPosition(7, 0, whitePawn);
        pawn0_0.position();
        pawn8_8.position();
        pawn3_0.position();
        pawn0_5.position();
        pawn7_0.position();
    }
}
