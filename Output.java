package com.company;

import java.util.Scanner;

public class Output {

    private int limit_of_local_calls;
    private int begin_diapason;
    private int end_diapason;
    private Phone abonents_array[] = new Phone[50];
    Output(Phone array[])
    {
        System.arraycopy(array,0,abonents_array,0,array.length);
    }
    public void setBegin_diapason(int begin_diapason) {
        this.begin_diapason = begin_diapason;
    }

    public void setEnd_diapason(int end_diapason) {
        this.end_diapason = end_diapason;
    }

    public void setLimit_of_local_calls(int limit_of_local_calls) {
        this.limit_of_local_calls = limit_of_local_calls;
    }

    public int getLimit_of_local_calls() {
        return limit_of_local_calls;
    }

    private void output_of_abonents_data(Phone output_array[], int index)
    {
        System.out.println(abonents_array[index].getSecond_name() + " " + abonents_array[index].getName() + " " + abonents_array[index].getFather_name());
        System.out.println("Id абонента - " + abonents_array[index].getId() + "\nНомер рахунку - " + abonents_array[index].getNumber_score());
        System.out.println("Час місцевих дзвінків - " + abonents_array[index].getTime_local_calls() + "\nЧас міжміських дзвінків - " + abonents_array[index].getTime_abroad_calls());
        System.out.println("_______________________________________________");
    }

    public void abonents_upper_limit ( int amount)
    {
        System.out.println("Користувачі які перевищили ліміт міських розмов: ");
        for(int i = 0; i < amount; i++)
        {
            if(this.abonents_array[i].getTime_local_calls() > limit_of_local_calls)
            {
                output_of_abonents_data(abonents_array, i);
            }
        }
    }
    public void users_of_abroad_calls (int amount)
    {
        System.out.println("Користувачі які використовували міжміські дзвінки: ");
        for(int i = 0 ; i < amount; i++)
        {
            if(this.abonents_array[i].getTime_abroad_calls() > 0)
            {
                output_of_abonents_data(abonents_array, i);
            }
        }
    }
    public void find_diapason_of_score (int amount)
    {
        System.out.println("Абоненти чий рахунок знаходиться в даному діапазоні [" + begin_diapason + ";" + end_diapason + "]: ");
        for(int i = 0; i < amount; i++)
        {
            if(abonents_array[i].getNumber_score() > begin_diapason & abonents_array[i].getNumber_score() < end_diapason)
            {
                output_of_abonents_data(abonents_array, i);
            }
        }
    }
}
