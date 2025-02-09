package oop;

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //musicPlayer On
        isOn = true;
        System.out.println("musicPlayer turn On");

        // volume up
        volume++;
        System.out.println("musicPlayer volume : " + volume);

        // volume up
        volume++;
        System.out.println("musicPlayer volume : " + volume);

        // volume down
        volume--;
        System.out.println("musicPlayer volume : " + volume);

        // musicPlayer status
        System.out.println("musicPlayer status check");
        if( isOn ){
            System.out.println("musicPlayer On, volume : " + volume);
        } else {
            System.out.println("musicPlayer Off");
        }

        // musicPlayer Off
        isOn = false;
        System.out.println("musicPlayer turn off");
    }
}
