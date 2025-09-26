package manager;

public class Manager {
    private LoginPage loginPage;
    private SecondPage secondPage;
    private ThirdPage thirdPage;

    public Manager() {
        loginPage = new LoginPage(this);
    }

    public void showSecondPage() {
        secondPage = new SecondPage(this);
        secondPage.setVisible(true);
    }

    public void showThirdPage() {
        thirdPage = new ThirdPage();
        thirdPage.setVisible(true);
    }
}
