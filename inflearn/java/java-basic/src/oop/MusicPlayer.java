package oop;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        isOn = true;
        System.out.println("musicPlayer turn off");
    }

    void off(){
        isOn = false;
        System.out.println("musicPlayer turn off");
    }

    void volumeUp(){
        volume++;
        System.out.println("musicPlayer volume : " + volume);
    }

    void volumeDown(){
        volume++;
        System.out.println("musicPlayer volume : " + volume);
    }

    void showStatus(){
        System.out.println("musicPlayer status check");
        if( isOn ){
            System.out.println("musicPlayer On, volume : " + volume);
        } else {
            System.out.println("musicPlayer Off");
        }
    }
}
