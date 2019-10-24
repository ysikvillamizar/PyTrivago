package co.com.accenture.certificacion.trivago.userinterfaces;

public enum OptionPage {
	
	Trivago("https://www.trivago.com.co");

    private final String url;

    OptionPage(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }

}
