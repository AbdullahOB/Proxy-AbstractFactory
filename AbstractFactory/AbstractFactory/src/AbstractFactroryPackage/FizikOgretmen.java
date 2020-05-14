package AbstractFactroryPackage;

public class FizikOgretmen implements Ogretmen {
    private static final String fizikOgretment  = "Fizik Ogretmen !";

    @Override
    public String getDescription() {
        return fizikOgretment;
    }
}
