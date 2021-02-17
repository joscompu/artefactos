import java.util.Scanner;

abstract class Device {
    private Boolean onOff = false;
    int sub;
    Scanner sc = new Scanner(System.in);

    public Boolean getOnOff() {
        return onOff;
    }

    public void setOnOff(Boolean onOff) {
        if (onOff == true) {

            if (getOnOff() == false) {
                this.onOff = onOff;
                System.out.println("Dispositivo encendido");
            } else {
                System.out.println("No puedes encender el dispositivo si ya esta encendido");
            }

        } else {
            if (getOnOff() == true) {
                this.onOff = onOff;
                System.out.println("Dispositivo apagado");
            } else {
                System.out.println("No puedes apagar el dispositivo si ya esta apagado");
            }
        }
    }

    public void turnOn() {
        setOnOff(true);
    }

    public void turnOff() {
        setOnOff(false);
    }

    abstract void menu();
}


class Dvd extends Device {
    private Boolean playStop = false;

    public Boolean getPlayStop() {
        return playStop;
    }

    public void setPlayStop(Boolean playStop) {
        if (playStop == true) {

            if (getPlayStop() == false) {
                this.playStop = playStop;
                System.out.println("Reproduciendo DVD ");
            } else {
                System.out.println("eL DVD ya se encuentra reproduciendo");
            }

        } else {
            if (getPlayStop() == true) {
                this.playStop = playStop;
                System.out.println("DVD pausado");
            } else {
                System.out.println("El DVD ya se encuentra pausado");
            }
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
        do {
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1)Encender DVD" +
                    "\n" + "2)Apagar DVD" +
                    "\n" + "3)Reproducir DVD" +
                    "\n" + "4)Pausar DVD" +
                    "\n" + "5)Salir" + "\n\n");
            sub = sc.nextInt();

            switch (sub) {
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
        } while (sub != 5);
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
        do {
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1)Encender TV" +
                    "\n" + "2)Apagar TV" +
                    "\n" + "3)Subir volumen" +
                    "\n" + "4)Bajar volumen" +
                    "\n" + "5)Siquiente canal" +
                    "\n" + "6)Canal anterior" +
                    "\n" + "7)Salir" + "\n\n");
            sub = sc.nextInt();

            switch (sub) {
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
        } while (sub != 7);
    }
}

class Microwave extends Device {
    private Boolean heatUp = false;

    public Boolean getHeatUp() {
        return heatUp;
    }

    public void setHeatUp(Boolean heatUp) {
        if (heatUp == true) {

            if (getHeatUp() == false) {
                this.heatUp = heatUp;
                System.out.println("Calentando");
            } else {
                System.out.println("El microondas ya se encuentra calentando");
            }

        } else {
            if (getHeatUp() == true) {
                this.heatUp = heatUp;
                System.out.println("Detenido");
            } else {
                System.out.println("El microondas ya se encuentra detenido");
            }
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
        do {
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1)Encender microondas" +
                    "\n" + "2)Apagar microondas" +
                    "\n" + "3)Calentar" +
                    "\n" + "4)Detener" +
                    "\n" + "5)Salir" + "\n\n");
            sub = sc.nextInt();

            switch (sub) {
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
        } while (sub != 5);
    }
}

class Ps5 extends Device {
    private Boolean game = false;

    public Boolean getGame() {
        return game;
    }

    public void setGame(Boolean game) {
        if (game == true) {

            if (getGame() == false) {
                this.game = game;
                System.out.println("Jugando");
            } else {
                System.out.println("El PS5 ya ha iniciado el juego");
            }

        } else {
            if (getGame() == true) {
                this.game = game;
                System.out.println("Juego detenido");
            } else {
                System.out.println("El PS5 ya ha detenido el juego");
            }
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
        do {
            System.out.println("¿Que opcion desea realizar?");
            System.out.println("1)Encender PS5" +
                    "\n" + "2)Apagar PS5" +
                    "\n" + "3)Jugar" +
                    "\n" + "4)Detener juego" +
                    "\n" + "5)Salir" + "\n\n");
            sub = sc.nextInt();

            switch (sub) {
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
        } while (sub != 5);
    }
}

public class DeviceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Device Dv1 = new Dvd();
        Device Dv2 = new TV();
        Device Dv3 = new Microwave();
        Device Dv4 = new Ps5();
        int opc;

        do {
            System.out.println("¿Que Dispositivo desea utilizar?");
            System.out.println("1)DVD" +
                    "\n" + "2)TV" +
                    "\n" + "3)Microondas" +
                    "\n" + "4)PS5" +
                    "\n" + "5)Salir" + "\n\n");

            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    Dv1.menu();
                    break;
                case 2:
                    Dv2.menu();
                    break;
                case 3:
                    Dv3.menu();
                    break;
                case 4:
                    Dv4.menu();
                    break;
            }

        } while (opc != 5);

    }
}
