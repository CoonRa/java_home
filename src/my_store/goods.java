
package my_store;

/*
 * @author kuznetsova_a
 */

//класс товар
public class goods {
int id, kol; // ИД товара и количество на складе
String name; // название товара
float cost;  // стоимость товара

// конструктор единицы товара
goods (int id_c,  String name_c, float cost_c, int kol_c)
{  
id = id_c;  
name = name_c;
cost = cost_c;
kol = kol_c;
}

// метод вывести товар на экран
void print_good()
{
 System.out.println ("Товар №"+ id + ". " + name +  " цена " + cost + " руб. " + "в наличии " + kol + " шт."); 
}
 // возврат значений
String getName(){return name;}
int getKol(){return kol;}
float getCost(){return cost;}

}