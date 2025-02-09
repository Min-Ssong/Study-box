package oop;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        //musicPlayer On
        data.isOn = true;
        System.out.println("musicPlayer turn On");

        // volume up
        data.volume++;
        System.out.println("musicPlayer volume : " + data.volume);

        // volume up
        data.volume++;
        System.out.println("musicPlayer volume : " + data.volume);

        // volume down
        data.volume--;
        System.out.println("musicPlayer volume : " + data.volume);

        // musicPlayer status
        System.out.println("musicPlayer status check");
        if( data.isOn ){
            System.out.println("musicPlayer On, volume : " + data.volume);
        } else {
            System.out.println("musicPlayer Off");
        }

        // musicPlayer Off
        data.isOn = false;
        System.out.println("musicPlayer turn off");
    }
}
