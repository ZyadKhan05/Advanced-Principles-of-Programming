public class Test {
    public static void main(String[] args) {
        String input = "99#7";

        int number;

        try

        {

            number = Integer.parseInt(input);

        }

        catch(NumberFormatException ex)

        {

            number = 0;

        }

        catch(RuntimeException ex)

        {

            number = 1;

        }

        catch(Exception ex)

        {

            number = -1;

        }

        System.out.println(number);
    }
}
