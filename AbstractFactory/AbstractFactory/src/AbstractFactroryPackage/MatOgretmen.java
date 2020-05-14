package AbstractFactroryPackage;

public class MatOgretmen implements Ogretmen {
   private static final String MatOgretmen = "Matematık Ogretmeni";

    @Override
    public String getDescription() {
        return MatOgretmen;
    }

}
