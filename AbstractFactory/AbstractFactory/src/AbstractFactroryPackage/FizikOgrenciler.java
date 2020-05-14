package AbstractFactroryPackage;

public class FizikOgrenciler implements Ogrenciler {
    private static String fizikOgrenciler = "Fizik Ogrenciler !";

    @Override
    public String getDescription() {
        return fizikOgrenciler;
    }
}
