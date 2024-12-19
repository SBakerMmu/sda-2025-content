package singletoncurrency;


import javax.sound.midi.SysexMessage;

public final class Example {

    public static void run() {
        System.out.format("%s%n", Currency.GBP);
        System.out.format("%s%n", Currency.USD);
        System.out.format("%s%n", Currency.EUR);

    }
}
