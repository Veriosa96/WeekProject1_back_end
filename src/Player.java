import WeekProject1.ElementoImmagine;
import WeekProject1.ElementoMultimediale;
import WeekProject1.ElementoRegistrazioneAudio;
import WeekProject1.ElementoVideo;

public class Player {
    public static void main(String[] args) {
        ElementoMultimediale[] Elementi = new ElementoMultimediale[4];
        Elementi[0] = new ElementoImmagine("CrossFit",3);
        Elementi[1] = new ElementoRegistrazioneAudio("Favourite Song", 2,2);
        Elementi[2] = new ElementoRegistrazioneAudio("Favourite Podcast", 3,3);
        Elementi[3] = new ElementoVideo("Video in riproduzione", 3,"Link",2);
        for (ElementoMultimediale Elemento : Elementi){
            Elemento.play();
        }
        ElementoRegistrazioneAudio Audio = new ElementoRegistrazioneAudio("Registrazione Audio",2,3);
        //Riproduzione dell'audio
        Audio.play();
        //Regolazione del volume
        Audio.AlzaVolume();

        ElementoVideo Video = new ElementoVideo("Video", 10,"link",3 );
        Video.play();
        Video.AlzaVolume();
        Video.AbbassaVolume();
        Video.AumentaLuminositàVideo();
        Video.DiminuisciLuminositàVideo();

        ElementoImmagine Img = new ElementoImmagine("Immagine",2 );
        Img.Show();


}
}