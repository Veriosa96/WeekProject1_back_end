package WeekProject1;

public class ElementoVideo extends ElementoMultimediale {
    private int Durata;
    private String Url;
    private int Volume;
    private int Luminosita;

    public ElementoVideo(String Titolo, int Durata, String Url, int Luminosita) {
        super(Titolo, Durata);//passandoli come parametri nella riga precedente tramite super posso utilizzarli anche in questa classe grazie a "super"
        this.Url= Url;
        this.Volume= Volume;
        this.Luminosita= Luminosita;
    }

    public void AumentaLuminositaVideo(){
        Luminosita++;
    }

    public void DiminuisciLuminositaVideo(){
        Luminosita--;
        if (Luminosita<0){
            Luminosita=0;
        }
    }

    public void AlzaVolume(){ //Metodd creato per alzare il volume
        Volume++;
    }

    public void AbbassaVolume(){ //Metodo creato per abbassare il volume
        Volume--;
    }
    public int Durata(){
        return Durata;
    }
    public void setDurata(int Durata) {
        this.Durata = Durata;
    }
    public String getUrl (){
        return Url;
    }
    public void setUrl(String Url){
        this.Url = Url;
    }

    @Override
    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            String Punti = new String(new char[Volume]).replace('\0','!');
            String Asterischi = new String(new char[Luminosita]).replace('\0','!');
            System.out.println(getTitolo()+""+Punti+""+Asterischi);
            System.out.println("Riproduzione Video" + getTitolo() + "dall'indirizzo" + getUrl());
        }
    }
}
