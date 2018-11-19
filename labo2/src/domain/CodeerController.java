package domain;

public class CodeerController {
    GeheimSchrift schrift;

    public CodeerController(GeheimSchrift s) {
        setGeheimschrift(s);
    }

    public void setGeheimschrift(GeheimSchrift s) {
        this.schrift = s;
    }

    public String codeer(String tekst) {
        return schrift.codeer(tekst);
    }
    public String decodeer(String tekst) {
        return schrift.decodeer(tekst);
    }
}
