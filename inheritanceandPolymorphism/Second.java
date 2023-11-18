package inheritanceandPolymorphism;
class Sports {
    public void play() {
        System.out.println("Playing a sport");
    }
}

// Subclass Football
class Football extends Sports {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Subclass Basketball
class Basketball extends Sports {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Subclass Rugby
class Rugby extends Sports {
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

public class Second {
	public static void main(String[] args) {
        // Creating instances of Football, Basketball, and Rugby
        Football footballGame = new Football();
        Basketball basketballGame = new Basketball();
        Rugby rugbyGame = new Rugby();

        // Playing each sport
        footballGame.play();
        basketballGame.play();
        rugbyGame.play();
    }
}
