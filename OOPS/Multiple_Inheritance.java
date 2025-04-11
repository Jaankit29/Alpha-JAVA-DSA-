
//https://chatgpt.com/c/676546c5-b928-8002-8f40-80e56f15b89b
package OOPS;


// class Camera{

// }

// class MusicPlayer{

// }

// class SmartPhone extends Camera, MusicPlayer{

// }

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic(); // Abstract method
    void takePhoto();
}

class SmartPhone implements Camera, MusicPlayer{ //multiple inheritance using "implrments"

    @Override
    public void playMusic() {
        System.out.println("Playing music!");
    }
     public void takePhoto(){
        System.out.println("Photo taken!");
    }


}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        SmartPhone sm= new SmartPhone();
       sm.takePhoto();
    }
}