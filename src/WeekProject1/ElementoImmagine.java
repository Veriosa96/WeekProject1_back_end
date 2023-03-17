package WeekProject1;

public class ElementoImmagine extends ElementoMultimediale { //qui stiamo andando ad estendere la classe ElementoImmagine alla super classe ElementoMultimediale

    private int Luminosità;
    public ElementoImmagine(String Titolo, int Durata) {
        super(Titolo, Durata);
        this.Luminosità = Luminosità;
    }



    public int getLuminosità(){
        return Luminosità;
    }
    public void AumentaLuminositàImg(){
        Luminosità++;
    }
    public void DiminuisciLuminositàImg(){
        Luminosità--;
        if(Luminosità<0);
        Luminosità=0;
    }

    public void Show(){
        System.out.println(getTitolo());
        for(int i = 0; i < Luminosità; i++);
        {
            System.out.println("*");
        } System.out.println();
    }

    @Override

    public void play() {//andiamo a creare l'override per la riproduzione dell'immagine che avverrà all'interno di ElementoMultimediale

        System.out.println("Riproduzione dell'immagine" + getTitolo());

    }
}

