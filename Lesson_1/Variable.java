public class Variable {
    public static void main(String[] args) {
        byte cores = 4;
        short threads = 8;
        int cpuFrequency = 4500;
        long ddrFrequency = 3000;
        float ssdSize = 50000000f;
        double hddSize = 500000000d;
        char cpuClass = 'A';
        boolean isWork = true;

        System.out.println("Cores - " + cores);
        System.out.println("Threads - " + threads);
        System.out.println("CPU-frequency - " + cpuFrequency);
        System.out.println("DDR-frequency - " + ddrFrequency);
        System.out.println("SSD - " + ssdSize);
        System.out.println("HDD - " + hddSize);
        System.out.println("Class - " + cpuClass);
        System.out.println("Is work - " + isWork);
    }
}