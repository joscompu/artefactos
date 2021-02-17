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
        Dvd Dv1 = new Dvd();
        TV Dv2 = new TV();
        Microwave Dv3 = new Microwave();
        Ps5 Dv4 = new Ps5();
        int opc;
        int sub;

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
                                Dv1.turnOn();
                                break;
                            case 2:
                                Dv1.turnOff();
                                break;
                            case 3:
                                Dv1.playDvd();
                                break;
                            case 4:
                                Dv1.stopDvd();
                                break;
                        }
                    } while (sub != 5);
                    break;
                case 2:
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
                                Dv2.turnOn();
                                break;
                            case 2:
                                Dv2.turnOff();
                                break;
                            case 3:
                                Dv2.volumeUp();
                                break;
                            case 4:
                                Dv2.volumeDown();
                                break;
                            case 5:
                                Dv2.channelUp();
                                break;
                            case 6:
                                Dv2.channelDown();
                                break;
                        }
                    } while (sub != 7);
                    break;
                case 3:
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
                                Dv3.turnOn();
                                break;
                            case 2:
                                Dv3.turnOff();
                                break;
                            case 3:
                                Dv3.heat();
                                break;
                            case 4:
                                Dv3.stop();
                                break;
                        }
                    } while (sub != 5);
                    break;
                case 4:
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
                                Dv4.turnOn();
                                break;
                            case 2:
                                Dv4.turnOff();
                                break;
                            case 3:
                                Dv4.playing();
                                break;
                            case 4:
                                Dv4.standBy();
                                break;
                        }
                    } while (sub != 5);
                    break;
            }

        } while (opc != 5);

    }
}
