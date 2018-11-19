package domain;

public class Caesar implements GeheimSchrift {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final int shift = 3;
    public Caesar() {

    }

    @Override
    public String codeer(String tekst) {
        String plainTekst = tekst.toLowerCase();
        String gecodeerdeTekst = "";
        for (int i = 0; i<plainTekst.length(); i++) {
            int charPositie = ALPHABET.indexOf(plainTekst.charAt(i));
            int key = (shift + charPositie) % 26;
            char nieuweWaarde = ALPHABET.charAt(key);
            gecodeerdeTekst += nieuweWaarde;
        }
        return gecodeerdeTekst;
    }

    @Override
    public String decodeer(String tekst) {
        String gecodeerd = tekst.toLowerCase();
        String gedecoordeTekst = "";
        for (int i= 0; i<gecodeerd.length(); i++) {
            int charPositie = ALPHABET.indexOf(gecodeerd.charAt(i));
            int key = (charPositie - shift) % 26;
            if(key < 0) {
                key = ALPHABET.length() + key;
            }
            char nieuweWaarde = ALPHABET.charAt(key);
            gedecoordeTekst += nieuweWaarde;
        }
        return gedecoordeTekst;
    }
}
