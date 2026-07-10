package abstraction.music.wind;
import abstraction.music.Playable;
public class   SaxoPhone implements Playable  {
	@Override
	public void play() {
		System.out.println("SaxoPhone is playing");
	}
	
}
