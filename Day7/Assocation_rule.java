class Engine {
    void start() {
        System.out.println("Engine is Started.....!");
    }
}

class Car {
    private Engine engine;

    Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is Running");
    }
}
