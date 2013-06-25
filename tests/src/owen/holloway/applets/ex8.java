package owen.holloway.applets;//This very simple class will play an audio file of type .au stored in the same folder //as the SoundDemo project. It will play the sound once only.

import java.applet.Applet;

public class ex8 extends Applet
{
	public void init()
	{
		play (getCodeBase(), "owen.holloway.applets/gong.au");
    }
}
