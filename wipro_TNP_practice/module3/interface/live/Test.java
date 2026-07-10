package abstraction.live;

import abstraction.music.Playable;
import abstraction.music.string.Veena;
import abstraction.music.wind.SaxoPhone;

public class Test {

    public static void main(String[] args) {

        // a) Create Veena object
        Veena v = new Veena();
        v.play();

        // b) Create Saxophone object
        SaxoPhone s = new SaxoPhone();
        s.play();

        // c) Runtime Polymorphism
        Playable p;

        p = new Veena();
        p.play();

        p = new SaxoPhone();
        p.play();
    }
}