package finalKeyword;

public class FinalVariable1 {

    final String PANCARD;

    public FinalVariable1(String pancard) {

        PANCARD = pancard;
    }
    public static void main(String[] args) {

        FinalVariable1 obj1 = new FinalVariable1("AAZ");
        obj1.Show();
    }

    public void Show() {

        System.out.println("PAN card details are: " + PANCARD);

    }
}
