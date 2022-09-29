package Principal;
import java.applet.AudioClip;
public class Cancion extends Thread
{
   public void run()
   {
       AudioClip sound;
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/Thread/cancion.wav"));
        sound.play();
   }
    
}
