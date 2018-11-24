package uet.oop.bomberman.level;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {

    Clip MenuMusic, MenuMove, MenuSelect, BombDrop, BombExplode, Victory, GameSong;
    int useless;

    public Audio(int num){
        useless = num;
    }

    public void playMenu(){
        try{
            AudioInputStream in1 = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\MenuMusic.wav"));
            MenuMusic = AudioSystem.getClip();
            MenuMusic.open(in1);
            MenuMusic.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch(Exception e){e.printStackTrace();}
    }

    public void stopMenu(){
        MenuMusic.stop();
    }

    public static void playMenuMove(){
        try
        {
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\MenuMove.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public static void playEntinyDie(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\entinydie.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public static void playBombDrop(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\bomdrop.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public static void playBombExplode(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\BombExplode.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public static void playVictory(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\Victory (mp3cut.net) (1).wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }

    public void playGameSong(){

    }
    public static void bomberdie(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\soundbomberdie.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }
    public static void eat(){
        try{
            AudioInputStream in = AudioSystem.getAudioInputStream(new File("C:\\Users\\Admin\\Documents\\GitHub\\bomberman-starter\\res\\sound\\eat.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(in);
            clip.start();
        }
        catch(Exception e){e.printStackTrace();}
    }
}


