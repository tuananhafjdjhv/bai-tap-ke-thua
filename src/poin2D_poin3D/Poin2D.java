package poin2D_poin3D;

public class Poin2D {
    private float x;
    public float y;

    public Poin2D(float x, float y) {
        this.x = x;
        this.y = y;
    }



    public Poin2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        return new  float[]{x,y};
    }

    @Override
    public String toString() {
        return "Poin2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
