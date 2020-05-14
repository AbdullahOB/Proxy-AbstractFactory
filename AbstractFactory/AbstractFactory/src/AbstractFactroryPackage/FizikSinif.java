package AbstractFactroryPackage;

public class FizikSinif implements SinifFactory {

    @Override
    public Ogretmen createOgretmen() {
        return new FizikOgretmen();
    }

    @Override
    public Ogrenciler createOgrenciler() {
        return new FizikOgrenciler();
    }

    @Override
    public SinifNo createSinifNo() {
        return new FizikSinifNo();

    }
}
