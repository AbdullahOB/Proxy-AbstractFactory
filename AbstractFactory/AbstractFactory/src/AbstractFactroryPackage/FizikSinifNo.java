package AbstractFactroryPackage;

public class FizikSinifNo implements SinifNo {
     private static int fizikSinifNo = 109;

    @Override
    public int getSinifNo() {
        return fizikSinifNo;
    }
}
