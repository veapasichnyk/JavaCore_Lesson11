public class Helm {
    private int diametrOfHelm;
    private MaterialOfHelm materialOfHelm;

    public Helm ( int diametrOfHelm, MaterialOfHelm materialOfHelm ) {
        this.diametrOfHelm = diametrOfHelm;
        this.materialOfHelm = materialOfHelm;
    }

    public int getDiametrOfHelm ( ) {
        return diametrOfHelm;
    }

    public MaterialOfHelm getMaterialOfHelm ( ) {
        return materialOfHelm;
    }

    @Override
    public String toString ( ) {
        return "Helm{" +
               "diametrOfHelm=" + diametrOfHelm +
               ", materialOfHelm=" + materialOfHelm +
               '}';
    }
}
