package exercises.technology;

import java.util.Objects;

public class Computer {
    private String formFactor, cpu, operatingSystem, oem, modelNo, sku;
    private double memoryGB, storageGB, displaySizeInches;
    private int batteryCapacityMaH;
    private boolean touchScreen;

    public Computer(String formFactor, String cpu, String operatingSystem, String oem, String modelNo, String sku, double memoryGB, double storageGB, double displaySizeInches, int batteryCapacityMaH, boolean touchScreen) {
        this.formFactor = formFactor;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.oem = oem;
        this.memoryGB = memoryGB;
        this.storageGB = storageGB;
        this.displaySizeInches = displaySizeInches;
        this.batteryCapacityMaH = batteryCapacityMaH;
        this.touchScreen = touchScreen;
        this.modelNo = modelNo;
        this.sku = sku;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOem() {
        return oem;
    }

    public void setOem(String oem) {
        this.oem = oem;
    }

    public double getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(double memoryGB) {
        this.memoryGB = memoryGB;
    }

    public double getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(double storageGB) {
        this.storageGB = storageGB;
    }

    public double getDisplaySizeInches() {
        return displaySizeInches;
    }

    public void setDisplaySizeInches(double displaySizeInches) {
        this.displaySizeInches = displaySizeInches;
    }

    public int getBatteryCapacityMaH() {
        return batteryCapacityMaH;
    }

    public void setBatteryCapacityMaH(int batteryCapacityMaH) {
        this.batteryCapacityMaH = batteryCapacityMaH;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return oem.equals(computer.oem) &&
                modelNo.equals(computer.modelNo) &&
                sku.equals(computer.sku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oem, modelNo, sku);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "formFactor='" + formFactor + '\'' +
                ", cpu='" + cpu + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", oem='" + oem + '\'' +
                ", modelNo='" + modelNo + '\'' +
                ", sku='" + sku + '\'' +
                ", memoryGB=" + memoryGB +
                ", storageGB=" + storageGB +
                ", displaySizeInches=" + displaySizeInches +
                ", batteryCapacityMaH=" + batteryCapacityMaH +
                ", touchScreen=" + touchScreen +
                '}';
    }
}
