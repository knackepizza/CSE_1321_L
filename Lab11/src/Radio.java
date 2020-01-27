public class Radio {
    int station = 1;
    int volume = 1;
    boolean on = false;

    public Radio() {
        station = 1;
        volume = 1;
        on = false;
    }

    int getStation() {
        return station;
    }

    int getVolume() {
        return volume;
    }

    void turnOn() {
        on = true;
    }

    void turnOff() {
        on = false;
    }

    void stationUp(int increase) {
        this.station += increase;
    }

    void stationDown(int decrease) {
        this.station -= decrease;
    }

    void volumeUp(int increase) {
        this.volume += increase;
    }

    void volumeDown(int decrease) {
        this.volume -= decrease;
    }

    public String toString() {
        if (on == true) {
            return "The radio station is " + this.station + " and the volume level is " + this.volume + ".";
        } else {
            return "The radio is off.";
        }
    }
    public static void main(String[] args) {
        Radio r1 = new Radio();
        
        r1.turnOn();
        System.out.println("Turn radio on: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.volumeUp(3);
        System.out.println("Turn volume up by 3: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.stationUp(5);
        System.out.println("Turn station up by 5: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.volumeDown(1);
        System.out.println("Turn volume down by 1: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.stationUp(3);
        System.out.println("Turn station up by 3: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.turnOff();
        System.out.println("Turn radio off: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.volumeUp(2);
        System.out.println("Turn volume up by 2: ");
        System.out.println("\t" + r1.toString() + "\n");

        r1.stationDown(2);
        System.out.println("Turn station down by 2: ");
        System.out.println("\t" + r1.toString() + "\n");
    }

}