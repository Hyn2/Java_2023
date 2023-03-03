class Television {
    int     channel;
    int     volume;
    boolean isOn;

    void status() {
        if(isOn == true) {
            System.out.println("TV가 켜져있습니다.");
            System.out.println("Channel : " + channel + ", Volume : " + volume);
        } else {
            System.out.println("TV가 꺼져있습니다.");
        }
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.isOn = true;
        myTv.status();
    }
}

