import java.util.ArrayList;
import java.util.Scanner;

abstract class Device {
    private Boolean onOff = false;

    public Boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        if (onOff == true) {
            this.onOff = onOff;
            System.out.println("Dispositivo encendido");
        } else {
            this.onOff = onOff;
            System.out.println("Dispositivo apagado");
        }
    }

    public void turnOn() {
        setOnOff(true);
    }

    public void turnOff() {
        setOnOff(false);
    }
}


class Dvd extends Device {
    private Boolean playStop = false;

    public Boolean getPlayStop() {
        return playStop;
    }

    public void setPlayStop(Boolean playStop) {
        if (playStop == true) {
            this.playStop = playStop;
            System.out.println("Reproduciendo DVD ");
        } else {
            this.playStop = playStop;
            System.out.println("DVD pausado");
        }
    }

    public void playDvd() {
        setPlayStop(true);
    }

    public void stopDvd() {
        setPlayStop(false);
    }

}

class TV extends Device {
    private int volume = 0;
    private int channel = 1;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume <= 100 && volume >= 0) {
            this.volume = volume;
            System.out.println("El volumen ahora es " + getVolume());
        } else {
            System.out.println("El volumen solo puede estar establecido entre 0 y 100");
            System.out.println("Se mantiene el volumen " + getVolume());
        }
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel <= 70 && channel >= 1) {
            this.channel = channel;
            System.out.println("Mostrando el canal: " + getChannel());
        } else {
            System.out.println("La programacion solo incluye los canales del 1 al 70");
            System.out.println("Se mantiene el canal: " + getChannel());
        }
    }

    public void channelUp() {
        setChannel(channel + 1);
    }

    public void channelDown() {
        setChannel(channel - 1);
    }

    public void volumeUp() {
        setVolume(volume + 1);
    }

    public void volumeDown() {
        setVolume(volume - 1);
    }

}

class Microwave extends Device {
    private Boolean heatUp = false;

    public Boolean getHeatUp() {
        return heatUp;
    }

    public void setHeatUp(Boolean heatUp) {
        if (heatUp == true) {
            this.heatUp = heatUp;
            System.out.println("Calentando");
        } else {
            this.heatUp = heatUp;
            System.out.println("Detenido");
        }
    }

    public void heat() {
        setHeatUp(true);
    }

    public void stop() {
        setHeatUp(false);
    }

}

class Ps5 extends Device {
    private Boolean game = false;

    public Boolean getGame() {
        return game;
    }

    public void setGame(Boolean game) {
        if (game == true) {
            this.game = game;
            System.out.println("Jugando");
        } else {
            this.game = game;
            System.out.println("Juego detenido");
        }
    }


    public void playing() {
        setGame(true);
    }

    public void standBy() {
        setGame(false);
    }

}

