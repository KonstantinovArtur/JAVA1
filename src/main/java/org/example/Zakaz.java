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
    public String get_name(){return _name;}
    public void Set_name(String name ){
        this._name = name ;
    }
    public int get_kolvo(){return _kolvo;}
    public void set_kolvo(int kolvo){this._kolvo = kolvo ; }
    public int get_cena(){return  _cena; }
    public void set_cena(int cena){this._cena = cena; }
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

}
