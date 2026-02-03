package com.milana;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //NUMBER 1
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Book1", "Book2"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Book2", "Book3"));
        LinkedHashSet<String> combinedSet = new LinkedHashSet<>(list1);

        combinedSet.addAll(list2);

        ArrayList<String> result = new ArrayList<>(combinedSet);

        System.out.println("Объединено: " + result);

        // NUMBER 2.
        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Avatar", "The Godfather", "Up"));
        String longest = "";

        for (String movie : movies) {
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        System.out.println("Самый длинный фильм: " + longest);

        // NUMBER 3.
        ArrayList<String> foods = new ArrayList<>(Arrays.asList("Pizza", "Burger", "Pizza", "Soup"));

        int count = 0;

        for (String item : foods) {
            if (item.equals("Pizza")) {
                count++;
            }
        }
        System.out.println("Pizza встречается: " + count + " раз(а)");

        //NUMBER 4.
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Banana"));
        fruits.removeIf(f -> f.equals("Banana"));
        System.out.println("Без бананов: " + fruits);

        // NUMBER 5.
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue"));


        Collections.fill(colors, "Black");

        System.out.println("Набор цветов: " + colors);

        // NUMBER 6.
        ArrayList<String> sports = new ArrayList<>(Arrays.asList("Soccer", "Football", "Tennis", "Basketball"));

        ArrayList<String> subList = new ArrayList<>(Arrays.asList("Football", "Tennis"));


        boolean hasSublist = sports.containsAll(subList);


        System.out.println("Содержит подсписок: " + hasSublist);

        // NUMBER 7.
        ArrayList<String> flowers = new ArrayList<>(Arrays.asList("Rose", "Lily", "Rose", "Tulip"));


        System.out.println("Первая Rose: " + flowers.indexOf("Rose"));


        System.out.println("Последняя Rose: " + flowers.lastIndexOf("Rose"));

        //NUMBER 8.
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Cat", "Dog", "Cat", "Bird"));


        Set<String> set = new LinkedHashSet<>(animals);


        animals.clear();


        animals.addAll(set);


        System.out.println("Без дублей: " + animals);


        // NUMBER 9.
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Paris", "London"));


        String[] citiesArray = cities.toArray(new String[0]);

        // NUMBER 10.
        Integer[] numsArray = {1, 2, 3};


        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(numsArray));

        // NUMBER 11.
        ArrayList<String> c1 = new ArrayList<>(Arrays.asList("USA", "Canada", "Mexico"));
        ArrayList<String> c2 = new ArrayList<>(Arrays.asList("Canada", "France", "USA"));


        c1.retainAll(c2);

        System.out.println("Общие страны: " + c1);

        // NUMBER 12.
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Eve"));


        names.removeIf(n -> n.length() % 2 == 0);

        System.out.println("Только нечетная длина: " + names);

        // NUMBER 14.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "Java"));


        words.replaceAll(word -> word.replaceAll("[aeiouAEIOU]", "*"));

        System.out.println("Без гласных: " + words);

        // NUMBER 15.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();


        for (int n : numbers) {
            if (n % 2 == 0) evens.add(n);
            else odds.add(n);
        }
        System.out.println("Четные: " + evens + ", Нечетные: " + odds);

        // NUMBER 16.
        ArrayList<String> days = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri"));

        Collections.rotate(days, 2);

        System.out.println("Сдвинутые дни: " + days);

        // NUMBER 17.
        ArrayList<String> students = new ArrayList<>(Arrays.asList("Ivan", null, "Maria", null));

        students.removeIf(Objects::isNull);

        System.out.println("Без null: " + students);

        //NUMBER 18.
        /// --- ШАГ 1: Находим самого длинного (Чемпиона) ---
        String champion = "";

        for (String movie : movies) {
            // Если нашли фильм длиннее, чем текущий чемпион
            if (movie.length() > champion.length()) {
                champion = movie; // Запоминаем его
            }
        }
        System.out.println("Самый длинный: " + champion);

        movies.remove(champion);

        String secondPlace = "";

        for (String movie : movies) {
            if (movie.length() > secondPlace.length()) {
                secondPlace = movie;
            }
        }

        System.out.println("Второй по длине: " + secondPlace);

        // NUMBER 19.
        ArrayList<Object> Lengths = new ArrayList<>(Arrays.asList("Apple", "Kiwi"));

        for (int i = 0; i < Lengths.size(); i++) {


            String s = (String)Lengths.get(i);

            Lengths.set(i, s.length());
        }

        System.out.println("Длины слов: " + Lengths);

        // NUMBER 20.
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> hr = new ArrayList<>(Arrays.asList("Alice", "Bob"));
        ArrayList<String> it = new ArrayList<>(Arrays.asList("Charlie", "Dave"));

        departments.add(hr); // индекс 0
        departments.add(it); // индекс 1

        System.out.println("Сотрудники HR: " + departments.get(0));

        System.out.println("Вложенная структура: " + departments);
    }
}