public class DeviceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> deviceList = new ArrayList<>();
        int[] Device = new int[6];
        for (int i = 0; i < Device.length; i++) {
            Device[i] = i;
            deviceList.add(Device[i]);
        }

        int opc;
        int sub;

        do {

            System.out.println("¿Que Dispositivo desea utilizar?");
            System.out.println("1)DVD" +
                    "\n" + "2)TV" +
                    "\n" + "3)Microondas" +
                    "\n" + "4)PS5" +
                    "\n" + "0)Salir" + "\n\n");
            opc = sc.nextInt();
            int index = deviceList.indexOf(opc);

            if (index == 1) {
                do {
                    Dvd dv1 = new Dvd();
                    ArrayList<Integer> dvdActs = new ArrayList<>();
                    int[] dvd = new int[6];
                    for (int i = 0; i < dvd.length; i++) {
                        dvd[i] = i;
                        dvdActs.add(dvd[i]);
                    }

                    System.out.println("¿Que opcion desea realizar?");
                    System.out.println("1)Encender DVD" +
                            "\n" + "2)Apagar DVD" +
                            "\n" + "3)Reproducir DVD" +
                            "\n" + "4)Pausar DVD" +
                            "\n" + "0)Salir" + "\n\n");
                    sub = sc.nextInt();
                    int dvdIndex = dvdActs.indexOf(sub);

                    if (dvdIndex == 1) {
                        dv1.turnOn();
                    }
                    if (dvdIndex == 2) {
                        dv1.turnOff();
                    }
                    if (dvdIndex == 3) {
                        dv1.playDvd();
                    }
                    if (dvdIndex == 4) {
                        dv1.stopDvd();
                    }
                } while (sub != 0);
            }

            if (index == 2) {
                do {
                    TV dv2 = new TV();
                    ArrayList<Integer> tvActs = new ArrayList<>();
                    int[] tv = new int[8];
                    for (int i = 0; i < tv.length; i++) {
                        tv[i] = i;
                        tvActs.add(tv[i]);
                    }

                    System.out.println("¿Que opcion desea realizar?");
                    System.out.println("1)Encender TV" +
                            "\n" + "2)Apagar TV" +
                            "\n" + "3)Subir volumen" +
                            "\n" + "4)Bajar volumen" +
                            "\n" + "5)Siquiente canal" +
                            "\n" + "6)Canal anterior" +
                            "\n" + "0)Salir" + "\n\n");
                    sub = sc.nextInt();
                    int tvIndex = tvActs.indexOf(sub);

                    if (tvIndex == 1) {
                        dv2.turnOn();
                    }
                    if (tvIndex == 2) {
                        dv2.turnOff();
                    }
                    if (tvIndex == 3) {
                        dv2.volumeUp();
                    }
                    if (tvIndex == 4) {
                        dv2.volumeDown();
                    }
                    if (tvIndex == 5) {
                        dv2.channelUp();
                    }
                    if (tvIndex == 6) {
                        dv2.channelDown();
                    }
                } while (sub != 0);
            }

            if (index == 3) {
                do {
                    Microwave dv3 = new Microwave();
                    ArrayList<Integer> microActs = new ArrayList<>();
                    int[] micro = new int[6];
                    for (int i = 0; i < micro.length; i++) {
                        micro[i] = i;
                        microActs.add(micro[i]);
                    }

                    System.out.println("¿Que opcion desea realizar?");
                    System.out.println("1)Encender microondas" +
                            "\n" + "2)Apagar microondas" +
                            "\n" + "3)Calentar" +
                            "\n" + "4)Detener" +
                            "\n" + "0)Salir" + "\n\n");
                    sub = sc.nextInt();
                    int microIndex = microActs.indexOf(sub);

                    if (microIndex == 1) {
                        dv3.turnOn();
                    }
                    if (microIndex == 2) {
                        dv3.turnOff();
                    }
                    if (microIndex == 3) {
                        dv3.heat();
                    }
                    if (microIndex == 4) {
                        dv3.stop();
                    }
                } while (sub != 0);
            }

            if (index == 4) {
                do {
                    Ps5 dv4 = new Ps5();
                    ArrayList<Integer> ps5Acts = new ArrayList<>();
                    int[] ps5 = new int[6];
                    for (int i = 0; i < ps5.length; i++) {
                        ps5[i] = i;
                        ps5Acts.add(ps5[i]);
                    }

                    System.out.println("¿Que opcion desea realizar?");
                    System.out.println("1)Encender PS5" +
                            "\n" + "2)Apagar PS5" +
                            "\n" + "3)Jugar" +
                            "\n" + "4)Detener juego" +
                            "\n" + "0)Salir" + "\n\n");
                    sub = sc.nextInt();
                    int ps5Index = ps5Acts.indexOf(sub);

                    if (ps5Index == 1) {
                        dv4.turnOn();
                    }
                    if (ps5Index == 2) {
                        dv4.turnOff();
                    }
                    if (ps5Index == 3) {
                        dv4.playing();
                    }
                    if (ps5Index == 4) {
                        dv4.standBy();
                    }
                } while (sub != 0);
            }
        } while (opc != 0);

    }
}
