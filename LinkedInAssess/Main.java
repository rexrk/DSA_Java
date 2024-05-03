package LinkedInAssess;

class NeedForSpeed {
    private int speed;
    private int distance;
    private int battery = 100;
    private int batteryDrain;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!batteryDrained()) {
            this.distance += this.speed;
            this.battery -= this.batteryDrain;
            
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        return car.batteryDrained();
    }
}

public class Main {
    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(5, 2);
        car.drive();
        while(car.distanceDriven() < 101) car.drive();
        System.out.println(car.batteryDrained());
    }

    
}