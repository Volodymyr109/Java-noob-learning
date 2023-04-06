public class Truck extends Transport {


    private boolean isLoaded;
    public Engine engine = new Engine();


    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);

    }
    public Truck(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate);
        this.isLoaded = isLoaded;
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
    //polimorph @override
    public void setValues(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super.setValues(speed, weight, color, coordinate);
        System.out.println("2nd Method polimorph*");
        this.isLoaded = isLoaded;
    }

    //polimorph @override
    @Override
    protected String getValues() {
        System.out.println(super.getValues());
        return getLoaded();
    }

    public void setLoaded(boolean Loaded) {
        this.isLoaded = Loaded;
    }

    public String getLoaded() {
        if(isLoaded)
           return "Truck is loaded";
        else
            return "is NOT loaded";
    }
}
