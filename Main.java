package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Phone array []= new Phone[50];
        int end = 1, amount_of_people  = 0;
        while(end != 0)
        {
            array[amount_of_people] = new Phone();
            System.out.print("Введіть id - ");
            Scanner id = new Scanner(System.in);
            array[amount_of_people].setId(id.nextLong());
            System.out.print("\nВведіть ім'я - ");
            Scanner name = new Scanner(System.in);
            array[amount_of_people].setName(name.nextLine());
            System.out.print("\nВведіть прізвище - ");
            Scanner second_name = new Scanner(System.in);
            array[amount_of_people].setSecond_name(second_name.nextLine());
            System.out.print("\nВведіть побатькові - ");
            Scanner father_name = new Scanner(System.in);
            array[amount_of_people].setFather_name(father_name.nextLine());
            System.out.print("\nВведіть номер рахунку - ");
            Scanner number_score = new Scanner(System.in);
            array[amount_of_people].setNumber_score(number_score.nextInt());
            System.out.print("\nВведіть час міських розмов - ");
            Scanner time_local_calls = new Scanner(System.in);
            array[amount_of_people].setTime_local_calls(time_local_calls.nextInt());
            System.out.print("\nВведіть час міжміських розмов - ");
            Scanner time_abroad_calls = new Scanner(System.in);
            array[amount_of_people].setTime_abroad_calls(time_abroad_calls.nextInt());
            amount_of_people++;
            System.out.print("\nБажаєте продовжити ввід - 1, 0 - кінець вводу: ");
            Scanner cycle_check = new Scanner(System.in);
            end = cycle_check.nextInt();
        }
        Output data = new Output(array);
        System.out.print("Введіть ліміт міських розмов - ");
        Scanner limit = new Scanner(System.in);
        data.setLimit_of_local_calls(limit.nextInt());
        data.abonents_upper_limit(amount_of_people);
        data.users_of_abroad_calls(amount_of_people);
        System.out.print("Введіть діапазон номерів рахунку дані про абонентів яких ви хочете побачити:");
        Scanner begin_of_diapason = new Scanner(System.in);
        Scanner end_of_diapason = new Scanner(System.in);
        data.setBegin_diapason(begin_of_diapason.nextInt());
        data.setEnd_diapason(end_of_diapason.nextInt());
        data.find_diapason_of_score(amount_of_people);
    }
}
