/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_store;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author kuznetsova_a
 */
public class purchases {
 
int p_id;                     // id заказа
String date;                // дата заказа 
String UserName;            //заказчик
int delivery;               // статус доставки 0 - доставлен, 1 - доставляется
GregorianCalendar data;
float cost;                 // стоимость заказа



public purchases(int id_c, String UserName_c, int delivery_c, GregorianCalendar data_c, float cost_c)
{
p_id = id_c; 
UserName = UserName_c;
delivery = delivery_c;
data = data_c;
date = FormatDate(data_c);
cost = cost_c;

}
// метод выдача даты в удобочитаемом формате
 public String getDate(){   
  Calendar c = new GregorianCalendar();
  SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
  String format = format1.format(c.getTime());
  return format;
  }
  // метод форматирование даты
  public String FormatDate(Calendar c_v){

  Calendar c = c_v;
  SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
  String format = format1.format(c.getTime());
  return format;
  
}

 void print_order()
{
 System.out.println ("Заказ №"+ p_id + " Пользователя " + UserName +  " от " + date + " г. на сумму " + cost); 
} 
  
}