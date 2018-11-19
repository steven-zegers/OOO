package domain;

public class Spiegeling implements GeheimSchrift {
    public Spiegeling() {

    }

    @Override
    public String codeer(String tekst) {
        String gecodeerdeTekst = "";
        for (int i = tekst.length()-1; i>=0; i--) {
            gecodeerdeTekst += tekst.charAt(i);
        }
        return gecodeerdeTekst;
    }

    @Override
    public String decodeer(String tekst) {
        return codeer(tekst);
    }
}
