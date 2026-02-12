public class P1 {
    public static void main(String[] args) {
        System.out.println("Main Start");

        System.out.println("Object of Level1 store inside Level1 class ref var");
        Level1 ref1 = new Level1();
        System.out.println(ref1.a);

        System.out.println("Object of Level2 store inside Level2 class ref var");
        Level2 ref2 = new Level2();
        System.out.println(ref2.a);
        System.out.println(ref2.b);

        System.out.println("Object of Level3 store inside Level3 class ref var");
        Level3 ref3L = new Level3();
        System.out.println(ref3L.a);
        System.out.println(ref3L.b);
        System.out.println(ref3L.c);

        System.out.println("Object of Level4 store inside Level4 class ref var");
        Level4 ref4L = new Level4();
        System.out.println(ref4L.a);
        System.out.println(ref4L.b);
        System.out.println(ref4L.c);
        System.out.println(ref4L.d);

        System.out.println("Upcasting Level3 -> Level2");
        Level2 up1 = new Level3();
        System.out.println(up1.a);
        System.out.println(up1.b);
        // System.out.println(up1.c); // Compile time error: cannot find symbol

        System.out.println("Upcasting Level4 -> Level1");
        Level1 up2 = new Level4();
        System.out.println(up2.a);
        // System.out.println(up2.b); // Compile time error

        System.out.println("Downcasting Level1 (holding Level4) -> Level4");
        Level4 down1 = (Level4) up2;
        System.out.println(down1.a);
        System.out.println(down1.b);
        System.out.println(down1.c);
        System.out.println(down1.d);

        System.out.println("Downcasting Level2 (holding Level3) -> Level3");
        Level3 down2 = (Level3) up1;
        System.out.println(down2.a);
        System.out.println(down2.b);
        System.out.println(down2.c);

        System.out.println("Main End");
    }
}
class Level1{
    int a = 10;
}
class Level2 extends Level1{
    int b = 20;
}

class Level3 extends Level2{
    int c = 30;
}
class Level4 extends Level3{
    int d = 40;
}