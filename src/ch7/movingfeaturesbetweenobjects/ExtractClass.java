package ch7.movingfeaturesbetweenobjects;

public class ExtractClass {

    public class TelephoneNumber {
        private String areaCode;
        private String number;

        public TelephoneNumber(String areaCode, String number) {
            this.areaCode = areaCode;
            this.number = number;
        }

        public void setAreaCode(String areaCode) {
            this.areaCode = areaCode;
        }

        public String getAreaCode() {
            return areaCode;
        }

        public void setTelephoneNumber(String number) {
            this.number = number;
        }

        public String getTelephoneNumber() {
            return "(" + areaCode + ") " + number;
        }
    }

    public class Person {
        private String name;
        private TelephoneNumber officeTelephone = new TelephoneNumber("02", "1234-5678");

        public String getName() {
            return name;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            officeTelephone.setAreaCode(officeAreaCode);
        }

        public String getOfficeAreaCode() {
            return officeTelephone.getAreaCode();
        }

        public void setOfficeNumber(String officeNumber) {
            officeTelephone.setTelephoneNumber(officeNumber);
        }

        public String getOfficeNumber() {
            return officeTelephone.getTelephoneNumber();
        }
    }
}
