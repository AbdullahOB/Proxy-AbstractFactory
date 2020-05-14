package AbstractFactroryPackage;

public class MatOgrenciler implements Ogrenciler {
    static final String matOgrenciler = "Matematik Ogrencileri... ";

    @Override
    public String getDescription() {
        return matOgrenciler;
    }
}
