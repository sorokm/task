package autotests.testdata;

public class TestData {
    public static String testData;

    private TestData(String testData) {
        this.testData = testData;
    }

    public static final String PASS = "12345";
    public static final String PASS_INVALID = "1234";
    public static final String FIRST_NAME = "Testname";
    public static final String LAST_NAME = "Testname";
    public static final String ADDRESS = "address";
    public static final String CITY = "City";
    public static final String STATE = "Alabama";
    public static final String POSTCODE = "11111";
    public static final String MOBILE_PHONE = "89111111111";
}
