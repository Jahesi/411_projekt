import java.lang.reflect.Array;

public class Spielfeldnode {
    Array pos[];
    int up;
    int down;
    int left;
    int right;

    //Spielfeld hat 4 Seiten und es kann sich nur über diese Seiten bewegt werden
    Spielfeldnode(Array[] pos) {
        this.pos = pos;
        up = 1;
        down = 1;
        left = 1;
        right = 1;
    }

}
