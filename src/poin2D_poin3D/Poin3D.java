package poin2D_poin3D;

public class Poin3D extends Poin2D {

    public float z;

    public Poin3D(float x, float y, float z) {
        super(x,y);
        this.z=z;
    }
    public Poin3D(){
        super();
        this.z= 20;
    }
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        return new  float[] {getX(),getY(),z};
    }
    @Override
    public String toString() {
        return "Poin3D{" +
                ", z=" + z +
                '}' + super.toString();
    }

}
