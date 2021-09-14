class Cpu {
    int price;
    class Processor {
        int cores=2;
        String manufacture="Intel";
        void displayprocessor() {
            System.out.println("\nProcessor\n");
            System.out.println("No of Cores : " +cores);
            System.out.println("Processor manufactures : " + manufacture);
        }
    }

    static class Ram {
        String memory="4GB";
        String manufacture="Lenovo";
        void displayRam() {
            System.out.println("\nRAM\n");
            System.out.println("Memory Size : " +memory);
            System.out.println("Memory manufactures : " + manufacture);
        }
    }
 
    public static void main(String[] args) {
        Cpu c=new Cpu();
        Cpu.Ram r=new Cpu.Ram();
        r.displayRam();
        Cpu.Processor p=c.new Processor();
        p.displayprocessor();
        
    }
}