package WeekProject1;

public abstract class ElementoMultimediale {//creazione di una classe astratta
    private String Titolo;// qui stiamo creando una variabile a cui in un secondo momento andremo ad assegnare un valore, stessa cosa stiamo facendo a riga 5
    private int Durata;


public ElementoMultimediale(String Titolo,int Durata){
    this.Titolo= Titolo;
    this.Durata= Durata;
}
    public abstract void play();//metodo per la riproduzione del brano.

    public String getTitolo(){ //metodo per prendere il titolo
        return Titolo;
    }
    public int getDurata(){ //metodo per prendere la durata
        return Durata;
    }
}
