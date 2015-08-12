package ch7.movingfeaturesbetweenobjects;

public class ExtractClass {

    public class Person {
        private String name;
        private String officeAreaCode;
        private String officeNumber;

        public String getName() {
            return name;
        }

        public void setOfficeAreaCode(String officeAreaCode) {
            this.officeAreaCode = officeAreaCode;
        }

        public String getOfficeAreaCode() {
            return officeAreaCode;
        }

        public void setOfficeNumber(String officeNumber) {
            this.officeNumber = officeNumber;
        }

        public String getOfficeNumber() {
            return officeNumber;
        }
    }
}
