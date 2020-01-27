package utilities;

public enum Device {

    CHROME, ANDROID;

    public static Device getDevice() {
        Device device = Device.CHROME;
        if(System.getProperty("device") != null){
            if("android".equalsIgnoreCase(Device.ANDROID.toString())){
                device = Device.ANDROID;
            }
        }
        return device;
    }
}
