package point;

public class Point3D  extends Point2D{
    private float z = 0.0f;
    Point3D() {}
    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public  void  setXYZ(float x, float y, float z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ() {
        return new float[] {getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D{"
                + "x= " + getX() + " "
                + "y= " + getY() + " "
                + "z= " + getZ() +" "
                + '}';
    }
}
