#language: ru
@2
Функционал: Поиск на авито

  Структура сценария: Найдем самые дорогие принтеры на авито
    Пусть открыт ресурс авито
    И в выпадающем списке категорий выбрана "<Category>"
    И в поле поиска введено значение "<Input>"
    Тогда кликнуть по выпадающему списку региона
    Тогда в поле регион введено значение "<City>"
    И нажата кнопка показать объявления
    Тогда открылась страница рузельтаты по запросу "<Result>"
    И активирован чекбокс только с фотографией
    И в выпадающем списке сортировка выбрано значение "<Sort>"
    И в консоль выведено значение названия и цены <Amount> первых товаров

    Примеры:
      | Category                | Input   | City        | Result  | Sort   | Amount |
      | Оргтехника и расходники | принтер | Владивосток | принтер | Дороже | 3      |