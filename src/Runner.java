import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {


        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Jessica");
        names2.add("Emily");
        names2.add("Destiny");
        names2.add("Mateo");
        names2.add("Sofia");
        names2.add("Tim");
        names2.add("James");

// before:
        System.out.println(names2);

// complete code below to traverse the arraylist and remove all
// names that are exactly 5 letters long
        for (int i = 0; i < names2.size(); i++)
        {
            if(names2.get(i).length() == 5)
            {
                names2.remove(i);
                i--;
            }
        }

// after:
        System.out.println(names2);

    }
}
