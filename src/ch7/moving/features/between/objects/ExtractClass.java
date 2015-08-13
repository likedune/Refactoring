package ch7.moving.features.between.objects;

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

//이것을 반대로하면 Inline Class 클래스 내용 직접 삽입