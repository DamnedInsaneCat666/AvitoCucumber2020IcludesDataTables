public enum Items{
    оргтехника("Оргтехника и расходники"),
    игры("Игры, приставки и программы"),
    животные("Другие животные"),
    мотоциклы("Мотоциклы и мототехника");

    public String value;

    public String getValue(Items item){
        return item.value;
    }
    Items(String value){
        this.value = value;
    }
}