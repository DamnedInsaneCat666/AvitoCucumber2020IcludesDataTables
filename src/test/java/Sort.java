public enum Sort {
    умолчание("По умолчанию"),
    дешевле("Дешевле"),
    дороже("Дороже"),
    дата("По дате");
    public String value;

    public String getValue(Sort sort){
        return sort.value;
    }
    Sort(String value){
        this.value = value;
    }
}
