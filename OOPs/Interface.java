package OOPs;

public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();
        King k = new King();
        k.move();

        // *Multiple inheritance
        Beta b = new Beta();
        b.papa();
        b.maa();
    }
}

interface ChessPlayer {
    // *by default all methods in interface are public and abstract
    void move();
}

class Queen implements ChessPlayer {
    @Override
    // *must be public as it is overriding a public method
    public void move() {
        System.out.println("Queen can move in any direction");
    }
}

class King implements ChessPlayer {
    @Override
    public void move() {
        System.out.println("King can move in any direction but only one step");
    }
}

// *Multiple inheritance is possible in interface

interface PAPA {
    void papa();
}

interface MAA {
    void maa();
}

class Beta implements PAPA, MAA {
    @Override
    public void papa() {
        System.out.println("Papa jaisi shakal");
    }

    @Override
    public void maa() {
        System.out.println("Maa jaisi Akal");
    }
}
