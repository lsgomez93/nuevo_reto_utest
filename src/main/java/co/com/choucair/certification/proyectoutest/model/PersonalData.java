package co.com.choucair.certification.proyectoutest.model;

public class PersonalData {
    private String strFirsName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String strDay;
    private String strYear;
    private DevicesData devicesData;
    private LocationData locationData;
    private AccountData accountData;

    public DevicesData getDevicesData() {
        return devicesData;
    }

    public void setDevicesData(DevicesData devicesData) {
        this.devicesData = devicesData;
    }

    public LocationData getLocationData() {
        return locationData;
    }

    public void setLocationData(LocationData locationData) {
        this.locationData = locationData;
    }

    public AccountData getAccountData() {
        return accountData;
    }

    public void setAccountData(AccountData accountData) {
        this.accountData = accountData;
    }

    public String getStrFirsName() {
        return strFirsName;
    }

    public void setStrFirsName(String strFirsName) {
        this.strFirsName = strFirsName;
    }

    public String getStrLastName() {
        return strLastName;
    }

    public void setStrLastName(String strLastName) {
        this.strLastName = strLastName;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrMonth() {
        return strMonth;
    }

    public void setStrMonth(String strMonth) {
        this.strMonth = strMonth;
    }

    public String getStrDay() {
        return strDay;
    }

    public void setStrDay(String strDay) {
        this.strDay = strDay;
    }

    public String getStrYear() {
        return strYear;
    }

    public void setStrYear(String strYear) {
        this.strYear = strYear;
    }

    public PersonalData(String strFirsName, String strLastName, String strEmail, String strMonth, String strDay, String strYear, DevicesData devicesData, LocationData locationData, AccountData accountData) {
        this.strFirsName = strFirsName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.strDay = strDay;
        this.strYear = strYear;
        this.devicesData = devicesData;
        this.locationData = locationData;
        this.accountData = accountData;
    }
}
