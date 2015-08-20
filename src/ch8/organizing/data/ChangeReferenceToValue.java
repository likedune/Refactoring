package ch8.organizing.data;

public class ChangeReferenceToValue {

    public static void main(String[] args) {
        Currency currency = new Currency("USD");
        boolean result = currency.equals(new Currency("USD"));
        System.out.println(result);
    }
}

class Currency {
    private String code;

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Currency) {
            Currency other = (Currency)obj;
            return code.equals(other.getCode());
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
