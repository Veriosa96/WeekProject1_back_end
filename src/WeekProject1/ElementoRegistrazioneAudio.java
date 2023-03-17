package WeekProject1;

public class ElementoRegistrazioneAudio extends ElementoMultimediale {
    private int Volume;

    public ElementoRegistrazioneAudio(String Titolo, int Durata, int Volume) {
        super(Titolo, Durata);
        this.Volume = Volume;
    }

    public void AlzaVolume(){ //Metodd creato per alzare il volume
        Volume++;
    }

    public void AbbassaVolume(){ //Metodo creato per abbassare il volume
        Volume--;
    }
    @Override
    public void play() {
        for(int i = 0; i<getDurata(); i++){
            System.out.println(getTitolo()+"");
            for (int j = 0; j< Volume; j++){
                System.out.print("!");
            }
            System.out.println();
        }
    }
}
