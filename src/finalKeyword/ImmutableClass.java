package finalKeyword;

public final class ImmutableClass {

    final int creator;

    public ImmutableClass(int numbers) {

        creator = numbers;

    }

    public void ShowMeCreatorCount() {

        System.out.println("Total numbers are: " + creator);
    }
}
