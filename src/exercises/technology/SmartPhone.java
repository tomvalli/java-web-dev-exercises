package exercises.technology;

public class SmartPhone extends Computer {
    private int displayPPI;
    private String screenToBodyRatio;
    private boolean fingerPrintReader, infraCam, fiveG;
    private int[] freqBands;

    public SmartPhone(String formFactor, String cpu, String operatingSystem, String oem, String modelNo, String sku, double memoryGB, double storageGB, double displaySizeInches, int batteryCapacityMaH, boolean touchScreen, int displayPPI, String screenToBodyRatio, boolean fingerPrintReader, boolean infraCam, boolean fiveG, int[] freqBands) {
        super(formFactor, cpu, operatingSystem, oem, modelNo, sku, memoryGB, storageGB, displaySizeInches, batteryCapacityMaH, touchScreen);
        this.displayPPI = displayPPI;
        this.screenToBodyRatio = screenToBodyRatio;
        this.fingerPrintReader = fingerPrintReader;
        this.infraCam = infraCam;
        this.fiveG = fiveG;
        this.freqBands = freqBands;
    }

    public int getDisplayPPI() {
        return displayPPI;
    }

    public void setDisplayPPI(int displayPPI) {
        this.displayPPI = displayPPI;
    }

    public String getScreenToBodyRatio() {
        return screenToBodyRatio;
    }

    public void setScreenToBodyRatio(String screenToBodyRatio) {
        this.screenToBodyRatio = screenToBodyRatio;
    }

    public boolean isFingerPrintReader() {
        return fingerPrintReader;
    }

    public void setFingerPrintReader(boolean fingerPrintReader) {
        this.fingerPrintReader = fingerPrintReader;
    }

    public boolean isInfraCam() {
        return infraCam;
    }

    public void setInfraCam(boolean infraCam) {
        this.infraCam = infraCam;
    }

    public boolean isFiveG() {
        return fiveG;
    }

    public void setFiveG(boolean fiveG) {
        this.fiveG = fiveG;
    }

    public int[] getFreqBands() {
        return freqBands;
    }

    public void setFreqBands(int[] freqBands) {
        this.freqBands = freqBands;
    }
}
