public class Main {

    public static void main(String[] args) {

        System.out.println("Car: ");

        Car audi80 = new Car(250, 2300, "Black", new byte[] {100, 0, 10});
        audi80.engine.setValues(true, 1000000);
        audi80.engine.infoEngine();

        System.out.println("Truck: ");

        Truck MAN = new Truck(8000, new byte[] {15, 0, 110}, true);
        MAN.engine.setValues(false, 500000);
        MAN.engine.infoEngine();

        Car flyCar = new Car(550, 1000, "Blue", new byte[] {0, 0, 0}) {

            @Override
            public void moveObject(float speed); {
                this.engine.inOn(true);
                System.out.println(" das Auto kann fliegen! ");
            }

        };

        flyCar.moveObject(450);
    }
}