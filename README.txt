   Министерство науки и высшего образования Российской Федерации
федеральное государственное бюджетное образовательное учреждение высшего образования
"Российский экономический университет имени Г.В. Плеханова"
МОСКОВСКИЙ  ПРИБОРОСТРОИТЕЛЬНЫЙ ТЕХНИКУМ














МДК. 01.03 Разработка мобильных приложений
ПМ.01 Разработка модулей программного обеспечения для компьютерных систем

Специальность: 09.02.07 «Информационные системы и программирование» 

Квалификация: Тестировщик














Выполнил студент:	Проверил преподаватель:
Группы Т50-1-22	Пахомов Д. А.
Константинов А. О.	«__»___________ 2024 года
«__» _______2024 год	Оценка: _________
	
 ПРАКТИЧЕСКАЯ РАБОТА №2
	Тема – Практическая работа N2
Цель работы:
Создать программу соответствующую следующим пунктам: 
- создать класс
- минимум 3 атрибута
- минимум 3 метода
- заполнение массива данным классом(из консоли)
- класс отдельным пакетом
- все атрибуты приватные
- должны быть get/set
- минимум 2 перегрузки конструктора
- в массиве минимум 10 записей
Ход работы: 
1.	создание класса с приватными атрибутами (Рисунок 1)
package org.example;

public class Zakaz {

    Zakaz(int kolvo , int cena , String name ){
        this._name = name;
        this._kolvo = kolvo ;
        this._cena = cena ;
    }
    private int _kolvo ;
    private  int _cena ;
    private  String _name ;

2.	Использование get и set (рисунок 2)
 
    public String get_name(){return _name;}
    public void Set_name(String name ){
        this._name = name ;
    }
    public int get_kolvo(){return _kolvo;}
    public void set_kolvo(int kolvo){this._kolvo = kolvo ; }
    public int get_cena(){return  _cena; }
    public void set_cena(int cena){this._cena = cena; }



3.	Создание 3 методов(рисунок 3, 4)
     public  void Razmerzakaza(){
        if (_kolvo < 5){
            System.out.println(" - Малый заказ");

        }
        else {
            System.out.println(" - Большой заказ");
        }
    }
    public void Cenazakaza(){
        int chek = _cena * _kolvo ;
        System.out.printf("Общая цена заказа: %d" , chek);
    }

    public void Zakazinformation() {
        System.out.printf("Название блюда: %s, Количество порций: %d , Цена за порцию: %d " , _name, _kolvo , _cena);
    }

4.	Создание массива с возможностью добавления в него элементов(рисунок 4)
 public class Main {
    public static void main(String[] args) {
        Zakaz[] zakazik = new Zakaz[10];
        for (int i = 0; i < zakazik.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Введите название заказа \n");
            String name = scanner.next();
            System.out.printf("Введите количество порций \n");
            int kolvo = scanner.nextInt();
            System.out.printf("Введите цену за порцию \n");
            int cena = scanner.nextInt();
            zakazik[i] = new Zakaz(kolvo, cena, name);
            zakazik[i].Zakazinformation();
            zakazik[i].Cenazakaza();
            zakazik[i].Razmerzakaza();
        }




    }
}

Вывод: Была создана программа соответствующая следующим пунктам: 
- создать класс
- минимум 3 атрибута
- минимум 3 метода
- заполнение массива данным классом(из консоли)
- класс отдельным пакетом
- все атрибуты приватные
- должны быть get/set
- минимум 2 перегрузки конструктора
- в массиве минимум 10 записей
 

