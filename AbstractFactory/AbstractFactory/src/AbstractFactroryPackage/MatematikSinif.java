package AbstractFactroryPackage;

public class MatematikSinif implements SinifFactory {

    @Override
    public Ogrenciler createOgrenciler() {
        return new MatOgrenciler();
    }

    @Override
    public Ogretmen createOgretmen() {
        return new MatOgretmen();
    }

    @Override
    public SinifNo createSinifNo() {
        return new MatSinifNo();
    }
}