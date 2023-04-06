public abstract class Car extends Transport {

    public Engine engine = new Engine();

    public Car(int _speed, int _weight, String _color, byte[] _coordinate) {
        super(_speed, _weight, _color, _coordinate);

    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Obj moving with speed: " + speed);
    }
    @Override
    public boolean stopObject() {
        this.speed = 0;
        return true;
    }

    public abstract void moveObject(speed);
}
