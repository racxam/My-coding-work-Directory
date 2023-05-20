class Building {
    Building() {
        System.out.println(" Buiding");
    }

    Building(String name) {

        this();
        System.out.println(" Building: String Constructor" + name);
    }
}

public class cvb extends Building {

    cvb()
    {System.out.println("House");

}

    cvb(String name) {

        this();
        System.out.println("House: String Constructor" + name);
    }

    public static void main(String[] args) {
        new cvb("XYZ");

    }
}