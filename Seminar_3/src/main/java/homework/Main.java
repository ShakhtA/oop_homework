package homework;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student ivanov = new Student("Ivanov Ivan", "01.05.2005");
        Student petrov = new Student("Petrov Andrey", "23.08.2005");
        Student smirnov = new Student("Smirnov Alexey", "27.03.2007");
        System.out.println(ivanov);
        LearnGroup group1 = new LearnGroup(4631);
        group1.add(ivanov);
        group1.add(petrov);
        group1.add(smirnov);
        group1.showGroup();
        System.out.println("============");

        Student kuzmina = new Student("Kuzmina Olga", "21.06.2004");
        Student vasilieva = new Student("Vasilieva Nastya", "15.06.2004");
        Student egorova = new Student("Erorova Sveta", "05.11.2006");
        Student mironova = new Student("Mironova Liza", "17.02.2004");
        Student petrova = new Student("Petrova Olga", "30.07.2006");
        LearnGroup group2 = new LearnGroup(4326);
        group2.add(kuzmina);
        group2.add(vasilieva);
        group2.add(egorova);
        group2.add(mironova);
        group2.add(petrova);
        group2.showGroup();
        System.out.println("============");

        Student krotov = new Student("Krotov Oleg", "20.09.2002");
        Student vasiliev = new Student("Vasiliev Michail", "01.01.2005");
        Student kuklina = new Student("Kuklina Larisa", "09.04.2006");
        Student smirnova = new Student("Smirnova Anna", "27.03.2007");
        LearnGroup group3 = new LearnGroup(4431);
        group3.add(krotov);
        group3.add(vasiliev);
        group3.add(kuklina);
        group3.add(mironova);
        group3.add(smirnov);
        group3.showGroup();
        System.out.println("============");

        Stream stream1 = new Stream("Mathematika");
        stream1.add(group1);
        stream1.add(group2);

        Stream stream2 = new Stream("Language");
        stream2.add(group3);

        List<Stream> streamList = new ArrayList<>();
        streamList.add(stream1);
        streamList.add(stream2);
        for (Stream stream:streamList) {
            System.out.println(stream.getLearnGroupList().size());
        }
        System.out.println("============");
        Comparator streamComparator = new StreamComporator();

        Collections.sort(streamList, streamComparator);
        for (Stream stream:streamList) {
            System.out.println(stream.getLearnGroupList().size());
        }
        System.out.println("============");

    }
}
