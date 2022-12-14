import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String inputFileName = "C:/New/foreign_names.csv";
        ArrayList<Person> people = new ArrayList<>();
        Division division;
        Person person;
        int j = 0;
        String line;
        String subLine = "";
        String[] array = new String[6];
        int divID = 3000;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++)
                {
                    if (line.charAt(i) != ';') subLine += line.charAt(i);
                    else if (line.charAt(i) == ';' || i + 1 == line.length())
                    {
                        array[j] = subLine;
                        j++;
                        subLine = "";
                    }
                }
                array[j] = subLine;
                subLine = "";
                j = 0;
                division = new Division();
                person = new Person(division);
                person.setID(array[0]);
                person.setName(array[1]);
                person.setSex(array[2]);
                person.setBirthday(array[3]);
                person.setDivisionName(array[4]);
                person.setSalary(array[5]);
                person.setDivisionID(Integer.toString(divID));
                divID++;
                people.add(person);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < people.size(); i++)
        {
            line = "";
            line += people.get(i).getID() + "; " +
                    people.get(i).getName() + "; " +
                    people.get(i).getSex()  + "; " +
                    people.get(i).getBirthday() + "; " +
                    people.get(i).getDivisionName() + "; " +
                    people.get(i).getSalary() + "; " +
                    people.get(i).getDivisionID();
            System.out.println(line);

        }
    }
}
