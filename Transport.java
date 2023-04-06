public abstract class Transport {


    protected float speed;
    private int weight;
    private String color;
    private byte[] coordinate;


    public Transport(int _speed, int _weight, String _color, byte[] _coordinate) {
        System.out.println("Constructor created! ");
        setValues(_speed, _weight, _color, _coordinate);
        //System.out.println(getValues());
    }

    public Transport(int weight, byte[] _coordinate) {
        this.weight = weight;
        this.coordinate = _coordinate;
        //System.out.println(this.getValues());
    }

    public abstract void moveObject(float speed);

    public abstract boolean stopObject();

    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    protected String getValues() {
        String info = "Gesw.: " + speed + ". Gewicht in kg: " + weight + ". Farbe: " + color + "\n";
        String infoCoordinates = "Koordinaten:\n";

        for(int i =0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;
    }

    class Engine {

        private boolean isOn;
        private int km;

        public void setValues(boolean isOn, int km) {
            this.isOn = isOn;
            this.km = km;
        }
        public void isOn(boolean isOn) {
            this.isOn = isOn;
        }

        public void infoEngine() {
            if(isOn)
                System.out.println("Motor an " + " Kilometerstand: " + km + " km");
            else
                System.out.println("Motor aus " + " Kilometerstand: " + km + " km");
        }
    }
}








