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

    abstract void menu();

    abstract void action(int selected);
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

    @Override
    void menu() {
        System.out.println("¿Que opcion desea realizar?");
        System.out.println("1)Encender DVD" +
                "\n" + "2)Apagar DVD" +
                "\n" + "3)Reproducir DVD" +
                "\n" + "4)Pausar DVD" +
                "\n" + "0)Salir" + "\n\n");
    }

    @Override
    void action(int selected) {
        switch (selected) {
            case 1:
                turnOn();
                break;
            case 2:
                turnOff();
                break;
            case 3:
                playDvd();
                break;
            case 4:
                stopDvd();
                break;
        }
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

    @Override
    void menu() {
        System.out.println("¿Que opcion desea realizar?");
        System.out.println("1)Encender TV" +
                "\n" + "2)Apagar TV" +
                "\n" + "3)Subir volumen" +
                "\n" + "4)Bajar volumen" +
                "\n" + "5)Siquiente canal" +
                "\n" + "6)Canal anterior" +
                "\n" + "0)Salir" + "\n\n");
    }

    @Override
    void action(int selected) {
        switch (selected) {
            case 1:
                turnOn();
                break;
            case 2:
                turnOff();
                break;
            case 3:
                volumeUp();
                break;
            case 4:
                volumeDown();
                break;
            case 5:
                channelUp();
                break;
            case 6:
                channelDown();
                break;
        }
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

    @Override
    void menu() {
        System.out.println("¿Que opcion desea realizar?");
        System.out.println("1)Encender microondas" +
                "\n" + "2)Apagar microondas" +
                "\n" + "3)Calentar" +
                "\n" + "4)Detener" +
                "\n" + "0)Salir" + "\n\n");
    }

    @Override
    void action(int selected) {
        switch (selected) {
            case 1:
                turnOn();
                break;
            case 2:
                turnOff();
                break;
            case 3:
                heat();
                break;
            case 4:
                stop();
                break;
        }
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

    @Override
    void menu() {
        System.out.println("¿Que opcion desea realizar?");
        System.out.println("1)Encender PS5" +
                "\n" + "2)Apagar PS5" +
                "\n" + "3)Jugar" +
                "\n" + "4)Detener juego" +
                "\n" + "0)Salir" + "\n\n");
    }

    @Override
    void action(int selected) {
        switch (selected) {
            case 1:
                turnOn();
                break;
            case 2:
                turnOff();
                break;
            case 3:
                playing();
                break;
            case 4:
                standBy();
                break;
        }
    }
}

public class DeviceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Device> deviceList = new ArrayList<>();
        deviceList.add(new Dvd());
        deviceList.add(new TV());
        deviceList.add(new Microwave());
        deviceList.add(new Ps5());

        int opc = 0;
        int sub;

        while (opc >= 0) {

            System.out.println("¿Que Dispositivo desea utilizar?");
            System.out.println("1)DVD" +
                    "\n" + "2)TV" +
                    "\n" + "3)Microondas" +
                    "\n" + "4)PS5" +
                    "\n" + "0)Salir" + "\n\n");
            opc = sc.nextInt();
            if (opc == 0) {
                break;
            } else {
                opc = opc - 1;
                do {
                    deviceList.get(opc).menu();
                    sub = sc.nextInt();
                    deviceList.get(opc).action(sub);
                } while (sub != 0);
            }
        }
    }
}
