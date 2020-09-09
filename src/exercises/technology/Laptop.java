package exercises.technology;

public class Laptop extends Computer {
    private boolean numPad, webcam, usbC, thunderbolt;
    private String gpu;

    public Laptop(String formFactor, String cpu, String operatingSystem, String oem, String modelNo, String sku, double memoryGB, double storageGB, double displaySizeInches, int batteryCapacityMaH, boolean touchScreen, boolean numPad, boolean webcam, boolean usbC, boolean thunderbolt, String gpu) {
        super(formFactor, cpu, operatingSystem, oem, modelNo, sku, memoryGB, storageGB, displaySizeInches, batteryCapacityMaH, touchScreen);
        this.numPad = numPad;
        this.webcam = webcam;
        this.usbC = usbC;
        this.thunderbolt = thunderbolt;
        this.gpu = gpu;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public void setNumPad(boolean numPad) {
        this.numPad = numPad;
    }

    public boolean isWebcam() {
        return webcam;
    }

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    public boolean isUsbC() {
        return usbC;
    }

    public void setUsbC(boolean usbC) {
        this.usbC = usbC;
    }

    public boolean isThunderbolt() {
        return thunderbolt;
    }

    public void setThunderbolt(boolean thunderbolt) {
        this.thunderbolt = thunderbolt;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
