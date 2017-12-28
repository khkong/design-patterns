package facadepattern;

public class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hd;
    private byte[] sectorSize;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
        this.sectorSize = new byte[1024];
    }

    public void start(){
        processor.freeze();
        ram.load(1234567/*BOOT_ADDRESS*/, sectorSize/*SECTOR_SIZE*/);
        processor.jump(1234567/*BOOT_ADDRESS*/);
        processor.execute();
    }
}
